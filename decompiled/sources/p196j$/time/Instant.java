package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.format.DateTimeFormatter;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class Instant implements Temporal, InterfaceC1604m, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final Instant f10608c = new Instant(0, 0);

    /* JADX INFO: renamed from: d */
    public static final Instant f10609d = m23942K(-31557014167219200L, 0);

    /* JADX INFO: renamed from: e */
    public static final Instant f10610e = m23942K(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a */
    public final long f10611a;

    /* JADX INFO: renamed from: b */
    public final int f10612b;

    public Instant(long j, int i) {
        this.f10611a = j;
        this.f10612b = i;
    }

    /* JADX INFO: renamed from: E */
    public static Instant m23941E(InterfaceC1603l interfaceC1603l) {
        if (interfaceC1603l instanceof Instant) {
            return (Instant) interfaceC1603l;
        }
        Objects.requireNonNull(interfaceC1603l, "temporal");
        try {
            return m23942K(interfaceC1603l.mo23843i(EnumC1592a.INSTANT_SECONDS), interfaceC1603l.mo23952g(EnumC1592a.NANO_OF_SECOND));
        } catch (C1512b e) {
            throw new C1512b("Unable to obtain Instant from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: K */
    public static Instant m23942K(long j, long j2) {
        return m23943r(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant now() {
        C1510a.f10630b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 1000;
        return m23943r(Math.floorDiv(jCurrentTimeMillis, j), ((int) Math.floorMod(jCurrentTimeMillis, j)) * 1000000);
    }

    /* JADX INFO: renamed from: r */
    public static Instant m23943r(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f10608c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C1512b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 2, this);
    }

    /* JADX INFO: renamed from: T */
    public final Instant m23944T(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m23942K(Math.addExact(Math.addExact(this.f10611a, j), j2 / 1000000000), ((long) this.f10612b) + (j2 % 1000000000));
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final Instant mo23950e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo24160E(this, j);
        }
        switch (AbstractC1552f.f10699b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m23944T(0L, j);
            case 2:
                return m23944T(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m23944T(j / 1000, (j % 1000) * 1000000);
            case 4:
                return m23944T(j, 0L);
            case 5:
                return m23944T(Math.multiplyExact(j, 60), 0L);
            case 6:
                return m23944T(Math.multiplyExact(j, 3600), 0L);
            case 7:
                return m23944T(Math.multiplyExact(j, 43200), 0L);
            case 8:
                return m23944T(Math.multiplyExact(j, 86400), 0L);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    /* JADX INFO: renamed from: a0 */
    public final long m23947a0(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f10611a, this.f10611a);
        long j = instant.f10612b - this.f10612b;
        if (jSubtractExact <= 0 || j >= 0) {
            return (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1;
        }
        return jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m23966r(this, zoneOffset);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10836c) {
            return ChronoUnit.NANOS;
        }
        if (c1580i == AbstractC1608q.f10835b || c1580i == AbstractC1608q.f10834a || c1580i == AbstractC1608q.f10838e || c1580i == AbstractC1608q.f10837d || c1580i == AbstractC1608q.f10839f || c1580i == AbstractC1608q.f10840g) {
            return null;
        }
        return c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (Instant) interfaceC1607p.mo24164Z(this, j);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        enumC1592a.m24165a0(j);
        int i = AbstractC1552f.f10698a[enumC1592a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.f10612b) {
                    return m23943r(this.f10611a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                if (i3 != this.f10612b) {
                    return m23943r(this.f10611a, i3);
                }
            } else {
                if (i != 4) {
                    throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
                }
                if (j != this.f10611a) {
                    return m23943r(j, this.f10612b);
                }
            }
        } else if (j != this.f10612b) {
            return m23943r(this.f10611a, (int) j);
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f10611a, instant2.f10611a);
        return iCompare != 0 ? iCompare : this.f10612b - instant2.f10612b;
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo24016k(C1579h c1579h) {
        return (Instant) c1579h.mo23951f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f10611a == instant.f10611a && this.f10612b == instant.f10612b) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(this.f10611a, EnumC1592a.INSTANT_SECONDS).mo23948c(this.f10612b, EnumC1592a.NANO_OF_SECOND);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return super.mo23920j(interfaceC1607p).m24175a(interfaceC1607p.mo24163T(this), interfaceC1607p);
        }
        int i = AbstractC1552f.f10698a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i == 1) {
            return this.f10612b;
        }
        if (i == 2) {
            return this.f10612b / 1000;
        }
        if (i == 3) {
            return this.f10612b / 1000000;
        }
        if (i == 4) {
            EnumC1592a enumC1592a = EnumC1592a.INSTANT_SECONDS;
            enumC1592a.f10817b.m24175a(this.f10611a, enumC1592a);
        }
        throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.INSTANT_SECONDS || interfaceC1607p == EnumC1592a.NANO_OF_SECOND || interfaceC1607p == EnumC1592a.MICRO_OF_SECOND || interfaceC1607p == EnumC1592a.MILLI_OF_SECOND;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    public final int hashCode() {
        long j = this.f10611a;
        return (this.f10612b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        int i;
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        int i2 = AbstractC1552f.f10698a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i2 == 1) {
            i = this.f10612b;
        } else if (i2 == 2) {
            i = this.f10612b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.f10611a;
                }
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
            }
            i = this.f10612b / 1000000;
        }
        return i;
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantM23941E = m23941E(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, instantM23941E);
        }
        switch (AbstractC1552f.f10699b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantM23941E.f10611a, this.f10611a), 1000000000L), instantM23941E.f10612b - this.f10612b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantM23941E.f10611a, this.f10611a), 1000000000L), instantM23941E.f10612b - this.f10612b) / 1000;
            case 3:
                return Math.subtractExact(instantM23941E.toEpochMilli(), toEpochMilli());
            case 4:
                return m23947a0(instantM23941E);
            case 5:
                return m23947a0(instantM23941E) / 60;
            case 6:
                return m23947a0(instantM23941E) / 3600;
            case 7:
                return m23947a0(instantM23941E) / 43200;
            case 8:
                return m23947a0(instantM23941E) / 86400;
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    public long toEpochMilli() {
        long j = this.f10611a;
        return (j >= 0 || this.f10612b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), this.f10612b / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000), (this.f10612b / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.f10700f.m24062a(this);
    }
}
