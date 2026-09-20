package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dbu0 implements doe0 {

    /* JADX INFO: renamed from: a */
    public final pre0 f47369a;

    /* JADX INFO: renamed from: b */
    public final String f47370b;

    /* JADX INFO: renamed from: c */
    public final Object[] f47371c;

    /* JADX INFO: renamed from: d */
    public final int f47372d;

    public dbu0(pre0 pre0Var, String str, Object[] objArr) {
        this.f47369a = pre0Var;
        this.f47370b = str;
        this.f47371c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f47372d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f47372d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p204p.doe0
    /* JADX INFO: renamed from: a */
    public final boolean mo35605a() {
        return (this.f47372d & 2) == 2;
    }

    @Override // p204p.doe0
    /* JADX INFO: renamed from: b */
    public final pre0 mo35606b() {
        return this.f47369a;
    }

    @Override // p204p.doe0
    /* JADX INFO: renamed from: c */
    public final int mo35607c() {
        int i = this.f47372d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
