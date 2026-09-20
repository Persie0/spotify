package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jch1 {

    /* JADX INFO: renamed from: a */
    public final r9h1 f111130a;

    /* JADX INFO: renamed from: b */
    public final String f111131b;

    /* JADX INFO: renamed from: c */
    public final Object[] f111132c;

    /* JADX INFO: renamed from: d */
    public final int f111133d;

    public jch1(r9h1 r9h1Var, String str, Object[] objArr) {
        this.f111130a = r9h1Var;
        this.f111131b = str;
        this.f111132c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f111133d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f111133d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m53007a() {
        int i = this.f111133d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
