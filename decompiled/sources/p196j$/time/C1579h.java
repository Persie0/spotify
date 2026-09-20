package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.ChronoLocalDateTime;
import p196j$.time.chrono.EnumC1543t;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.chrono.InterfaceC1536m;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1579h implements Temporal, InterfaceC1604m, InterfaceC1516b, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C1579h f10779d = m24113h0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e */
    public static final C1579h f10780e = m24113h0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a */
    public final int f10781a;

    /* JADX INFO: renamed from: b */
    public final short f10782b;

    /* JADX INFO: renamed from: c */
    public final short f10783c;

    static {
        m24113h0(1970, 1, 1);
    }

    public C1579h(int i, int i2, int i3) {
        this.f10781a = i;
        this.f10782b = (short) i2;
        this.f10783c = (short) i3;
    }

    /* JADX INFO: renamed from: E */
    public static C1579h m24110E(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C1542s.f10679c.getClass();
                if (C1542s.m24053b0(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C1512b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C1512b("Invalid date '" + EnumC1585n.m24152T(i2).name() + " " + i3 + "'");
            }
        }
        return new C1579h(i, i2, i3);
    }

    /* JADX INFO: renamed from: K */
    public static C1579h m24111K(InterfaceC1603l interfaceC1603l) {
        Objects.requireNonNull(interfaceC1603l, "temporal");
        C1579h c1579h = (C1579h) interfaceC1603l.mo23841b(AbstractC1608q.f10839f);
        if (c1579h != null) {
            return c1579h;
        }
        throw new C1512b("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName());
    }

    /* JADX INFO: renamed from: g0 */
    public static C1579h m24112g0(C1510a c1510a) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.f10608c;
        long j = 1000;
        Instant instantM23943r = Instant.m23943r(Math.floorDiv(jCurrentTimeMillis, j), ((int) Math.floorMod(jCurrentTimeMillis, j)) * 1000000);
        ZoneId zoneId = c1510a.f10631a;
        Objects.requireNonNull(instantM23943r, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m24114i0(Math.floorDiv(instantM23943r.f10611a + ((long) zoneId.getRules().m24196d(instantM23943r).getTotalSeconds()), 86400));
    }

    /* JADX INFO: renamed from: h0 */
    public static C1579h m24113h0(int i, int i2, int i3) {
        EnumC1592a.YEAR.m24165a0(i);
        EnumC1592a.MONTH_OF_YEAR.m24165a0(i2);
        EnumC1592a.DAY_OF_MONTH.m24165a0(i3);
        return m24110E(i, i2, i3);
    }

    /* JADX INFO: renamed from: i0 */
    public static C1579h m24114i0(long j) {
        long j2;
        EnumC1592a.EPOCH_DAY.m24165a0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        return new C1579h(enumC1592a.f10817b.m24175a(j7, enumC1592a), i3, i4);
    }

    /* JADX INFO: renamed from: j0 */
    public static C1579h m24115j0(int i, int i2) {
        long j = i;
        EnumC1592a.YEAR.m24165a0(j);
        EnumC1592a.DAY_OF_YEAR.m24165a0(i2);
        C1542s.f10679c.getClass();
        boolean zM24053b0 = C1542s.m24053b0(j);
        if (i2 == 366 && !zM24053b0) {
            throw new C1512b("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC1585n enumC1585nM24152T = EnumC1585n.m24152T(((i2 - 1) / 31) + 1);
        if (i2 > (enumC1585nM24152T.m24153E(zM24053b0) + enumC1585nM24152T.m24155r(zM24053b0)) - 1) {
            enumC1585nM24152T = EnumC1585n.f10797a[((((int) 1) + 12) + enumC1585nM24152T.ordinal()) % 12];
        }
        return new C1579h(i, enumC1585nM24152T.getValue(), (i2 - enumC1585nM24152T.m24155r(zM24053b0)) + 1);
    }

    /* JADX INFO: renamed from: p0 */
    public static C1579h m24116p0(int i, int i2, int i3) {
        if (i2 == 2) {
            C1542s.f10679c.getClass();
            i3 = Math.min(i3, C1542s.m24053b0((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new C1579h(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 3, this);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: M */
    public final long mo24011M() {
        long j;
        long j2 = this.f10781a;
        long j3 = this.f10782b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f10783c - 1));
        if (j3 > 2) {
            j5 = !m24122d0() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: N */
    public final ChronoLocalDateTime mo24012N(C1583l c1583l) {
        return LocalDateTime.m23955T(this, c1583l);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: Q */
    public final InterfaceC1536m mo24013Q() {
        return this.f10781a >= 1 ? EnumC1543t.f10680CE : EnumC1543t.BCE;
    }

    /* JADX INFO: renamed from: T */
    public final int m24117T(InterfaceC1607p interfaceC1607p) {
        switch (AbstractC1578g.f10777a[((EnumC1592a) interfaceC1607p).ordinal()]) {
            case 1:
                return this.f10783c;
            case 2:
                return m24119a0();
            case 3:
                return ((this.f10783c - 1) / 7) + 1;
            case 4:
                int i = this.f10781a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return m24118Z().getValue();
            case 6:
                return ((this.f10783c - 1) % 7) + 1;
            case 7:
                return ((m24119a0() - 1) % 7) + 1;
            case 8:
                throw new C1609r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m24119a0() - 1) / 7) + 1;
            case 10:
                return this.f10782b;
            case 11:
                throw new C1609r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f10781a;
            case 13:
                return this.f10781a >= 1 ? 1 : 0;
            default:
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: V */
    public final InterfaceC1516b mo24014V(InterfaceC1606o interfaceC1606o) {
        if (interfaceC1606o != null) {
            C1591t c1591t = (C1591t) interfaceC1606o;
            return m24127m0((((long) c1591t.f10809a) * 12) + ((long) c1591t.f10810b)).m24126l0(c1591t.f10811c);
        }
        Objects.requireNonNull(interfaceC1606o, "amountToAdd");
        return (C1579h) ((C1591t) interfaceC1606o).mo23940r(this);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b, java.lang.Comparable
    /* JADX INFO: renamed from: Y */
    public final int compareTo(InterfaceC1516b interfaceC1516b) {
        return interfaceC1516b instanceof C1579h ? m24131r((C1579h) interfaceC1516b) : super.compareTo(interfaceC1516b);
    }

    /* JADX INFO: renamed from: Z */
    public final EnumC1550d m24118Z() {
        return EnumC1550d.m24061r(((int) Math.floorMod(mo24011M() + 3, 7)) + 1);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final InterfaceC1516b mo23946a(long j, TemporalUnit temporalUnit) {
        return mo23950e(-1L, temporalUnit);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m24119a0() {
        return (EnumC1585n.m24152T(this.f10782b).m24155r(m24122d0()) + this.f10783c) - 1;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10839f ? this : super.mo23841b(c1580i);
    }

    /* JADX INFO: renamed from: b0 */
    public final long m24120b0() {
        return ((((long) this.f10781a) * 12) + ((long) this.f10782b)) - 1;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m24121c0(InterfaceC1516b interfaceC1516b) {
        if (interfaceC1516b instanceof C1579h) {
            return m24131r((C1579h) interfaceC1516b) < 0;
        }
        return mo24011M() < interfaceC1516b.mo24011M();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m24122d0() {
        C1542s c1542s = C1542s.f10679c;
        long j = this.f10781a;
        c1542s.getClass();
        return C1542s.m24053b0(j);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m24123e0() {
        short s = this.f10782b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return m24122d0() ? 29 : 28;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1579h) && m24131r((C1579h) obj) == 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final long m24124f0(C1579h c1579h) {
        return (((c1579h.m24120b0() * 32) + ((long) c1579h.f10783c)) - ((m24120b0() * 32) + ((long) this.f10783c))) / 32;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p instanceof EnumC1592a ? m24117T(interfaceC1607p) : super.mo23952g(interfaceC1607p);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final InterfaceC1535l getChronology() {
        return C1542s.f10679c;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final int hashCode() {
        int i = this.f10781a;
        return (((i << 11) + (this.f10782b << 6)) + this.f10783c) ^ (i & (-2048));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        if (interfaceC1607p == EnumC1592a.EPOCH_DAY) {
            return mo24011M();
        }
        return interfaceC1607p == EnumC1592a.PROLEPTIC_MONTH ? m24120b0() : m24117T(interfaceC1607p);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24162E(this);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        if (!enumC1592a.isDateBased()) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        int i = AbstractC1578g.f10777a[enumC1592a.ordinal()];
        if (i == 1) {
            return C1610s.m24173f(1L, m24123e0());
        }
        if (i == 2) {
            return C1610s.m24173f(1L, m24122d0() ? 366 : 365);
        }
        if (i == 3) {
            return C1610s.m24173f(1L, (EnumC1585n.m24152T(this.f10782b) != EnumC1585n.FEBRUARY || m24122d0()) ? 5L : 4L);
        }
        if (i != 4) {
            return enumC1592a.f10817b;
        }
        return this.f10781a <= 0 ? C1610s.m24173f(1L, 1000000000L) : C1610s.m24173f(1L, 999999999L);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C1579h mo23950e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C1579h) temporalUnit.mo24160E(this, j);
        }
        switch (AbstractC1578g.f10778b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m24126l0(j);
            case 2:
                return m24128n0(j);
            case 3:
                return m24127m0(j);
            case 4:
                return m24129o0(j);
            case 5:
                return m24129o0(Math.multiplyExact(j, 10));
            case 6:
                return m24129o0(Math.multiplyExact(j, 100));
            case 7:
                return m24129o0(Math.multiplyExact(j, 1000));
            case 8:
                EnumC1592a enumC1592a = EnumC1592a.ERA;
                return mo23948c(Math.addExact(mo23843i(enumC1592a), j), enumC1592a);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        C1579h c1579hM24111K = m24111K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, c1579hM24111K);
        }
        switch (AbstractC1578g.f10778b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c1579hM24111K.mo24011M() - mo24011M();
            case 2:
                return (c1579hM24111K.mo24011M() - mo24011M()) / 7;
            case 3:
                return m24124f0(c1579hM24111K);
            case 4:
                return m24124f0(c1579hM24111K) / 12;
            case 5:
                return m24124f0(c1579hM24111K) / 120;
            case 6:
                return m24124f0(c1579hM24111K) / 1200;
            case 7:
                return m24124f0(c1579hM24111K) / 12000;
            case 8:
                EnumC1592a enumC1592a = EnumC1592a.ERA;
                return c1579hM24111K.mo23843i(enumC1592a) - mo23843i(enumC1592a);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final C1579h m24126l0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f10783c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new C1579h(this.f10781a, this.f10782b, (int) j2);
            }
            if (j2 <= 59) {
                long jM24123e0 = m24123e0();
                if (j2 <= jM24123e0) {
                    return new C1579h(this.f10781a, this.f10782b, (int) j2);
                }
                short s = this.f10782b;
                if (s < 12) {
                    return new C1579h(this.f10781a, s + 1, (int) (j2 - jM24123e0));
                }
                EnumC1592a.YEAR.m24165a0(this.f10781a + 1);
                return new C1579h(this.f10781a + 1, 1, (int) (j2 - jM24123e0));
            }
        }
        return m24114i0(Math.addExact(mo24011M(), j));
    }

    /* JADX INFO: renamed from: m0 */
    public final C1579h m24127m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f10781a) * 12) + ((long) (this.f10782b - 1)) + j;
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        long j3 = 12;
        return m24116p0(enumC1592a.f10817b.m24175a(Math.floorDiv(j2, j3), enumC1592a), ((int) Math.floorMod(j2, j3)) + 1, this.f10783c);
    }

    /* JADX INFO: renamed from: n0 */
    public final C1579h m24128n0(long j) {
        return m24126l0(Math.multiplyExact(j, 7));
    }

    /* JADX INFO: renamed from: o0 */
    public final C1579h m24129o0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        return m24116p0(enumC1592a.f10817b.m24175a(((long) this.f10781a) + j, enumC1592a), this.f10782b, this.f10783c);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final C1579h mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (C1579h) interfaceC1607p.mo24164Z(this, j);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        enumC1592a.m24165a0(j);
        switch (AbstractC1578g.f10777a[enumC1592a.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.f10783c != i) {
                    return m24113h0(this.f10781a, this.f10782b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (m24119a0() != i2) {
                    return m24115j0(this.f10781a, i2);
                }
                return this;
            case 3:
                return m24128n0(j - mo23843i(EnumC1592a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f10781a < 1) {
                    j = 1 - j;
                }
                return m24133s0((int) j);
            case 5:
                return m24126l0(j - ((long) m24118Z().getValue()));
            case 6:
                return m24126l0(j - mo23843i(EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m24126l0(j - mo23843i(EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m24114i0(j);
            case 9:
                return m24128n0(j - mo23843i(EnumC1592a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.f10782b != i3) {
                    EnumC1592a.MONTH_OF_YEAR.m24165a0(i3);
                    return m24116p0(this.f10781a, i3, this.f10783c);
                }
                return this;
            case 11:
                return m24127m0(j - m24120b0());
            case 12:
                return m24133s0((int) j);
            case 13:
                if (mo23843i(EnumC1592a.ERA) != j) {
                    return m24133s0(1 - this.f10781a);
                }
                return this;
            default:
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m24131r(C1579h c1579h) {
        int i = this.f10781a - c1579h.f10781a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f10782b - c1579h.f10782b;
        return i2 == 0 ? this.f10783c - c1579h.f10783c : i2;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1579h mo23989k(InterfaceC1604m interfaceC1604m) {
        return interfaceC1604m instanceof C1579h ? (C1579h) interfaceC1604m : (C1579h) interfaceC1604m.mo23951f(this);
    }

    /* JADX INFO: renamed from: s0 */
    public final C1579h m24133s0(int i) {
        if (this.f10781a == i) {
            return this;
        }
        EnumC1592a.YEAR.m24165a0(i);
        return m24116p0(i, this.f10782b, this.f10783c);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final String toString() {
        int i = this.f10781a;
        short s = this.f10782b;
        short s2 = this.f10783c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }
}
