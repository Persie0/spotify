package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum f54 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_1("variant_1"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_2("variant_2");


    /* JADX INFO: renamed from: a */
    public final String f65932a;

    f54(String str) {
        this.f65932a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f65932a;
    }
}
