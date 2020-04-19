JAVA 漏洞调试项目，主要为复现、调试java相关的漏洞。

## 说明

*本仓库仅为JAVA漏洞复现以及安全测试研究，禁止通过该项目发起网络攻击，如被发现后果自负。*

## 仓库代码

| 项目代码 | CVE编号  | 说明 |
|:--------|:-------|------|
| [CVE-2020-2915](./CVE-2020-2915) | [CVE-2020-2915](./CVE-2020-2915) | Oracle Coherence存在MVEL表达式注入漏洞，受此漏洞影响的版本包括3.7.1.0、12.1.3.0.0、12.2.1.3.0和12.2.1.4.0。 |
| [CVE-2019-17571](./CVE-2019-17571) | [CVE-2019-17571](./CVE-2019-17571) |  |
| [CVE-2020-2801](./CVE-2020-2801) | [CVE-2020-2801](./CVE-2020-2801) |  |
| [CVE-2020-2883](./CVE-2020-2883) | [CVE-2020-2883](./CVE-2020-2883) | CVE-2020-2555 绕过，Oracle Coherence |
| [CVE-2020-2884](./CVE-2020-2884) | [CVE-2020-2884](./CVE-2020-2884) |  |
|[CVE-2020-2551)](./cve-2020-2551)|[CVE-2020-2551](https://www.oracle.com/security-alerts/cpujan2020.html)|通过 IIOP 协议序列化 Jta，攻击者可利用该漏洞在未经授权下通过构造 IIOP 协议请求。|
|[CVE-2020-2555](./CVE-2020-2555)|[CVE-2020-2555](https://www.oracle.com/security-alerts/cpujan2020.html)|Oracle Fusion中间件 Oracle Coherence 存在缺陷，攻击者可利用该漏洞在未经授权下通过构造T3协议请求|
|[CVE-2020-8840)](./CVE-2020-8840)|[CVE-2020-8840](https://nvd.nist.gov/vuln/detail/CVE-2020-8840)|jackson-databind是一套开源java高性能JSON处理器，受影响版本的jackson-databind中由于缺少某些xbean-reflect/JNDI黑名单类，如org.apache.xbean.propertyeditor.JndiConverter，可导致攻击者使用JNDI注入的方式实现远程代码执行，漏洞需要配合xbean-reflect-*.jar组件才能成功利用，影响面适中。|
|[CVE-2020-10673](./CVE-2020-10673)|[CVE-2020-10673](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-10673)|`com.caucho.config.types.ResourceRef` 未被过滤导致 RCE |
