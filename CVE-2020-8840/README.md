## 漏洞描述

jackson-databind是一套开源java高性能JSON处理器，受影响版本的jackson-databind中由于缺少某些xbean-reflect/JNDI黑名单类，如org.apache.xbean.propertyeditor.JndiConverter，可导致攻击者使用JNDI注入的方式实现远程代码执行，漏洞需要配合xbean-reflect-*.jar组件才能成功利用，影响面适中。

## 危害等级

CVE-2020-8840 中危

## 影响版本
   
- jackson-databind 2.9系列 < 2.9.10.3
   
- jackson-databind 2.8系列 < 2.8.11.5
   
- jackson-databind 低于2.8系列

## 安全版本

- jackson-databind 2.10系列 全版本

- jackson-databind 2.9系列 >= 2.9.10.3

- jackson-databind 2.8系列 >= 2.8.11.5

## 安全测试情况

![](./img/1.png)

![](img/2.png)

## 安全建议

以下任意一种方法均可实现漏洞修复

1. 针对使用到jackson-databind组件的web服务升级jackson-databind组件至安全版本：https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.10.3/

https://github.com/FasterXML/jackson-databind/releases

2. 针对无法升级jackson-databind的，排查并将xbean-reflect-*.jar组件从应用依赖中移除可阻止漏洞攻击（可能会导致应用不可用风险）

## 参考来源

 - [【漏洞预警】jackson-databind 反序列化远程代码执行漏洞（CVE-2020-8840）](https://help.aliyun.com/noticelist/articleid/1060239668.html)