package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class t9g1 {

    /* JADX INFO: renamed from: a */
    public final sxf1 f218294a;

    /* JADX INFO: renamed from: b */
    public final String f218295b;

    /* JADX INFO: renamed from: c */
    public final Object[] f218296c;

    /* JADX INFO: renamed from: d */
    public final int f218297d;

    public t9g1(sxf1 sxf1Var, String str, Object[] objArr) {
        this.f218294a = sxf1Var;
        this.f218295b = str;
        this.f218296c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f218297d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f218297d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m80310a() {
        int i = this.f218297d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
