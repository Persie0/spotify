package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum rhi0 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_NO_NORMALIZATION("enabled_no_normalization"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_WITH_NORMALIZATION("enabled_with_normalization");


    /* JADX INFO: renamed from: a */
    public final String f199232a;

    rhi0(String str) {
        this.f199232a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m75515a() {
        return this.f199232a;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f199232a;
    }
}
