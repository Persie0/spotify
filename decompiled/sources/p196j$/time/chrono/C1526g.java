package p196j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.time.C1512b;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.Temporal;

/* JADX INFO: renamed from: j$.time.chrono.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1526g implements InterfaceC1606o, Serializable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f10646e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1535l f10647a;

    /* JADX INFO: renamed from: b */
    public final int f10648b;

    /* JADX INFO: renamed from: c */
    public final int f10649c;

    /* JADX INFO: renamed from: d */
    public final int f10650d;

    static {
        AbstractC1419g.m23830m(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C1526g(InterfaceC1535l interfaceC1535l, int i, int i2, int i3) {
        this.f10647a = interfaceC1535l;
        this.f10648b = i;
        this.f10649c = i2;
        this.f10650d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1526g) {
            C1526g c1526g = (C1526g) obj;
            if (this.f10648b == c1526g.f10648b && this.f10649c == c1526g.f10649c && this.f10650d == c1526g.f10650d && this.f10647a.equals(c1526g.f10647a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f10650d, 16) + (Integer.rotateLeft(this.f10649c, 8) + this.f10648b)) ^ this.f10647a.hashCode();
    }

    @Override // p196j$.time.temporal.InterfaceC1606o
    /* JADX INFO: renamed from: r */
    public final Temporal mo23940r(Temporal temporal) {
        InterfaceC1535l interfaceC1535l = (InterfaceC1535l) temporal.mo23841b(AbstractC1608q.f10835b);
        if (interfaceC1535l != null && !this.f10647a.equals(interfaceC1535l)) {
            throw new C1512b("Chronology mismatch, expected: " + this.f10647a.mo24008o() + ", actual: " + interfaceC1535l.mo24008o());
        }
        if (this.f10649c == 0) {
            int i = this.f10648b;
            if (i != 0) {
                temporal = temporal.mo23950e(i, ChronoUnit.YEARS);
            }
        } else {
            C1610s c1610sMo23999C = this.f10647a.mo23999C(EnumC1592a.MONTH_OF_YEAR);
            long j = (c1610sMo23999C.f10841a == c1610sMo23999C.f10842b && c1610sMo23999C.f10843c == c1610sMo23999C.f10844d && c1610sMo23999C.m24178d()) ? (c1610sMo23999C.f10844d - c1610sMo23999C.f10841a) + 1 : -1L;
            if (j > 0) {
                temporal = temporal.mo23950e((((long) this.f10648b) * j) + ((long) this.f10649c), ChronoUnit.MONTHS);
            } else {
                int i2 = this.f10648b;
                if (i2 != 0) {
                    temporal = temporal.mo23950e(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.mo23950e(this.f10649c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.f10650d;
        return i3 != 0 ? temporal.mo23950e(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this.f10648b == 0 && this.f10649c == 0 && this.f10650d == 0) {
            return this.f10647a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10647a.toString());
        sb.append(" P");
        int i = this.f10648b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f10649c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f10650d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new C1523e0((byte) 9, this);
    }
}
