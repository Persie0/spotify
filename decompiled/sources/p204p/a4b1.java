package p204p;

import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class a4b1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long f12188a;

    /* JADX INFO: renamed from: b */
    public final long f12189b;

    /* JADX INFO: renamed from: c */
    public final long f12190c;

    /* JADX INFO: renamed from: d */
    public final long f12191d;

    public a4b1(long j, long j2, long j3, long j4) {
        this.f12188a = j;
        this.f12189b = j2;
        this.f12190c = j3;
        this.f12191d = j4;
    }

    /* JADX INFO: renamed from: d */
    public static a4b1 m24687d(long j, long j2) {
        if (j <= j2) {
            return new a4b1(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: e */
    public static a4b1 m24688e(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j3) {
            return new a4b1(j, 1L, j2, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: a */
    public final int m24689a(long j, dz61 dz61Var) {
        if (this.f12188a >= -2147483648L && this.f12191d <= 2147483647L && m24691c(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid int value for " + dz61Var + ": " + j);
    }

    /* JADX INFO: renamed from: b */
    public final void m24690b(long j, dz61 dz61Var) {
        if (m24691c(j)) {
            return;
        }
        if (dz61Var == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j);
        }
        throw new DateTimeException("Invalid value for " + dz61Var + " (valid values " + this + "): " + j);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24691c(long j) {
        return j >= this.f12188a && j <= this.f12191d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a4b1) {
            a4b1 a4b1Var = (a4b1) obj;
            if (this.f12188a == a4b1Var.f12188a && this.f12189b == a4b1Var.f12189b && this.f12190c == a4b1Var.f12190c && this.f12191d == a4b1Var.f12191d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12188a;
        long j2 = this.f12189b;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.f12190c;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.f12191d;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f12188a;
        sb.append(j);
        long j2 = this.f12189b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.f12190c;
        sb.append(j3);
        long j4 = this.f12191d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
