# globa-labs-academy

# O que é Spring

## Spring Framework

    + Complemento ao Java EE. Não é uma implmentação. Integração com algumas especificações  
    + Container de Inversão de Controle - Inversão de Controle (IoC)
    + Injeção de Dependência - injeção de dependência (DI): @Autowired
    + Spring Beans: @Bean: Um Objeto que será gerenciado pelo Container IoC
    + org.springframework.context.ApplicationContext: Representa IoC container e é responsavel instanciar, configurar e cosntruir esses beans.
    + 5.0.6
    + Programação Orientada a Aspectos do Spring (AOP)
    + Spring Web MVC
    + Spring WebFlux ^ 5.0
            - http://www.reactive-streams.org - SPEC ( https://github.com/reactive-streamsreactive-streams-jvm )
            
            + http://projectreactor.io - IMPL (Reactor é uma biblioteca Reactive Streams)
            + http://reactivex.io - IMPL ( https://github.com/ReactiveX/RxJava )
           
    + https://spring.io/projects/spring-framework#learn
    + https://docs.spring.io/spring/docs/current/spring-framework-reference/overview.html
    + https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html

## Spring Boot

    + Convenção sobre Configuração.
    + Auto configurações por padrão.
    + Pronto para Produção (você pode "simplesmente correr").
    + Não é um gerador de código.
    + Iniciadores de modulos plug-and-play
    + Tomcat, Jetty ou Undertow embedado
    + 2.0.3
            
            + https://spring.io/projects/spring-boot
            + https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/

## Spring Web MVC

    + MVC - Modelo, Visualização e Controlador

            + Ver = https://www.thymeleaf.org/

    + Start.io = Web e Thymeleaf
    
    + @Controlador
    + @Repositório
    + @Serviço
    + ModelAndView VS Model
    + EL $ {}