package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum phi0 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED(x09.f256832d),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_EXCLUSIVE("enabled_exclusive");


    /* JADX INFO: renamed from: a */
    public final String f177668a;

    phi0(String str) {
        this.f177668a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f177668a;
    }
}
