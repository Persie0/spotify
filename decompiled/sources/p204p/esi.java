package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum esi implements uzv {
    DEVICES("devices"),
    /* JADX INFO: Fake field, exist only in values array */
    CAST("cast"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT("connect");


    /* JADX INFO: renamed from: a */
    public final String f62411a;

    esi(String str) {
        this.f62411a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m39914a() {
        return this.f62411a;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f62411a;
    }
}
