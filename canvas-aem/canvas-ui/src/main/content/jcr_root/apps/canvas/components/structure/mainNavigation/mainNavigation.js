use(function () {
    var configPage = properties.get("configPage", "");

    if (configPage != "") {
        var configPageResourcePath = pageManager.getPage(configPage).getContentResource().getPath();
        var configPageResource = resolver.getResource(configPageResourcePath + "/root");

        return {
            configPageResource: configPageResource
        };
    }
});