/**
 * 
 */
/**
 * @author Administrator
 *
 */
module ioc {

    exports com.ust.ioc;
	requires spring.core;
	requires spring.beans;
	exports com.ust.ioc2;
	requires java.sql;
	requires spring.context;
	exports com.ust.iocautowiring;
	exports com.ust.javaconfig;
	requires java.annotation;
	opens com.ust.javaconfig to spring.core;
	
}