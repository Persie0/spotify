package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t5e implements wi5 {

    /* JADX INFO: renamed from: a */
    public final boolean f217282a;

    /* JADX INFO: renamed from: b */
    public final boolean f217283b;

    /* JADX INFO: renamed from: c */
    public final boolean f217284c;

    public t5e(boolean z, boolean z2, boolean z3) {
        this.f217282a = z;
        this.f217283b = z2;
        this.f217284c = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public final void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        int i2;
        ?? r0;
        int i3 = 0;
        boolean z = ko70Var == ko70.f124557b;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i - i4;
        if (i6 <= 0 || iArr.length <= 1) {
            if (i6 > 0 && iArr.length == 1) {
                iArr2[0] = (i - iArr[0]) / 2;
                return;
            }
            if (z) {
                int length = iArr.length;
                while (i3 < length) {
                    i -= iArr[i3];
                    iArr2[i3] = i;
                    i3++;
                }
                return;
            }
            int length2 = iArr.length;
            int i7 = 0;
            while (i3 < length2) {
                iArr2[i3] = i7;
                i7 += iArr[i3];
                i3++;
            }
            return;
        }
        boolean z2 = this.f217282a;
        int i8 = z2 ? 0 : -1;
        if (this.f217283b) {
            i2 = (z2 ? 1 : 0) + 1;
            r0 = z2;
        } else {
            i2 = z2 ? 1 : 0;
            r0 = -1;
        }
        int i9 = this.f217284c ? i2 : -1;
        int i10 = z ? i9 : i8 == true ? 1 : 0;
        if (!z) {
            i8 = i9;
        }
        if (i10 >= 0) {
            iArr2[i10] = 0;
        }
        if (r0 >= 0) {
            iArr2[r0] = (i - iArr[r0]) / 2;
        }
        if (i8 >= 0) {
            iArr2[i8] = i - iArr[i8];
        }
    }
}
