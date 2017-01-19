package th.co.canvas.core.models;

import com.google.gson.Gson;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoanguyen on 1/19/17.
 */
@Model(adaptables = Resource.class)
public class MegaNavigationModel {

    private static Gson Gson = new Gson();

    @Inject
    private String label;

    @Inject
    private String[] tabs;

    public String getLabel() {
        return label;
    }

    public List<TabModel> getTabs() {
        List<TabModel> tabModels = new ArrayList<TabModel>();
        for (String tab : tabs) {
            TabModel tabModel = Gson.fromJson(tab, TabModel.class);
            tabModels.add(tabModel);
        }
        return tabModels;
    }

    public class TabModel {

        private String tabId;

        private String tabLabel;

        public String getTabId() {
            return tabId;
        }

        public void setTabId(String tabId) {
            this.tabId = tabId;
        }

        public String getTabLabel() {
            return tabLabel;
        }

        public void setTabLabel(String tabLabel) {
            this.tabLabel = tabLabel;
        }
    }
}
