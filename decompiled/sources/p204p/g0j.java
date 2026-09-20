package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum g0j {
    f75375e(0, "CONNECTION_TYPE_UNKNOWN", "unknown", -1),
    f75376f(1, "CONNECTION_TYPE_NONE", "none", 0),
    f75377g(2, "CONNECTION_TYPE_GPRS", "gprs", 1),
    f75378h(3, "CONNECTION_TYPE_EDGE", "edge", 2),
    f75379i(4, "CONNECTION_TYPE_3G", "3g", 3),
    f75380t(5, "CONNECTION_TYPE_4G", "4g", 4),
    f75372X(6, "CONNECTION_TYPE_WLAN", "wlan", 5),
    f75373Y(7, "CONNECTION_TYPE_ETHERNET", "ethernet", 6),
    f75374Z(8, "CONNECTION_TYPE_COMPANION_PROXY", "companion_proxy", 7);


    /* JADX INFO: renamed from: a */
    public final int f75381a;

    /* JADX INFO: renamed from: b */
    public final boolean f75382b;

    /* JADX INFO: renamed from: c */
    public final boolean f75383c;

    /* JADX INFO: renamed from: d */
    public final String f75384d;

    g0j(int i, String str, String str2, int i2) {
        this.f75381a = i2;
        this.f75382b = z;
        this.f75383c = z;
        this.f75384d = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f75384d;
    }
}
