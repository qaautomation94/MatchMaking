package Master;
import java.util.Iterator;
import java.util.logging.Level;

import java.util.concurrent.TimeUnit;


import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First
{
    public static void main(String[] args)
    {
        // simple page (without many resources so that the output is
        // easy to understand
        String url = "https://stage.beachbodyondemand.com/";

        DownloadPage(url);
    }

    private static void DownloadPage(String url)
    {
        ChromeDriver driver = null;

        try
        {
//        	System.setProperty("webdriver.chrome.verboseLogging", "true");
            ChromeOptions options = new ChromeOptions();
            
//            options.addArguments(
//            		   "--verbose"
//            		  );
            // add whatever extensions you need
            // for example I needed one of adding proxy, and one for blocking
            // images
            // options.addExtensions(new File(file, "proxy.zip"));
            // options.addExtensions(new File("extensions",
            // "Block-image_v1.1.crx"));
            LoggingPreferences logPrefs = new LoggingPreferences();
            //To get network log
            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
            options.setCapability( "goog:loggingPrefs", logPrefs );
            DesiredCapabilities capabilities = new DesiredCapabilities();
        	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        	options.merge(capabilities);
		     WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver(options);

            // navigate to the page
            System.out.println("Navigate to " + url);
            driver.navigate().to(url);

            // and capture the last recorded url (it may be a redirect, or the
            // original url)
            
            System.out.println("Current to " + url);
            try{
            	Thread.sleep(10000);
            	}
            	catch(InterruptedException ie){
            	}
            String currentURL = driver.getCurrentUrl();
            

            // then ask for all the performance logs from this request
            // one of them will contain the Network.responseReceived method
            // and we shall find the "last recorded url" response
            LogEntries logs = driver.manage().logs().get(LogType.PERFORMANCE);


            int status = -1;

            System.out.println("\nList of log entries:\n");

            for (Iterator<LogEntry> it = logs.iterator(); it.hasNext();)
            {
                LogEntry entry = it.next();

                try
                {
                    JSONObject json = new JSONObject(entry.getMessage());

//                    System.out.println(entry.getMessage());

                    JSONObject message = json.getJSONObject("message");
                    String method = message.getString("method");
 				

                    if (method != null
                            && "Network.requestWillBeSent".equals(method))
                    {
//                        JSONObject params = message.getJSONObject("params");
                        System.out.println(message);

//                        JSONObject response = params.getJSONObject("response");
//                        String messageUrl = response.getString("url");
//
//                        if (currentURL.equals(messageUrl))
//                        {
//                            status = response.getInt("status");
//
//                            System.out.println(
//                                    "---------- bingo !!!!!!!!!!!!!! returned response for "
//                                            + messageUrl + ": " + status);
//
//                            System.out.println(
//                                    "---------- bingo !!!!!!!!!!!!!! headers: "
//                                            + response.get("headers"));
//                        }
                    }
                } catch (JSONException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }finally
        {
            if (driver != null)
            {
                driver.quit();
            }
        }
    }
}