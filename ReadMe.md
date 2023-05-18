# 学成在线-微服务架构（学习的主动性）

**客户端：用户、机构、运营端**

**核心功能模块：课程、学习**



## 面试

### 1、详细说说你的项目吧

从以下几个方面进行项目介绍:
1、项目的背景，包括:是自研还是外包、什么业务、服务的客户群是谁、谁去运营等问题。
2、项目的业务流程
3、项目的功能模块
4、项目的技术架构
5、个人工作职责
6、匿人负责模块的详细说明，包括模块的设计，所用到的技术，技术的实现方案等。一个例子:
我最近参与的项目是我们公司自研的专门针对成人职业技能教育的网络课堂系统，网站提供了成人职业技能培训的相关课程，
如:软件开发培训、职业资格证书培训、成人学历教育培训等课程。项目基于B2B2C的业务模式，培训机构可以在平台入驻、发布课程，
我们公司作为运营方由专门的人员对发布的课程进行审核，审核通过后课程才可以发布成功，课程包括免费和收费两种形式，
对于免费课程普通用户可以直接选课学习，对于收费课程在选课后需要支付成功才可以继续学习。
本项目包括三个端:用户端(学生端)、机构端、运营端。
核心模块包括:内容管理、媒资管理、课程搜索、订单支付、选课管理、认证授权等。
本项目采用前后端分离架构，后端采用SpringBoot.SpringCloud技术栈开发，数据库使用了MySQL，还使用的Redis、消息队列、
分布式文件系统、Elasticsearch等中间件系统。
划分的微服务包括:内容管理服务、媒资管理服务、搜索服务、订单支付服务、学习中心服务、系统管理服务、认证授权服务、
网关服务、注册中心服务、配置中心服务等。



## 开发

### 一、技术架构

- 前后端分离架构
- 层级分部
  - 用户层 H5、APP
  - CDN 内容分发
  - 负载层 负载均衡
  - UI层 页面
  - **微服务层** 
  - 数据层 数据库、缓存





## 坑坑
