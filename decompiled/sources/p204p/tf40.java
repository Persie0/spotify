package p204p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class tf40 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final tf40 f219848c = new tf40(new long[0], 0);

    /* JADX INFO: renamed from: a */
    public final long[] f219849a;

    /* JADX INFO: renamed from: b */
    public final int f219850b;

    public tf40(long[] jArr, int i) {
        this.f219849a = jArr;
        this.f219850b = i;
    }

    /* JADX INFO: renamed from: a */
    public final long m80603a(int i) {
        c95.m31847m(i, this.f219850b);
        return this.f219849a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tf40) {
            tf40 tf40Var = (tf40) obj;
            int i = tf40Var.f219850b;
            int i2 = this.f219850b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (m80603a(i3) == tf40Var.m80603a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM56352o = 1;
        for (int i = 0; i < this.f219850b; i++) {
            iM56352o = (iM56352o * 31) + kgg1.m56352o(this.f219849a[i]);
        }
        return iM56352o;
    }

    public Object readResolve() {
        return this.f219850b == 0 ? f219848c : this;
    }

    public final String toString() {
        int i = this.f219850b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.f219849a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        long[] jArr = this.f219849a;
        int length = jArr.length;
        int i = this.f219850b;
        if (i >= length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, 0, i);
        return new tf40(jArrCopyOfRange, jArrCopyOfRange.length);
    }
}
