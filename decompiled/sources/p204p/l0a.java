package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum l0a implements uzv {
    /* JADX INFO: Fake field, exist only in values array */
    LOW_POWER("low_power"),
    BALANCED("balanced"),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LATENCY("low_latency");


    /* JADX INFO: renamed from: a */
    public final String f128341a;

    l0a(String str) {
        this.f128341a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f128341a;
    }
}
