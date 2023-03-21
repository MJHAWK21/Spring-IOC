package USTBATCHNO3.Spring_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson2.JSONReader.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	sim s= context.getBean(sim.class);
    	s.calling();
    	s.dialing();
    			}
}
