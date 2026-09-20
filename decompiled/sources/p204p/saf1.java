package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class saf1 {

    /* JADX INFO: renamed from: a */
    public final Object f207200a;

    /* JADX INFO: renamed from: b */
    public final Object f207201b;

    /* JADX INFO: renamed from: c */
    public final Object f207202c;

    public saf1(Object obj, Object obj2, Object obj3) {
        this.f207200a = obj;
        this.f207201b = obj2;
        this.f207202c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m77622a() {
        Object obj = this.f207200a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f207201b);
        return new IllegalArgumentException(dq60.m36618r(edb.m38573v("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f207202c)));
    }
}
