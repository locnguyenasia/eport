package modules;

import data.SearchContainerInformationData;
import libraries.SearchContainerInformationFunction;
import org.testng.annotations.Test;

public class SearchContainerInformationTest extends BaseTest {

    @Test(dataProvider = "SearchContainerInformationData", dataProviderClass = SearchContainerInformationData.class)
    public void sci001_SearchContainerInformation(String container){
        sci000_SearchContainerInformation(container);
    }

    @Test(dataProvider = "SearchContainerInformationData", dataProviderClass = SearchContainerInformationData.class)
    public void sci002_SearchContainerInformation(String container){
        sci000_SearchContainerInformation(container);
    }

    @Test(dataProvider = "SearchContainerInformationData", dataProviderClass = SearchContainerInformationData.class)
    public void sci003_SearchContainerInformation(String container){
        sci000_SearchContainerInformation(container);
    }

    @Test(dataProvider = "SearchContainerInformationData", dataProviderClass = SearchContainerInformationData.class)
    public void sci004_SearchContainerInformation(String container){
        sci000_SearchContainerInformation(container);
    }

    @Test(dataProvider = "SearchContainerInformationData", dataProviderClass = SearchContainerInformationData.class)
    public void sci005_SearchContainerInformation(String container){
        sci000_SearchContainerInformation(container);
    }

    public void sci000_SearchContainerInformation(String container){
        SearchContainerInformationFunction fnc = new SearchContainerInformationFunction();
        fnc.selectLink();
        fnc.fillForm(container);
        fnc.search();
    }
}
