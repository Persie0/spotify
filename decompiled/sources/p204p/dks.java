package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class dks implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final dks f50018c = new dks(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f50019a;

    /* JADX INFO: renamed from: b */
    public final int f50020b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public dks(int i, long j) {
        this.f50019a = j;
        this.f50020b = i;
    }

    /* JADX INFO: renamed from: a */
    public static dks m36312a(int i, long j) {
        return (((long) i) | j) == 0 ? f50018c : new dks(i, j);
    }

    /* JADX INFO: renamed from: b */
    public static dks m36313b(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m36312a(i * 1000000, j2);
    }

    /* JADX INFO: renamed from: c */
    public static dks m36314c(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return m36312a(i, j2);
    }

    /* JADX INFO: renamed from: d */
    public static dks m36315d(long j, long j2) {
        return m36312a(jlg1.m53709s(1000000000, j2), jlg1.m53682A(j, jlg1.m53707q(j2, 1000000000L)));
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jtz0((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        dks dksVar = (dks) obj;
        int iM53702l = jlg1.m53702l(this.f50019a, dksVar.f50019a);
        return iM53702l != 0 ? iM53702l : this.f50020b - dksVar.f50020b;
    }

    /* JADX INFO: renamed from: e */
    public final dks m36316e(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m36315d(jlg1.m53682A(jlg1.m53682A(this.f50019a, j), j2 / 1000000000), ((long) this.f50020b) + (j2 % 1000000000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dks) {
            dks dksVar = (dks) obj;
            if (this.f50019a == dksVar.f50019a && this.f50020b == dksVar.f50020b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final long m36317f() {
        return jlg1.m53682A(jlg1.m53683B(1000, this.f50019a), this.f50020b / 1000000);
    }

    public final int hashCode() {
        long j = this.f50019a;
        return (this.f50020b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f50018c) {
            return "PT0S";
        }
        long j = this.f50019a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        int i3 = this.f50020b;
        if (i2 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - i3);
            } else {
                sb.append(i3 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
