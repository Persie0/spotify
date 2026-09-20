package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum s74 implements uzv {
    DEFAULT("default"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRING("expiring"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED("expired");


    /* JADX INFO: renamed from: a */
    public final String f206272a;

    s74(String str) {
        this.f206272a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f206272a;
    }
}
