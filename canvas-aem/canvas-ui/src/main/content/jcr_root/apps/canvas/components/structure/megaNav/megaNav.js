use(function () {
    var logoUrl = properties.get("logoUrl", "");
    var logoImage = properties.get("fileReference", "");

    if (logoUrl != "") {
        logoUrl = logoUrl + ".html";
    }

    return {
        logoImage: logoImage,
        logoUrl: logoUrl,
    };
});