package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum qhi0 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_NO_NORMALIZATION("enabled_no_normalization"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_WITH_NORMALIZATION("enabled_with_normalization");


    /* JADX INFO: renamed from: a */
    public final String f188787a;

    qhi0(String str) {
        this.f188787a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f188787a;
    }
}
