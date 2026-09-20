package p204p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class if40 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final if40 f101645c = new if40(new int[0], 0);

    /* JADX INFO: renamed from: a */
    public final int[] f101646a;

    /* JADX INFO: renamed from: b */
    public final int f101647b;

    public if40(int[] iArr, int i) {
        this.f101646a = iArr;
        this.f101647b = i;
    }

    /* JADX INFO: renamed from: c */
    public static if40 m50414c(int i, int i2) {
        return new if40(new int[]{i, i2}, 2);
    }

    /* JADX INFO: renamed from: d */
    public static if40 m50415d(int... iArr) {
        c95.m31844j(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new if40(iArr2, length);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final boolean m50416a(int i) {
        int i2 = 0;
        while (i2 < this.f101647b) {
            if (this.f101646a[i2] == i) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m50417b(int i) {
        c95.m31847m(i, this.f101647b);
        return this.f101646a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof if40) {
            if40 if40Var = (if40) obj;
            int i = if40Var.f101647b;
            int i2 = this.f101647b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (m50417b(i3) == if40Var.m50417b(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f101647b; i2++) {
            i = (i * 31) + this.f101646a[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.f101647b == 0 ? f101645c : this;
    }

    public final String toString() {
        int i = this.f101647b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f101646a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.f101646a;
        int length = iArr.length;
        int i = this.f101647b;
        if (i >= length) {
            return this;
        }
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, i);
        return new if40(iArrCopyOfRange, iArrCopyOfRange.length);
    }
}
