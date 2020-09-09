package com.alibaba.csp.sentinel.dashboard.rule.zookeeper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.datasource.Converter;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: sentinel-parent
 * @author: liujianjun
 * @create: 2020-09-07 16:56
 **/

@Component("degradeRuleZookeeperProvider")
public class DegradeRuleZookeeperProvider implements DynamicRuleProvider<List<DegradeRuleEntity>> {

    @Autowired
    private CuratorFramework zkClient;
    @Autowired
    private Converter<String, List<DegradeRuleEntity>> converter;
    @Value("${degrade.ruleName}")
    private String degradeRule;

    @Override
    public List<DegradeRuleEntity> getRules(String appName) throws Exception {
        //这里添加的降级rule，限流需要同样修改
        String zkPath = ZookeeperConfigUtil.getPath(degradeRule, appName);
        Stat stat = zkClient.checkExists().forPath(zkPath);
        if (stat == null) {
            zkClient.create().creatingParentContainersIfNeeded().withMode(CreateMode.PERSISTENT).forPath(zkPath, null);
        }
        byte[] bytes = zkClient.getData().forPath(zkPath);
        if (null == bytes || bytes.length == 0) {
            return new ArrayList<>();
        }
        String s = new String(bytes);

        return converter.convert(s);
    }
}