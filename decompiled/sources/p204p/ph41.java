package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ph41 {

    /* JADX INFO: renamed from: a */
    public final int f177470a;

    public ph41(int i) {
        this.f177470a = i;
        if (i > 0) {
            return;
        }
        pt40.m70891a("grid with no rows/columns");
    }

    /* JADX INFO: renamed from: a */
    public final int[] m69947a(int i, int i2) {
        int i3;
        int i4 = this.f177470a;
        int i5 = i - ((i4 - 1) * i2);
        int i6 = i5 / i4;
        int i7 = i5 % i4;
        int[] iArr = new int[i4];
        int i8 = 0;
        while (i8 < i4) {
            if (i6 < 0) {
                i3 = 0;
            } else {
                i3 = (i8 < i7 ? 1 : 0) + i6;
            }
            iArr[i8] = i3;
            i8++;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ph41) {
            return this.f177470a == ((ph41) obj).f177470a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f177470a;
    }
}
