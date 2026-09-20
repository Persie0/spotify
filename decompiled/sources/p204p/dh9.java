package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dh9 implements Cloneable {

    /* JADX INFO: renamed from: b */
    public int f49021b = 0;

    /* JADX INFO: renamed from: a */
    public int[] f49020a = new int[1];

    /* JADX INFO: renamed from: b */
    public final void m35999b(boolean z) {
        m36001d(this.f49021b + 1);
        if (z) {
            int[] iArr = this.f49020a;
            int i = this.f49021b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f49021b++;
    }

    /* JADX INFO: renamed from: c */
    public final void m36000c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m36001d(this.f49021b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m35999b(z);
            i2--;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f49020a.clone();
        int i = this.f49021b;
        dh9 dh9Var = new dh9();
        dh9Var.f49020a = iArr;
        dh9Var.f49021b = i;
        return dh9Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m36001d(int i) {
        int[] iArr = this.f49020a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f49020a = iArr2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36002e(int i) {
        return ((1 << (i & 31)) & this.f49020a[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dh9)) {
            return false;
        }
        dh9 dh9Var = (dh9) obj;
        return this.f49021b == dh9Var.f49021b && Arrays.equals(this.f49020a, dh9Var.f49020a);
    }

    /* JADX INFO: renamed from: g */
    public final int m36003g() {
        return (this.f49021b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49020a) + (this.f49021b * 31);
    }

    public final String toString() {
        int i = this.f49021b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f49021b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m36002e(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
