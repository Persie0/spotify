package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xug1 {

    /* JADX INFO: renamed from: a */
    public final Object f266111a;

    /* JADX INFO: renamed from: b */
    public final Object f266112b;

    /* JADX INFO: renamed from: c */
    public final Object f266113c;

    public xug1(Object obj, Object obj2, Object obj3) {
        this.f266111a = obj;
        this.f266112b = obj2;
        this.f266113c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m92193a() {
        Object obj = this.f266111a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f266112b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f266113c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        klh.m56844p(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(klh.m56837i(sb, " and ", strValueOf3, "=", strValueOf4));
    }
}
