package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class drc1 {

    /* JADX INFO: renamed from: f */
    public static final long f52290f;

    /* JADX INFO: renamed from: g */
    public static final long f52291g;

    /* JADX INFO: renamed from: h */
    public static final long f52292h;

    /* JADX INFO: renamed from: i */
    public static final drc1 f52293i;

    /* JADX INFO: renamed from: a */
    public final String f52294a;

    /* JADX INFO: renamed from: b */
    public final String f52295b;

    /* JADX INFO: renamed from: c */
    public final int f52296c;

    /* JADX INFO: renamed from: d */
    public final int f52297d;

    /* JADX INFO: renamed from: e */
    public final int f52298e;

    static {
        gfp gfpVar = leu.f132721a;
        x4b x4bVar = iiu.f102631a;
        diu diuVar = (diu) x4bVar.f258037b;
        long j = diuVar.f49478c;
        f52290f = j;
        long j2 = ((giu) x4bVar.f258039d).f80259c;
        f52291g = j2;
        long j3 = diuVar.f49477b;
        f52292h = j3;
        f52293i = new drc1(null, null, rfg1.m75429D(j2), rfg1.m75429D(j), rfg1.m75429D(j3));
    }

    public drc1(String str, String str2, int i, int i2, int i3) {
        this.f52294a = str;
        this.f52295b = str2;
        this.f52296c = i;
        this.f52297d = i2;
        this.f52298e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drc1)) {
            return false;
        }
        drc1 drc1Var = (drc1) obj;
        return wj50.m88271j(this.f52294a, drc1Var.f52294a) && wj50.m88271j(this.f52295b, drc1Var.f52295b) && this.f52296c == drc1Var.f52296c && this.f52297d == drc1Var.f52297d && this.f52298e == drc1Var.f52298e;
    }

    public final int hashCode() {
        String str = this.f52294a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52295b;
        return Integer.hashCode(this.f52298e) + mt60.m62800g(this.f52297d, mt60.m62800g(this.f52296c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }
}
