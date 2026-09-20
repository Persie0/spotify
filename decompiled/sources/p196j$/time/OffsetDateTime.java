package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.chrono.C1542s;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class OffsetDateTime implements Temporal, InterfaceC1604m, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f10617c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a */
    public final LocalDateTime f10618a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f10619b;

    static {
        LocalDateTime.f10613c.atOffset(ZoneOffset.f10624g);
        LocalDateTime.f10614d.atOffset(ZoneOffset.f10623f);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f10618a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f10619b = zoneOffset;
    }

    /* JADX INFO: renamed from: r */
    public static OffsetDateTime m23966r(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetM24196d = zoneId.getRules().m24196d(instant);
        return new OffsetDateTime(LocalDateTime.m23956Z(instant.f10611a, instant.f10612b, zoneOffsetM24196d), zoneOffsetM24196d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 10, this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime mo23950e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? m23968K(this.f10618a.mo23950e(j, temporalUnit), this.f10619b) : (OffsetDateTime) temporalUnit.mo24160E(this, j);
    }

    /* JADX INFO: renamed from: K */
    public final OffsetDateTime m23968K(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f10618a == localDateTime && this.f10619b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10837d || c1580i == AbstractC1608q.f10838e) {
            return this.f10619b;
        }
        if (c1580i == AbstractC1608q.f10834a) {
            return null;
        }
        if (c1580i == AbstractC1608q.f10839f) {
            return this.f10618a.f10615a;
        }
        if (c1580i == AbstractC1608q.f10840g) {
            return this.f10618a.f10616b;
        }
        if (c1580i == AbstractC1608q.f10835b) {
            return C1542s.f10679c;
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.NANOS : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (OffsetDateTime) interfaceC1607p.mo24164Z(this, j);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        int i = AbstractC1588q.f10803a[enumC1592a.ordinal()];
        if (i != 1) {
            return i != 2 ? m23968K(this.f10618a.mo23948c(j, interfaceC1607p), this.f10619b) : m23968K(this.f10618a, ZoneOffset.m23978d0(enumC1592a.f10817b.m24175a(j, enumC1592a)));
        }
        return m23966r(Instant.m23942K(j, this.f10618a.f10616b.f10795d), this.f10619b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f10619b.equals(offsetDateTime2.f10619b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f10618a.toEpochSecond(this.f10619b), offsetDateTime2.f10618a.toEpochSecond(offsetDateTime2.f10619b));
            if (iCompare == 0) {
                iCompare = this.f10618a.f10616b.f10795d - offsetDateTime2.f10618a.f10616b.f10795d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo23989k(C1579h c1579h) {
        LocalDateTime localDateTime = this.f10618a;
        return m23968K(localDateTime.m23964e0(c1579h, localDateTime.f10616b), this.f10619b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f10618a.equals(offsetDateTime.f10618a) && this.f10619b.equals(offsetDateTime.f10619b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(this.f10618a.f10615a.mo24011M(), EnumC1592a.EPOCH_DAY).mo23948c(this.f10618a.f10616b.m24146h0(), EnumC1592a.NANO_OF_DAY).mo23948c(this.f10619b.getTotalSeconds(), EnumC1592a.OFFSET_SECONDS);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return super.mo23952g(interfaceC1607p);
        }
        int i = AbstractC1588q.f10803a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f10618a.mo23952g(interfaceC1607p) : this.f10619b.getTotalSeconds();
        }
        throw new C1609r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return true;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    public final int hashCode() {
        return this.f10618a.hashCode() ^ this.f10619b.f10625b;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        int i = AbstractC1588q.f10803a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f10618a.mo23843i(interfaceC1607p) : this.f10619b.getTotalSeconds();
        }
        return this.f10618a.toEpochSecond(this.f10619b);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return (interfaceC1607p == EnumC1592a.INSTANT_SECONDS || interfaceC1607p == EnumC1592a.OFFSET_SECONDS) ? ((EnumC1592a) interfaceC1607p).f10817b : this.f10618a.mo23920j(interfaceC1607p);
        }
        return interfaceC1607p.mo24162E(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetM23975a0 = ZoneOffset.m23975a0(temporal);
                C1579h c1579h = (C1579h) temporal.mo23841b(AbstractC1608q.f10839f);
                C1583l c1583l = (C1583l) temporal.mo23841b(AbstractC1608q.f10840g);
                temporal = (c1579h == null || c1583l == null) ? m23966r(Instant.m23941E(temporal), zoneOffsetM23975a0) : new OffsetDateTime(LocalDateTime.m23955T(c1579h, c1583l), zoneOffsetM23975a0);
            } catch (C1512b e) {
                throw new C1512b("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, temporal);
        }
        ZoneOffset zoneOffset = this.f10619b;
        if (!zoneOffset.equals(temporal.f10619b)) {
            offsetDateTime = temporal;
            offsetDateTime = new OffsetDateTime(temporal.f10618a.m23961b0(zoneOffset.getTotalSeconds() - temporal.f10619b.getTotalSeconds()), zoneOffset);
        }
        offsetDateTime = temporal;
        return this.f10618a.mo23953l(offsetDateTime.f10618a, temporalUnit);
    }

    public OffsetDateTime plusMinutes(long j) {
        LocalDateTime localDateTime = this.f10618a;
        return m23968K(localDateTime.m23962c0(localDateTime.f10615a, 0L, j, 0L, 0L), this.f10619b);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.f10618a;
        return Instant.m23942K(localDateTime.toEpochSecond(this.f10619b), localDateTime.toLocalTime().f10795d);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f10618a;
    }

    public final String toString() {
        return this.f10618a.toString() + this.f10619b.f10626c;
    }
}
