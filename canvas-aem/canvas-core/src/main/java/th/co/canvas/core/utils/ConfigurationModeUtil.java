package th.co.canvas.core.utils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by khoanguyen on 1/19/17.
 */
@Model(adaptables = SlingHttpServletRequest.class)
public class ConfigurationModeUtil {

    @Inject
    SlingHttpServletRequest request;

    private boolean enabled = false;

    @PostConstruct
    public void postConstruct() {
        if (request != null) {
            String configPageURI = request.getRequestURI();
            if (configPageURI != null) {
                enabled = configPageURI.contains("/conf");
            }
        }
    }

    public boolean isEnabled() {
        return enabled;
    }
}
