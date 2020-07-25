1,启动配置中心服务 8888

java -jar /Users/zhangxiao/eclipse-workspace/spring-cloud-cipher/target/spring-cloud-cipher-0.0.1-SNAPSHOT.jar

2，启动 eureka , 8761

又称服务中心，管理各种服务功能包括服务的注册、发现、熔断、负载、降级等。
任何一个服务都不能直接去掉用，都需要通过注册中心来调用。通过服务中心来获取服务你不需要关注你调用的项目IP地址，由几台服务器组成，每次直接去服务中心获取可以使用的服务去调用既可。
由于各种服务都注册到了服务中心，就有了很多高级功能条件。比如几台服务提供相同服务来做客户端负载均衡（Ribbon）；监控服务器调用成功率来做断路器（Hystrix），移除服务列表中的故障点；
监控服务调用时间来对不同的服务器设置不同的权重、智能路由（Zuul）等等。
Spring Cloud 封装了 Netflix 公司开发的 Eureka 模块来实现服务注册和发现。
Eureka 采用了 C-S 的设计架构。Eureka Server 作为服务注册功能的服务器，它是服务注册中心。而系统中的其他微服务，使用 Eureka 的客户端连接到 Eureka Server，并维持心跳连接。这样系统的维护人员就可以通过 Eureka Server 来监控系统中各个微服务是否正常运行。
Spring Cloud 的一些其他模块（比如Zuul）就可以通过 Eureka Server 来发现系统中的其他微服务，并执行相关的逻辑。
Eureka由两个组件组成：Eureka服务器和Eureka客户端。Eureka服务器用作服务注册服务器。Eureka客户端是一个java客户端，用来简化与服务器的交互、作为轮询负载均衡器，并提供服务的故障切换支持。
Netflix在其生产环境中使用的是另外的客户端，它提供基于流量、资源利用率以及出错状态的加权负载均衡。

java -jar /Users/zhangxiao/eclipse-workspace/spring-cloud-eureka/target/spring-cloud-eureka-0.0.1-SNAPSHOT.jar


3,启动 spring-cloud-config-client


java -jar /Users/zhangxiao/eclipse-workspace/spring-clound-config-client/target/spring-clound-config-client-0.0.1-SNAPSHOT.jar


org/apache/tomcat/util/net/SocketBufferHandler



