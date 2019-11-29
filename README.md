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
`接口的registerBeanDefinitions方法导入导入bean`  
`@Import注解大量用于Springboot的自动装配`  
****
**refueltwo006-annotation01-factorybean01**