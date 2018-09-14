# springcloud-config-demo
spring cloud bus demo
* 本地准备RabbitMQ 并启动，端口5672
* 依次启动工程config-eureka-server -p-8761
*  config-server -p-8768
*  config-client -p-8792 -p-8763(部署两个实例)

* 启动成功之后，访问http://localhost:8763/hi和http://localhost:8762/hi<br>
可以看到从git上获取到的config-client-dev配置文件中foo变量的值
* 手动修改远程git仓库foo变量的值，并调用post请求http://localhost:8762/bus/refresh或http://localhost:8763/bus/refresh
<br>再去访问http://localhost:8763/hi和http://localhost:8762/hi可以看到foo的新值