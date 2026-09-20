package p204p;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes2.dex */
public final class hze1 extends gze1 implements bz61, cz61, Comparable {

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f96905d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f96906e = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: f */
    public static final hze1 f96907f = m49269u(0);

    /* JADX INFO: renamed from: g */
    public static final hze1 f96908g = m49269u(-64800);

    /* JADX INFO: renamed from: h */
    public static final hze1 f96909h = m49269u(64800);

    /* JADX INFO: renamed from: b */
    public final int f96910b;

    /* JADX INFO: renamed from: c */
    public final transient String f96911c;

    public hze1(int i) {
        String string;
        this.f96910b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.f96911c = string;
    }

    /* JADX INFO: renamed from: r */
    public static hze1 m49266r(bz61 bz61Var) {
        hze1 hze1Var = (hze1) bz61Var.mo26518k(ez61.f64289e);
        if (hze1Var != null) {
            return hze1Var;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX INFO: renamed from: s */
    public static hze1 m49267s(String str) {
        int iM49270v;
        int iM49270v2;
        int iM49270v3;
        char cCharAt;
        jlg1.m53716z(str, "offsetId");
        hze1 hze1Var = (hze1) f96906e.get(str);
        if (hze1Var != null) {
            return hze1Var;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iM49270v = m49270v(str, 1, false);
                    iM49270v2 = m49270v(str, 3, false);
                } else if (length == 6) {
                    iM49270v = m49270v(str, 1, false);
                    iM49270v2 = m49270v(str, 4, true);
                } else if (length == 7) {
                    iM49270v = m49270v(str, 1, false);
                    iM49270v2 = m49270v(str, 3, false);
                    iM49270v3 = m49270v(str, 5, false);
                } else {
                    if (length != 9) {
                        throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    iM49270v = m49270v(str, 1, false);
                    iM49270v2 = m49270v(str, 4, true);
                    iM49270v3 = m49270v(str, 7, true);
                }
                iM49270v3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? m49268t(-iM49270v, -iM49270v2, -iM49270v3) : m49268t(iM49270v, iM49270v2, iM49270v3);
            }
            throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iM49270v = m49270v(str, 1, false);
        iM49270v2 = 0;
        iM49270v3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    /* JADX INFO: renamed from: t */
    public static hze1 m49268t(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException(edb.m38563l("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18"));
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i2) + " is not in the range 0 to 59");
        }
        if (Math.abs(i3) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        }
        if (Math.abs(i) == 18 && (Math.abs(i2) > 0 || Math.abs(i3) > 0)) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m49269u((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX INFO: renamed from: u */
    public static hze1 m49269u(int i) {
        if (Math.abs(i) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new hze1(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = f96905d;
        hze1 hze1Var = (hze1) concurrentHashMap.get(numValueOf);
        if (hze1Var != null) {
            return hze1Var;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new hze1(i));
        hze1 hze1Var2 = (hze1) concurrentHashMap.get(numValueOf);
        f96906e.putIfAbsent(hze1Var2.f96911c, hze1Var2);
        return hze1Var2;
    }

    /* JADX INFO: renamed from: v */
    public static int m49270v(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    /* JADX INFO: renamed from: w */
    public static hze1 m49271w(DataInput dataInput) {
        byte b = dataInput.readByte();
        return b == 127 ? m49269u(dataInput.readInt()) : m49269u(b * 900);
    }

    private Object writeReplace() {
        return new jtz0((byte) 8, this);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        return az61Var.mo27575l(this.f96910b, dce.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((hze1) obj).f96910b - this.f96910b;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return dz61Var == dce.OFFSET_SECONDS;
        }
        return dz61Var != null && dz61Var.mo35640a(this);
    }

    @Override // p204p.gze1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hze1) {
            if (this.f96910b == ((hze1) obj).f96910b) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.gze1
    /* JADX INFO: renamed from: f */
    public final mze1 mo46200f() {
        return new lze1(this);
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: g */
    public final long mo26517g(dz61 dz61Var) {
        if (dz61Var == dce.OFFSET_SECONDS) {
            return this.f96910b;
        }
        if (dz61Var instanceof dce) {
            throw new DateTimeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
        return dz61Var.mo35644e(this);
    }

    @Override // p204p.gze1
    public final String getId() {
        return this.f96911c;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        if (dz61Var == dce.OFFSET_SECONDS) {
            return this.f96910b;
        }
        if (dz61Var instanceof dce) {
            throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
        return mo30953j(dz61Var).m24689a(mo26517g(dz61Var), dz61Var);
    }

    @Override // p204p.gze1
    public final int hashCode() {
        return this.f96910b;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: j */
    public final a4b1 mo30953j(dz61 dz61Var) {
        if (dz61Var == dce.OFFSET_SECONDS) {
            return dz61Var.range();
        }
        if (dz61Var instanceof dce) {
            throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
        return dz61Var.mo35642c(this);
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        if (fz61Var == ez61.f64289e || fz61Var == ez61.f64288d) {
            return this;
        }
        if (fz61Var == ez61.f64290f || fz61Var == ez61.f64291g || fz61Var == ez61.f64287c || fz61Var == ez61.f64286b || fz61Var == ez61.f64285a) {
            return null;
        }
        return fz61Var.mo24968w(this);
    }

    @Override // p204p.gze1
    /* JADX INFO: renamed from: q */
    public final void mo46201q(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        m49272x(objectOutput);
    }

    @Override // p204p.gze1
    public final String toString() {
        return this.f96911c;
    }

    /* JADX INFO: renamed from: x */
    public final void m49272x(DataOutput dataOutput) {
        int i = this.f96910b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
