package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sbf1 {

    /* JADX INFO: renamed from: a */
    public final k9f1 f207468a;

    /* JADX INFO: renamed from: b */
    public final String f207469b;

    /* JADX INFO: renamed from: c */
    public final Object[] f207470c;

    /* JADX INFO: renamed from: d */
    public final int f207471d;

    public sbf1(k9f1 k9f1Var, String str, Object[] objArr) {
        this.f207468a = k9f1Var;
        this.f207469b = str;
        this.f207470c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f207471d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f207471d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m77731a() {
        int i = this.f207471d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
