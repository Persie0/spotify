package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class fh9 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final int f69610a;

    /* JADX INFO: renamed from: b */
    public final int f69611b;

    /* JADX INFO: renamed from: c */
    public final int f69612c;

    /* JADX INFO: renamed from: d */
    public final int[] f69613d;

    public fh9(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f69610a = i;
        this.f69611b = i2;
        int i3 = (i + 31) / 32;
        this.f69612c = i3;
        this.f69613d = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41650b(int i, int i2) {
        return ((this.f69613d[(i / 32) + (i2 * this.f69612c)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m41651c(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f69612c);
        int[] iArr = this.f69613d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final Object clone() {
        return new fh9(this.f69610a, this.f69611b, this.f69612c, (int[]) this.f69613d.clone());
    }

    /* JADX INFO: renamed from: d */
    public final void m41652d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f69611b || i5 > this.f69610a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f69612c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int i9 = (i8 / 32) + i7;
                int[] iArr = this.f69613d;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fh9)) {
            return false;
        }
        fh9 fh9Var = (fh9) obj;
        return this.f69610a == fh9Var.f69610a && this.f69611b == fh9Var.f69611b && this.f69612c == fh9Var.f69612c && Arrays.equals(this.f69613d, fh9Var.f69613d);
    }

    public final int hashCode() {
        int i = this.f69610a;
        return Arrays.hashCode(this.f69613d) + (((((((i * 31) + i) * 31) + this.f69611b) * 31) + this.f69612c) * 31);
    }

    public final String toString() {
        int i = this.f69610a;
        int i2 = this.f69611b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sb.append(m41650b(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public fh9(int i, int i2, int i3, int[] iArr) {
        this.f69610a = i;
        this.f69611b = i2;
        this.f69612c = i3;
        this.f69613d = iArr;
    }
}
