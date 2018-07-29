//package app;
//
//import com.gargoylesoftware.htmlunit.BrowserVersion;
//import com.gargoylesoftware.htmlunit.WebClient;
//import com.gargoylesoftware.htmlunit.html.HtmlPage;
//import http.HttpUtils;
//import okhttp3.FormBody;
//import okhttp3.Request;
//import org.apache.commons.logging.LogFactory;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.util.logging.Level;
//
//public class TesterQuanGuo {
//
//
//
//
//    @Test
//    public void testWebClient() {
//
//        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
//
//        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
//
//        java.util.logging.Logger.getLogger("org.apache.http.client").setLevel(Level.OFF);
//
//        String url = "http://deal.ggzy.gov.cn/ds/deal/dealList.jsp";
//
//        WebClient webClient = new WebClient(BrowserVersion.CHROME);
//        webClient.getOptions().setJavaScriptEnabled(true);
//        webClient.getOptions().setCssEnabled(false);
//        webClient.getOptions().setThrowExceptionOnScriptError(false);
//        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
//        webClient.getOptions().setUseInsecureSSL(true);
//        webClient.getOptions().setDownloadImages(false);
//
//
//        try {
//
////            webClient.waitForBackgroundJavaScript(2000);
//
//            for (int i = 1; i <= 20; i++) {
//
//                HtmlPage page = webClient.getPage(url);
//
//                String cookie = getCookieString(webClient);
//
//                System.out.println(cookie);
//
//                System.out.println("================================================================");
//
//                FormBody body = new FormBody.Builder()
//                        .add("TIMEBEGIN_SHOW", "2018-04-29")
//                        .add("TIMEEND_SHOW", "2018-07-29")
//                        .add("TIMEBEGIN", "2018-04-29")
//                        .add("TIMEEND", "2018-07-29")
//                        .add("DEAL_TIME", "04")
//                        .add("DEAL_CLASSIFY", "01")
//                        .add("DEAL_STAGE", "0101")
//                        .add("DEAL_PROVINCE", "120000")
//                        .add("DEAL_CITY", "0")
//                        .add("DEAL_PLATFORM", "0")
//                        .add("DEAL_TRADE", "0")
//                        .add("isShowAll", "1")
//                        .add("PAGENUMBER", i + "")
//                        .add("FINDTXT", "")
//                        .build();
//
//
//                okhttp3.Request request = new Request.Builder()
//                        .headers(HttpUtils.getCommonHeaders())
//                        .url(url)
//                        .post(body)
//                        .header("Cookie", getCookieString(webClient))
//                        .build();
//
//                HttpUtils.ResponseWrap responseWrap = HttpUtils.retryHttpNoProxy(request);
//
//                if (responseWrap.isSuccess()) {
//                    System.out.println("============== page = " + i + "==============");
//
//                    String responseBody = responseWrap.body;
//
//                    Document doc = Jsoup.parse(responseBody);
//
//                    Elements tenderElements = doc.select(".publicont");
//
//                    for (Element tenderEl : tenderElements) {
//                        String title = tenderEl.select("a").attr("title");
//
//                        String detailUrl = tenderEl.select("a").attr("href");
//
//                        System.out.println(title + " , " + detailUrl);
//
//                        getDetail(detailUrl, webClient);
//                    }
//                }
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            webClient.close();
//        }
//    }
//
//
//    private String getDetail(String url, WebClient webClient) {
//        url = url.replace("html/a", "html/b");
//
//
//        try {
//            webClient.getPage(url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        okhttp3.Request request = new Request.Builder()
//                .headers(HttpUtils.getCommonHeaders())
//                .url(url)
//                .header("Cookie", getCookieString(webClient))
//                .build();
//
//        HttpUtils.ResponseWrap responseWrap = HttpUtils.retryHttpNoProxy(request);
//
//        if (responseWrap.isSuccess()) {
//            System.out.println(url);
//            System.out.println(responseWrap.body);
//        }
//
//
//        return "";
//    }
//
//}
