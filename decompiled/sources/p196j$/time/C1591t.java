package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.Temporal;

/* JADX INFO: renamed from: j$.time.t */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1591t implements InterfaceC1606o, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C1591t f10808d = new C1591t(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a */
    public final int f10809a;

    /* JADX INFO: renamed from: b */
    public final int f10810b;

    /* JADX INFO: renamed from: c */
    public final int f10811c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC1419g.m23830m(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C1591t(int i, int i2, int i3) {
        this.f10809a = i;
        this.f10810b = i2;
        this.f10811c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C1591t m24159a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? f10808d : new C1591t(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1591t) {
            C1591t c1591t = (C1591t) obj;
            if (this.f10809a == c1591t.f10809a && this.f10810b == c1591t.f10810b && this.f10811c == c1591t.f10811c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f10811c, 16) + Integer.rotateLeft(this.f10810b, 8) + this.f10809a;
    }

    @Override // p196j$.time.temporal.InterfaceC1606o
    /* JADX INFO: renamed from: r */
    public final Temporal mo23940r(Temporal temporal) {
        InterfaceC1535l interfaceC1535l = (InterfaceC1535l) temporal.mo23841b(AbstractC1608q.f10835b);
        if (interfaceC1535l != null && !C1542s.f10679c.equals(interfaceC1535l)) {
            throw new C1512b("Chronology mismatch, expected: ISO, actual: " + interfaceC1535l.mo24008o());
        }
        int i = this.f10810b;
        if (i == 0) {
            int i2 = this.f10809a;
            if (i2 != 0) {
                temporal = temporal.mo23950e(i2, ChronoUnit.YEARS);
            }
        } else {
            long j = (((long) this.f10809a) * 12) + ((long) i);
            if (j != 0) {
                temporal = temporal.mo23950e(j, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.f10811c;
        return i3 != 0 ? temporal.mo23950e(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this == f10808d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f10809a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f10810b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f10811c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
