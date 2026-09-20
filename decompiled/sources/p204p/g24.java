package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum g24 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTES1_DEBUG_ONLY("minutes1DebugOnly"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS3("hours3"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS6("hours6"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS12("hours12"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS24("hours24");


    /* JADX INFO: renamed from: a */
    public final String f75829a;

    g24(String str) {
        this.f75829a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f75829a;
    }
}
