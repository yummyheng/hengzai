package com.yummy.first;

import java.util.AbstractMap.SimpleEntry;
import java.util.regex.Pattern;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

public class GuavaTest {
	Optional<Integer> possiable = Optional.of(5);
	
	public static String ATOM = "[a-z0-9!#$%&'*+/=?^_`{|}~-]";
	public static String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)*";
	public static String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";
	public static Pattern pattern = Pattern.compile("^" + ATOM + "+(\\." + ATOM + "+)*@" + DOMAIN + "|" + IP_DOMAIN + ")$", 2);
	
	public static void main(String args[]) {
		try {
			List<String> list = Lists.newArrayList("a", "b", "c", "d");
			System.out.println(Preconditions.checkNotNull("123"));
//		Preconditions.checkArgument(-1.0 > 0.0, "speed (%s) must be positive", -1.0);
			
			Function<SimpleEntry<Double, Double>, Double> power
			= new Function<SimpleEntry<Double, Double>, Double>() {
			    public Double apply(SimpleEntry<Double, Double> input) {
			        return Math.pow(input.getKey(), input.getValue());
			    }
			};
			System.out.println(power.apply(new SimpleEntry<Double, Double>(3.0, 2.0)));
			
//			TestBeanFather testing1 = new TestBeanFather();
//			TestBeanFather testing2 = new TestBeanFather();
//			testing1.setName("yummyheng");
//			testing2.setName("yummyheng");
//			testing1.setAge(13);
//			testing1.setAge(14);
//			PropertyDescriptor pd = new PropertyDescriptor("name",  
//					testing1.getClass());  
//			Method getMethod = pd.getReadMethod();//获得get方法  
//			Object o = getMethod.invoke(testing1);//执行get方法返回一个Object  
//			System.out.println(o); 
//			System.out.println(getMethod.); 
//		Objects.toStringHelper(testing).omitNullValues()
//		.add("name", testing.getName())
//		.add("age", 13);
//		System.out.println(Objects.toStringHelper(testing).omitNullValues()
//				.add("name", testing.getName())
//				.add("age", 13));
//		System.out.println(Objects.toStringHelper(testing).add("value", testing.getName()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		String mails = "286377797@qq.com";
		System.out.println("test");
		//20160409 因为要支持多个邮箱 所以原来的校验不适用
        if (StringUtils.isEmpty(mails) /**|| !EmailValidator.getInstance().isValid(mails[i]) **/) {
        	System.out.println("false");
        } else {
        	if(mails.contains(":")) {
            	String[] mailArray = mails.split(":");
            	for(String mail : mailArray) {
            		if(!pattern.matcher(mail).matches()) {
            			System.out.println("false");
            		}
            	}
            } else {
            	if(!pattern.matcher(mails).matches()) {
            		System.out.println("false");
        		}
            }
        }
	}
	
	
}
