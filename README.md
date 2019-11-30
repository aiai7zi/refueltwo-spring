**refueltwo001-annotation01-configuration01** `是注解@configuration应用,也是@Component注解`
****
**refueltwo002-annotation01-componentscan01**
`includeFilters:包含   excludeFilters:排除`  
`useDefaultFilters:是否自动扫描：@Component @Repository@Service@Controller注解`  
`com.refueltwo.main.filtertype.RefuelTypeFilter：类是自定义扫描   metadata：元信息`  
****
**refueltwo003-annotation01-scope01**  
`@Scope的取值： singleton 单例的（默认）(默认懒汉式加载)  prototype 多列(默认懒汉式加载) request 同一次请求 session 同一次会话`   
`@Lazy 这注解是懒加载，懒加载是创建ioc容器不加载，使用载加载，`
`new AnnotationConfigApplicationContext()就已经创建了容器` 
****
**refueltwo004-annotation01-condition01**   
`@Condition注解xml中没有，springboot中大量使用，用于加载实现condition接口的注解`  
`作用在@Baen注解的方法上，判断bean是否加载`
****
**refueltwo005-annotation01-import01**  
`@Import注解是往ioc容器中的加入bean的4种方式之一 `
`其他3种：2.@Bean  3.ImportSelector接口 4.@ComponentScan加@Controller @Component @Servier`
`@Import注解可通过.class文件直接导入(@Import(value = {Person.class, Animal.class}))，`  
`也可以：实现ImportSelector接口的selectImports方法和实现ImportBeanDefinitionRegistrar`  
`接口的registerBeanDefinitions方法导入bean`  
`@Import注解大量用于Springboot的自动装配`  
****
**refueltwo006-annotation01-factorybean01**  
`实现FactoryBean接口的方法返回的不是自己本身`  
`是getObject()返回的对象，如需获取他本身加&（app.getBean("&refuelBean")）`
`主要用于接口的注册（如驱动注册），因为会调用getObject()返回需要的对象，对驱动很好的保护，这样的接口也暴露了` 
****
**refueltwo007-annotation01-beanlifecycle01**   
`bean的生命周期：只要单例是ioc容器控制bean的生命周期，多列GC控制`  
`1.直接指定 @Bean(value = "cat",initMethod = "init",destroyMethod = "destroy")`  
`2.后置处理器：实现BeanPostProcessor接口重新2个默认的方法，注册到容器就可以了，后置处理器会拦截所有的Bean`  
`3.js250方法：在要初始化类的方法上加@PostConstruct注解(初始化)`  
` @PreDestroy注解（销毁）`  
`4.实现InitializingBean, DisposableBean接口中2个创建和销毁方法`
****
**refueltwo008-annotation01-value01**  
`@Value注解是注入属性值（@PropertySource(value = {"classpath:person.properties"})），支持什么表达式（忘记了）` 
**** 
**refueltwo009-annotation01-autowired01**   
`@Autowired 自动注入  @Qualifier("goodsMapper")@Autowired一起使用`  
`@Bean(value = "orderService",autowire = Autowire.BY_TYPE): 可以根据type注入`  
`@AutoWired使用的时byName还是byType(默认是使用byType,当发现多个类型的bean话 就通过byName)`  
`@Primary标了这个注解会优先加载`  
`@AutoWired可以标注set方法上，标注在构造方法上，方法入参上`
****
**refueltwo010-annotation01-profile01**  
` app.getEnvironment().setActiveProfiles("test"):设置环境`  
` @Profile("dev")：加入哪个环境`  
`通过运行时jvm参数来切换-Dspring.profiles.active=test|dev|prod`  
`配置文件实现public class RefuelConfig implements EmbeddedValueResolverAware 传入环境信息`

****
`@Configuration把一个类作为一个IoC容器，它的某个方法头上如果注册了@Bean，就会作为这个Spring容器中的Bean。 `  
`@Scope注解 作用域 `  
`@Lazy(true) 表示延迟初始化 `  
`@Service用于标注业务层组件、`   
`@Controller用于标注控制层组件（如struts中的action） `  
`@Repository用于标注数据访问组件，即DAO组件。 `  
`@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。 `  
`@Scope用于指定scope作用域的（用在类上） `  
`@PostConstruct用于指定初始化方法（用在方法上） `  
`@PreDestory用于指定销毁方法（用在方法上） `  
`@Resource 默认按名称装配，当找不到与名称匹配的bean才会按类型装配。`   
`@DependsOn：定义Bean初始化及销毁时的顺序 `  
`@Primary：自动装配时当出现多个Bean候选者时，被注解为@Primary的Bean将作为首选者，否则将抛出异常 `  
`@Autowired 默认按类型装配，如果我们想使用按名称装配，可以结合@Qualifier注解一起使用 `  
`@Autowired @Qualifier(“personDaoBean”) 存在多个实例配合使用`  
