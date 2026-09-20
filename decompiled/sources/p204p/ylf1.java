package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ylf1 {

    /* JADX INFO: renamed from: a */
    public final Object f274009a;

    /* JADX INFO: renamed from: b */
    public final Object f274010b;

    /* JADX INFO: renamed from: c */
    public final Object f274011c;

    public ylf1(Object obj, Object obj2, Object obj3) {
        this.f274009a = obj;
        this.f274010b = obj2;
        this.f274011c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m94161a() {
        Object obj = this.f274009a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f274010b);
        return new IllegalArgumentException(dq60.m36618r(edb.m38573v("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f274011c)));
    }
}
