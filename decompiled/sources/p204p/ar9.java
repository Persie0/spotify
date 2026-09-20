package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ar9 {

    /* JADX INFO: renamed from: a */
    public int f18979a;

    /* JADX INFO: renamed from: b */
    public int f18980b;

    /* JADX INFO: renamed from: c */
    public int f18981c;

    /* JADX INFO: renamed from: d */
    public Object f18982d;

    public ar9(AbstractC2601y5... abstractC2601y5Arr) {
        this.f18979a = -1;
        this.f18980b = -1;
        this.f18981c = 0;
        this.f18982d = abstractC2601y5Arr;
    }

    /* JADX INFO: renamed from: a */
    public void m26919a(int i) {
        int[] iArr = (int[]) this.f18982d;
        int i2 = this.f18980b;
        iArr[i2] = i;
        int i3 = this.f18981c & (i2 + 1);
        this.f18980b = i3;
        int i4 = this.f18979a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.f18982d, 0, iArr2, i5, this.f18979a);
            this.f18982d = iArr2;
            this.f18979a = 0;
            this.f18980b = length;
            this.f18981c = i6 - 1;
        }
    }

    public ar9() {
        this.f18981c = 7;
        this.f18982d = new int[8];
    }
}
