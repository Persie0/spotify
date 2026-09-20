package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yoi0 {

    /* JADX INFO: renamed from: a */
    public long[] f274676a;

    /* JADX INFO: renamed from: b */
    public int f274677b;

    public yoi0(int i) {
        this.f274676a = i == 0 ? v2b0.f236599a : new long[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m94289a(long j) {
        int i = this.f274677b + 1;
        long[] jArr = this.f274676a;
        if (jArr.length < i) {
            this.f274676a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f274676a;
        int i2 = this.f274677b;
        jArr2[i2] = j;
        this.f274677b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yoi0) {
            yoi0 yoi0Var = (yoi0) obj;
            int i = yoi0Var.f274677b;
            int i2 = this.f274677b;
            if (i == i2) {
                long[] jArr = this.f274676a;
                long[] jArr2 = yoi0Var.f274676a;
                b450 b450VarM63417Y = n0e1.m63417Y(0, i2);
                int i3 = b450VarM63417Y.f278778a;
                int i4 = b450VarM63417Y.f278779b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f274676a;
        int i = this.f274677b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f274676a;
        int i = this.f274677b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ yoi0() {
        this(16);
    }
}
