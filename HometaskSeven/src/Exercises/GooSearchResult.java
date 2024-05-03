package Exercises;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Arrays;

public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public String parseDomain(){
        int firstIndex = url.indexOf('/') + 1;
        int lastIndex = url.lastIndexOf('/');

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            return null;
        }
        return url.substring(firstIndex + 1, lastIndex);
    }

    public String parseDomainTwo() {
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex == -1) {
            return null; // Invalid URL
        }
        int domainStartIndex = protocolEndIndex + 3; // Skip past "://"
        int domainEndIndex = url.indexOf('/', domainStartIndex);
        if (domainEndIndex == -1) {
            domainEndIndex = url.length(); // If there's no trailing '/', the domain goes to the end of the string
        }
        return url.substring(domainStartIndex, domainEndIndex);
    }

    public String parseDomainThree() {
        URL newUrl = null;
        try {
            newUrl = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        String domain = newUrl.getHost();
        return domain;
    }

    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        //https://rock.festival.com/?q=nearest
        System.out.println(new GooSearchResult("https://rock.festival.com/?q=nearest").parseDomain());

        //http://mountain.alps.com/resorts
        System.out.println(new GooSearchResult("https://mountain.alps.com/resorts/").parseDomain());

        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomainTwo());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomainTwo());

        //https://rock.festival.com/?q=nearest
        System.out.println(new GooSearchResult("https://rock.festival.com/?q=nearest").parseDomainTwo());

        //http://mountain.alps.com/resorts
        System.out.println(new GooSearchResult("https://mountain.alps.com/resorts").parseDomainTwo());

        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomainThree());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomainThree());

        //https://rock.festival.com/?q=nearest
        System.out.println(new GooSearchResult("https://rock.festival.com/?q=nearest").parseDomainThree());

        //http://mountain.alps.com/resorts
        System.out.println(new GooSearchResult("https://mountain.alps.com/resorts").parseDomainThree());

    }
}

