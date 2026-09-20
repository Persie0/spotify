package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hrb0 {

    /* JADX INFO: renamed from: a */
    public int[] f94389a;

    /* JADX INFO: renamed from: b */
    public int f94390b;

    /* JADX INFO: renamed from: c */
    public float[] f94391c;

    public hrb0(int[] iArr) {
        this.f94389a = iArr;
        int iM52868d = jb5.m52868d(iArr);
        this.f94390b = iM52868d;
        this.f94391c = new float[iM52868d];
    }

    /* JADX INFO: renamed from: a */
    public final float[] m48381a() {
        return this.f94391c;
    }

    /* JADX INFO: renamed from: b */
    public final int m48382b(int i) {
        return this.f94389a[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m48383c() {
        return this.f94389a.length;
    }

    /* JADX INFO: renamed from: d */
    public final void m48384d(int[] iArr) {
        this.f94389a = iArr;
        int iM52868d = jb5.m52868d(iArr);
        float[] fArr = new float[iM52868d];
        System.arraycopy(this.f94391c, 0, fArr, 0, Math.min(this.f94390b, iM52868d));
        this.f94391c = fArr;
        this.f94390b = iM52868d;
    }
}
