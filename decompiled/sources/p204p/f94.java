package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum f94 implements uzv {
    LOW("low"),
    MID("mid"),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH("high");


    /* JADX INFO: renamed from: a */
    public final String f67171a;

    f94(String str) {
        this.f67171a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f67171a;
    }
}
