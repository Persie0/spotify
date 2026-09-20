package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum va4 implements uzv {
    ENABLED(x09.f256832d),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED(x09.f256833e),
    FORCED("forced");


    /* JADX INFO: renamed from: a */
    public final String f239117a;

    va4(String str) {
        this.f239117a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f239117a;
    }
}
