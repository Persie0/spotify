package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ytf1 {

    /* JADX INFO: renamed from: a */
    public final vaf1 f276115a;

    /* JADX INFO: renamed from: b */
    public final String f276116b;

    /* JADX INFO: renamed from: c */
    public final Object[] f276117c;

    /* JADX INFO: renamed from: d */
    public final int f276118d;

    public ytf1(qlf1 qlf1Var, String str, Object[] objArr) {
        this.f276115a = qlf1Var;
        this.f276116b = str;
        this.f276117c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f276118d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f276118d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
