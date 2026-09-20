package p196j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p196j$.time.C1512b;

/* JADX INFO: renamed from: j$.time.temporal.s */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1610s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a */
    public final long f10841a;

    /* JADX INFO: renamed from: b */
    public final long f10842b;

    /* JADX INFO: renamed from: c */
    public final long f10843c;

    /* JADX INFO: renamed from: d */
    public final long f10844d;

    public C1610s(long j, long j2, long j3, long j4) {
        this.f10841a = j;
        this.f10842b = j2;
        this.f10843c = j3;
        this.f10844d = j4;
    }

    /* JADX INFO: renamed from: f */
    public static C1610s m24173f(long j, long j2) {
        if (j <= j2) {
            return new C1610s(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: g */
    public static C1610s m24174g(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j2) {
            return new C1610s(1L, 1L, j, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f10841a;
        long j2 = this.f10842b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.f10843c;
        long j4 = this.f10844d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m24175a(long j, InterfaceC1607p interfaceC1607p) {
        if (m24178d() && m24179e(j)) {
            return (int) j;
        }
        throw new C1512b(m24177c(j, interfaceC1607p));
    }

    /* JADX INFO: renamed from: b */
    public final void m24176b(long j, InterfaceC1607p interfaceC1607p) {
        if (!m24179e(j)) {
            throw new C1512b(m24177c(j, interfaceC1607p));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m24177c(long j, InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + interfaceC1607p + " (valid values " + this + "): " + j;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m24178d() {
        return this.f10841a >= -2147483648L && this.f10844d <= 2147483647L;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m24179e(long j) {
        return j >= this.f10841a && j <= this.f10844d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1610s) {
            C1610s c1610s = (C1610s) obj;
            if (this.f10841a == c1610s.f10841a && this.f10842b == c1610s.f10842b && this.f10843c == c1610s.f10843c && this.f10844d == c1610s.f10844d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10841a;
        long j2 = this.f10842b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f10843c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f10844d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10841a);
        if (this.f10841a != this.f10842b) {
            sb.append('/');
            sb.append(this.f10842b);
        }
        sb.append(" - ");
        sb.append(this.f10843c);
        if (this.f10843c != this.f10844d) {
            sb.append('/');
            sb.append(this.f10844d);
        }
        return sb.toString();
    }
}
