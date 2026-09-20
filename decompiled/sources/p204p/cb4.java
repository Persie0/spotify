package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum cb4 implements uzv {
    /* JADX INFO: Fake field, exist only in values array */
    IMMEDIATE("immediate"),
    /* JADX INFO: Fake field, exist only in values array */
    THINK1("think1"),
    ACKNOWLEDGE("acknowledge"),
    /* JADX INFO: Fake field, exist only in values array */
    THINK2("think2"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY("play"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");


    /* JADX INFO: renamed from: a */
    public final String f36005a;

    cb4(String str) {
        this.f36005a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f36005a;
    }
}
