JAVA 漏洞调试项目，主要为复现、调试java相关的漏洞。

## 说明

*本仓库仅为JAVA漏洞复现以及安全测试研究，禁止通过该项目发起网络攻击，如被发现后果自负。*

## 仓库代码

| 项目代码 | CVE编号  | 说明 |
|:-------:|:------:|:----:|
|[CVE-2020-2551)](./cve-2020-2551)|[CVE-2020-2551](https://www.oracle.com/security-alerts/cpujan2020.html)|攻击者可以通过IIOP 协议远程访问 WeblogicServer服务器上的远程接口，传入恶意数据，从而获取服务器权限并在未授权情况下远程执行任意代码。官方给出的CVSS评分为 9.8。IIOP 协议以 Java接口的形式对远程对象进行访问，默认启用。|
|[CVE-2020-2555](./CVE-2020-2555)|[CVE-2020-2551](https://www.oracle.com/security-alerts/cpujan2020.html)|Oracle Fusion中间件 Oracle Coherence 存在缺陷，攻击者可利用该漏洞在未经授权下通过构造T3协议请求|
|[CVE-2020-8840)](./CVE-2020-8840)|[CVE-2020-8840](https://nvd.nist.gov/vuln/detail/CVE-2020-8840)|jackson-databind是一套开源java高性能JSON处理器，受影响版本的jackson-databind中由于缺少某些xbean-reflect/JNDI黑名单类，如org.apache.xbean.propertyeditor.JndiConverter，可导致攻击者使用JNDI注入的方式实现远程代码执行，漏洞需要配合xbean-reflect-*.jar组件才能成功利用，影响面适中。|
|[CVE-2020-10673](./CVE-2020-10673)|[CVE-2020-10673](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-10673)|`com.caucho.config.types.ResourceRef` 未被过滤导致 RCE |
