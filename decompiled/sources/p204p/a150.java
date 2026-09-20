package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class a150 implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final a150 f11335c = new a150(0, -31557014167219200L);

    /* JADX INFO: renamed from: d */
    public static final a150 f11336d = new a150(999999999, 31556889864403199L);

    /* JADX INFO: renamed from: a */
    public final long f11337a;

    /* JADX INFO: renamed from: b */
    public final int f11338b;

    public a150(int i, long j) {
        this.f11337a = j;
        this.f11338b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = e150.f55119a;
        n150 n150Var = new n150();
        n150Var.f149299a = this.f11337a;
        n150Var.f149300b = this.f11338b;
        return n150Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m24422a() {
        return this.f11337a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a150 a150Var = (a150) obj;
        int iM88283v = wj50.m88283v(this.f11337a, a150Var.f11337a);
        return iM88283v != 0 ? iM88283v : wj50.m88282u(this.f11338b, a150Var.f11338b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a150)) {
            return false;
        }
        a150 a150Var = (a150) obj;
        return this.f11337a == a150Var.f11337a && this.f11338b == a150Var.f11338b;
    }

    public final int hashCode() {
        return (this.f11338b * 51) + Long.hashCode(this.f11337a);
    }

    public final String toString() {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j = this.f11337a;
        long j2 = j / 86400;
        long j3 = 0;
        if ((j ^ 86400) < 0 && j2 * 86400 != j) {
            j2--;
        }
        long j4 = j % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = (j2 + ((long) 719528)) - ((long) 60);
        if (j5 < 0) {
            long j6 = 146097;
            long j7 = ((j5 + 1) / j6) - 1;
            j3 = ((long) 400) * j7;
            j5 += (-j7) * j6;
        }
        long j8 = 400;
        long j9 = ((j8 * j5) + ((long) 591)) / ((long) 146097);
        long j10 = 365;
        long j11 = 4;
        long j12 = 100;
        long j13 = j5 - ((j9 / j8) + (((j9 / j11) + (j10 * j9)) - (j9 / j12)));
        if (j13 < 0) {
            j9--;
            j13 = j5 - ((j9 / j8) + (((j9 / j11) + (j10 * j9)) - (j9 / j12)));
        }
        int i2 = (int) j13;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j9 + j3 + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        mif1.m61881p(sb, sb, i4);
        sb.append('-');
        mif1.m61881p(sb, sb, i5);
        sb.append('T');
        mif1.m61881p(sb, sb, i7);
        sb.append(':');
        mif1.m61881p(sb, sb, i9);
        sb.append(':');
        mif1.m61881p(sb, sb, i10);
        int i12 = this.f11338b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = mif1.f144017c;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
