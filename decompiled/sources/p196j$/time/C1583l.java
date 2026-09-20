package p196j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1583l implements Temporal, InterfaceC1604m, Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final C1583l f10788e;

    /* JADX INFO: renamed from: f */
    public static final C1583l f10789f;

    /* JADX INFO: renamed from: g */
    public static final C1583l f10790g;

    /* JADX INFO: renamed from: h */
    public static final C1583l[] f10791h = new C1583l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a */
    public final byte f10792a;

    /* JADX INFO: renamed from: b */
    public final byte f10793b;

    /* JADX INFO: renamed from: c */
    public final byte f10794c;

    /* JADX INFO: renamed from: d */
    public final int f10795d;

    static {
        int i = 0;
        while (true) {
            C1583l[] c1583lArr = f10791h;
            if (i >= c1583lArr.length) {
                C1583l c1583l = c1583lArr[0];
                f10790g = c1583l;
                C1583l c1583l2 = c1583lArr[12];
                f10788e = c1583l;
                f10789f = new C1583l(23, 59, 59, 999999999);
                return;
            }
            c1583lArr[i] = new C1583l(i, 0, 0, 0);
            i++;
        }
    }

    public C1583l(int i, int i2, int i3, int i4) {
        this.f10792a = (byte) i;
        this.f10793b = (byte) i2;
        this.f10794c = (byte) i3;
        this.f10795d = i4;
    }

    /* JADX INFO: renamed from: E */
    public static C1583l m24135E(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f10791h[i] : new C1583l(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: K */
    public static C1583l m24136K(InterfaceC1603l interfaceC1603l) {
        Objects.requireNonNull(interfaceC1603l, "temporal");
        C1583l c1583l = (C1583l) interfaceC1603l.mo23841b(AbstractC1608q.f10840g);
        if (c1583l != null) {
            return c1583l;
        }
        throw new C1512b("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName());
    }

    /* JADX INFO: renamed from: Z */
    public static C1583l m24137Z(int i, int i2, int i3, int i4) {
        EnumC1592a.HOUR_OF_DAY.m24165a0(i);
        EnumC1592a.MINUTE_OF_HOUR.m24165a0(i2);
        EnumC1592a.SECOND_OF_MINUTE.m24165a0(i3);
        EnumC1592a.NANO_OF_SECOND.m24165a0(i4);
        return m24135E(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a0 */
    public static C1583l m24138a0(long j) {
        EnumC1592a.NANO_OF_DAY.m24165a0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m24135E(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* JADX INFO: renamed from: g0 */
    public static C1583l m24139g0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return m24137Z(i3, i4, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 4, this);
    }

    /* JADX INFO: renamed from: T */
    public final int m24140T(InterfaceC1607p interfaceC1607p) {
        switch (AbstractC1582k.f10786a[((EnumC1592a) interfaceC1607p).ordinal()]) {
            case 1:
                return this.f10795d;
            case 2:
                throw new C1609r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f10795d / 1000;
            case 4:
                throw new C1609r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f10795d / 1000000;
            case 6:
                return (int) (m24146h0() / 1000000);
            case 7:
                return this.f10794c;
            case 8:
                return m24147i0();
            case 9:
                return this.f10793b;
            case 10:
                return (this.f10792a * 60) + this.f10793b;
            case 11:
                return this.f10792a % 12;
            case 12:
                int i = this.f10792a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f10792a;
            case 14:
                byte b = this.f10792a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f10792a / 12;
            default:
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10835b || c1580i == AbstractC1608q.f10834a || c1580i == AbstractC1608q.f10838e || c1580i == AbstractC1608q.f10837d) {
            return null;
        }
        if (c1580i == AbstractC1608q.f10840g) {
            return this;
        }
        if (c1580i == AbstractC1608q.f10839f) {
            return null;
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.NANOS : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C1583l mo23950e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C1583l) temporalUnit.mo24160E(this, j);
        }
        switch (AbstractC1582k.f10787b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m24144e0(j);
            case 2:
                return m24144e0((j % 86400000000L) * 1000);
            case 3:
                return m24144e0((j % 86400000) * 1000000);
            case 4:
                return m24145f0(j);
            case 5:
                return m24143d0(j);
            case 6:
                return m24142c0(j);
            case 7:
                return m24142c0((j % 2) * 12);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final C1583l m24142c0(long j) {
        return j == 0 ? this : m24135E(((((int) (j % 24)) + this.f10792a) + 24) % 24, this.f10793b, this.f10794c, this.f10795d);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo23989k(C1579h c1579h) {
        return (C1583l) c1579h.mo23951f(this);
    }

    /* JADX INFO: renamed from: d0 */
    public final C1583l m24143d0(long j) {
        if (j != 0) {
            int i = (this.f10792a * 60) + this.f10793b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return m24135E(i2 / 60, i2 % 60, this.f10794c, this.f10795d);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public final C1583l m24144e0(long j) {
        if (j != 0) {
            long jM24146h0 = m24146h0();
            long j2 = (((j % 86400000000000L) + jM24146h0) + 86400000000000L) % 86400000000000L;
            if (jM24146h0 != j2) {
                return m24135E((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1583l) {
            C1583l c1583l = (C1583l) obj;
            if (this.f10792a == c1583l.f10792a && this.f10793b == c1583l.f10793b && this.f10794c == c1583l.f10794c && this.f10795d == c1583l.f10795d) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(m24146h0(), EnumC1592a.NANO_OF_DAY);
    }

    /* JADX INFO: renamed from: f0 */
    public final C1583l m24145f0(long j) {
        if (j != 0) {
            int i = (this.f10793b * 60) + (this.f10792a * 3600) + this.f10794c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return m24135E(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f10795d);
            }
        }
        return this;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p instanceof EnumC1592a ? m24140T(interfaceC1607p) : super.mo23952g(interfaceC1607p);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0();
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    /* JADX INFO: renamed from: h0 */
    public final long m24146h0() {
        return (((long) this.f10794c) * 1000000000) + (((long) this.f10793b) * 60000000000L) + (((long) this.f10792a) * 3600000000000L) + ((long) this.f10795d);
    }

    public final int hashCode() {
        long jM24146h0 = m24146h0();
        return (int) (jM24146h0 ^ (jM24146h0 >>> 32));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        if (interfaceC1607p == EnumC1592a.NANO_OF_DAY) {
            return m24146h0();
        }
        return interfaceC1607p == EnumC1592a.MICRO_OF_DAY ? m24146h0() / 1000 : m24140T(interfaceC1607p);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m24147i0() {
        return (this.f10793b * 60) + (this.f10792a * 3600) + this.f10794c;
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final C1583l mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (C1583l) interfaceC1607p.mo24164Z(this, j);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        enumC1592a.m24165a0(j);
        switch (AbstractC1582k.f10786a[enumC1592a.ordinal()]) {
            case 1:
                return m24149k0((int) j);
            case 2:
                return m24138a0(j);
            case 3:
                return m24149k0(((int) j) * 1000);
            case 4:
                return m24138a0(j * 1000);
            case 5:
                return m24149k0(((int) j) * 1000000);
            case 6:
                return m24138a0(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f10794c != i) {
                    EnumC1592a.SECOND_OF_MINUTE.m24165a0(i);
                    return m24135E(this.f10792a, this.f10793b, i, this.f10795d);
                }
                return this;
            case 8:
                return m24145f0(j - ((long) m24147i0()));
            case 9:
                int i2 = (int) j;
                if (this.f10793b != i2) {
                    EnumC1592a.MINUTE_OF_HOUR.m24165a0(i2);
                    return m24135E(this.f10792a, i2, this.f10794c, this.f10795d);
                }
                return this;
            case 10:
                return m24143d0(j - ((long) ((this.f10792a * 60) + this.f10793b)));
            case 11:
                return m24142c0(j - ((long) (this.f10792a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m24142c0(j - ((long) (this.f10792a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.f10792a != i3) {
                    EnumC1592a.HOUR_OF_DAY.m24165a0(i3);
                    return m24135E(i3, this.f10793b, this.f10794c, this.f10795d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.f10792a != i4) {
                    EnumC1592a.HOUR_OF_DAY.m24165a0(i4);
                    return m24135E(i4, this.f10793b, this.f10794c, this.f10795d);
                }
                return this;
            case 15:
                return m24142c0((j - ((long) (this.f10792a / 12))) * 12);
            default:
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final C1583l m24149k0(int i) {
        if (this.f10795d == i) {
            return this;
        }
        EnumC1592a.NANO_OF_SECOND.m24165a0(i);
        return m24135E(this.f10792a, this.f10793b, this.f10794c, i);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        C1583l c1583lM24136K = m24136K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, c1583lM24136K);
        }
        long jM24146h0 = c1583lM24136K.m24146h0() - m24146h0();
        switch (AbstractC1582k.f10787b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jM24146h0;
            case 2:
                return jM24146h0 / 1000;
            case 3:
                return jM24146h0 / 1000000;
            case 4:
                return jM24146h0 / 1000000000;
            case 5:
                return jM24146h0 / 60000000000L;
            case 6:
                return jM24146h0 / 3600000000000L;
            case 7:
                return jM24146h0 / 43200000000000L;
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m24150l0(DataOutput dataOutput) throws IOException {
        if (this.f10795d != 0) {
            dataOutput.writeByte(this.f10792a);
            dataOutput.writeByte(this.f10793b);
            dataOutput.writeByte(this.f10794c);
            dataOutput.writeInt(this.f10795d);
            return;
        }
        if (this.f10794c != 0) {
            dataOutput.writeByte(this.f10792a);
            dataOutput.writeByte(this.f10793b);
            dataOutput.writeByte(~this.f10794c);
        } else if (this.f10793b == 0) {
            dataOutput.writeByte(~this.f10792a);
        } else {
            dataOutput.writeByte(this.f10792a);
            dataOutput.writeByte(~this.f10793b);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1583l c1583l) {
        int iCompare = Integer.compare(this.f10792a, c1583l.f10792a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f10793b, c1583l.f10793b)) == 0 && (iCompare = Integer.compare(this.f10794c, c1583l.f10794c)) == 0) ? Integer.compare(this.f10795d, c1583l.f10795d) : iCompare;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f10792a;
        byte b2 = this.f10793b;
        byte b3 = this.f10794c;
        int i = this.f10795d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }
}
