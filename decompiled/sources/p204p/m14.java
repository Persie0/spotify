package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum m14 implements uzv {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    WARNING("warning"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("error");


    /* JADX INFO: renamed from: a */
    public final String f138840a;

    m14(String str) {
        this.f138840a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f138840a;
    }
}
