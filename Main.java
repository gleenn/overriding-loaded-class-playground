import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main(final String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		URL[] classUrls = { new URL("file:///Users/glenn/workspace/overriding-loaded-class-playground/extension/") };
		URL[] classUrls2 = { new URL("file:///Users/glenn/workspace/overriding-loaded-class-playground/extension2/") };

		URLClassLoader ucl = new URLClassLoader(classUrls);
		URLClassLoader ucl2 = new URLClassLoader(classUrls2);
		
		/////Class clazz = Thread.currentThread().getContextClassLoader().loadClass("ExtendedClass");
		Class clazz = ucl.loadClass("ExtendedClass");
		Class clazz2 = ucl2.loadClass("ExtendedClass");

    ((BaseClass) clazz.newInstance()).base();	
    ((BaseClass) clazz2.newInstance()).base();	
	}
}
