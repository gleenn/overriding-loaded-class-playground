import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main(final String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		URL[] classUrls = {
			new URL("file:///Users/glenn/workspace/extra-class-playground/extension/")
		};
		URLClassLoader ucl = new URLClassLoader(classUrls);
		
		/////Class clazz = Thread.currentThread().getContextClassLoader().loadClass("ExtendedClass");
		Class clazz = ucl.loadClass("ExtendedClass");
    ((ExtendedClass) clazz.newInstance()).base();	
    ((ExtendedClass) clazz.newInstance()).newFunction();	
	}
}
