package p204p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class sbc0 {

    /* JADX INFO: renamed from: a */
    public static final Object f207418a;

    static {
        pqm0 pqm0Var = new pqm0("CATALOGUE_RESTRICTED", ahw.ERROR_CATALOGUE_RESTRICTED);
        pqm0 pqm0Var2 = new pqm0("COUNTRY_RESTRICTED", ahw.ERROR_COUNTRY_RESTRICTED);
        ahw ahwVar = ahw.ERROR_GEORESTRICTED;
        f207418a = kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("geoLocation", ahwVar), new pqm0("GEO_RESTRICTED", ahwVar), new pqm0("MANIFEST_DELETED", ahw.ERROR_MANIFEST_DELETED), new pqm0("UNAVAILABLE", ahw.ERROR_UNAVAILABLE), new pqm0("UNSUPPORTED_CLIENT_VERSION", ahw.ERROR_UNSUPPORTED_CLIENT_VERSION), new pqm0("UNSUPPORTED_PLATFORM_VERSION", ahw.ERROR_UNSUPPORTED_PLATFORM_VERSION));
    }
}
