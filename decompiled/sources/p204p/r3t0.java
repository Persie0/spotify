package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum r3t0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: a */
    public final String f195574a;

    r3t0(String str) {
        this.f195574a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f195574a;
    }
}
