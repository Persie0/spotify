package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a2b0 {

    /* JADX INFO: renamed from: a */
    public int f11614a;

    /* JADX INFO: renamed from: b */
    public int f11615b;

    /* JADX INFO: renamed from: c */
    public int f11616c;

    /* JADX INFO: renamed from: d */
    public long[] f11617d;

    /* JADX INFO: renamed from: e */
    public int f11618e;

    public a2b0() {
        this(16);
    }

    /* JADX INFO: renamed from: a */
    public final void m24507a(long j) {
        int i = this.f11616c;
        long[] jArr = this.f11617d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.f11614a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.f11617d, 0, jArr2, i3, i2);
            this.f11614a = 0;
            this.f11615b = this.f11616c - 1;
            this.f11617d = jArr2;
            this.f11618e = length - 1;
        }
        int i4 = (this.f11615b + 1) & this.f11618e;
        this.f11615b = i4;
        this.f11617d[i4] = j;
        this.f11616c++;
    }

    /* JADX INFO: renamed from: b */
    public final long m24508b() {
        if (this.f11616c != 0) {
            return this.f11617d[this.f11614a];
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: c */
    public final long m24509c() {
        int i = this.f11616c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f11617d;
        int i2 = this.f11614a;
        long j = jArr[i2];
        this.f11614a = this.f11618e & (i2 + 1);
        this.f11616c = i - 1;
        return j;
    }

    public a2b0(int i) {
        c95.m31843i(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f11614a = 0;
        this.f11615b = -1;
        this.f11616c = 0;
        this.f11617d = new long[i];
        this.f11618e = i - 1;
    }
}
