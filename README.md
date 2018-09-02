						jcutils -- for developer
#Explanation

jcutils==》java common utils

#Purpose

在日常开发中，出现频率比较高的一些场景，收集并规整起来，便于后期开发和大家共享使用，这样不但可以使代码更加简洁，而且使代码更具有可读性，如果有错误的地方，望大家及时指正，共勉。

#Time:2018-09-02

1.项目架子搭起

2.日志管理:使用slf4j，通log4j来管理日志，添加slf4j的jar和log4j-slf4j关联的jar即可

3.因为没有写log4j的加载路径，所以配置文件一定要建在mav创建的项目的根目录下，中间不可有其他文件夹或包，否则不生效

4.加入TestNG & Mockito测试框架支持，使写出来的工具类更加健壮
