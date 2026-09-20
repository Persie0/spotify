package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dj5 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final char[] f49561a;

    /* JADX INFO: renamed from: b */
    public int f49562b;

    public dj5(char[] cArr) {
        this.f49561a = cArr;
        this.f49562b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f49561a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f49562b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int iMin = Math.min(i2, this.f49562b);
        char[] cArr = this.f49561a;
        bga.m29091m(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f49562b;
        int iMin = Math.min(i, i);
        char[] cArr = this.f49561a;
        bga.m29091m(0, iMin, cArr.length);
        return new String(cArr, 0, iMin);
    }
}
