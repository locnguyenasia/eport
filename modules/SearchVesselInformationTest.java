package modules;

import datasets.SearchVesselInformationData;
import libraries.SearchVesselInformationFunction;
import org.testng.annotations.Test;

public class SearchVesselInformationTest extends BaseTest {

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi001_SearchVesselInformation(String vessel) { svi000_SearchVesselInformation(vessel); }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi002_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi003_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi004_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi005_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi006_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    @Test(dataProvider = "SearchVesselInformationData", dataProviderClass = SearchVesselInformationData.class)
    public void svi007_SearchVesselInformation(String vessel){
        svi000_SearchVesselInformation(vessel);
    }

    public void svi000_SearchVesselInformation(String vessel){
        SearchVesselInformationFunction fnc = new SearchVesselInformationFunction();
        fnc.selectLink();
        fnc.fillForm(vessel);
        fnc.search();
    }
}
