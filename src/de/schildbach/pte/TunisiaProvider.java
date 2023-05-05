package de.schildbach.pte;

import okhttp3.HttpUrl;


public class TunisiaProvider extends AbstractNavitiaProvider {
    private static final String API_REGION = "default";

    public TunisiaProvider(final HttpUrl apiBase) {
        super(NetworkId.TUNISIA, apiBase);
        setTimeZone("Africa/Tunis");
    }

    @Override
    public String region() {
        return API_REGION;
    }
}

