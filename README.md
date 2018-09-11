# springcloud-config-demo
利用eureka-server构建高可用config-server release-1.2.0<br>

依次启动<br>
config-eureka-server  -p-8761<br>
config-server  -p-8769.8769<br>
config-client  -p-8762(配置文件中获取)<br>
工程<br>
打开浏览器访问：http://localhost:8762/hi
浏览器显示：foo version xixi
<br>
搭建高可用Config Server 
将Config Server 多实例部署，多次启动config-client工程，从控制台可以看出它会轮流从http://localhost:8769和http://localhost:8768的config server读取配置文件
