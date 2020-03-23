### 漏洞描述

近日,亚信安全网络攻防实验室跟踪到 `jackson-databind` 更新了1个jndi注入的黑名单类.如果在项目包中存在该类的jar包且JDK版本满足注入版本,则可以使用JNDI注入的方式导致远程代码执行.该类为 `com.caucho.config.types.ResourceRef`.

漏洞编号：

- CVE-2020-10673
- Jackson内部编号2660

## 影响范围

- jackson-databind <= 2.10.3

- fastjson <= 1.2.66

##  修复建议

目前官方已发表修复补丁，可进入

<https://github.com/alibaba/fastjson/releases>

页面下载最新版本。

## 参考

- [【安全通报】Fastjson发布高危漏洞补丁](https://nosec.org/home/detail/4368.html)
- [【漏洞通告】CVE-2020-10673/jackson-databind JNDI注入导致远程代码执行](https://mp.weixin.qq.com/s/nKTd9I_EUzEqHOrpCqGVbQ)
