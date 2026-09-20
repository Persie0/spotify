package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1530i;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;
import p196j$.time.zone.C1618b;
import p196j$.time.zone.ZoneRules;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class ZonedDateTime implements Temporal, InterfaceC1530i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a */
    public final LocalDateTime f10627a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f10628b;

    /* JADX INFO: renamed from: c */
    public final ZoneId f10629c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f10627a = localDateTime;
        this.f10628b = zoneOffset;
        this.f10629c = zoneId;
    }

    /* JADX INFO: renamed from: E */
    public static ZonedDateTime m23982E(InterfaceC1603l interfaceC1603l) {
        if (interfaceC1603l instanceof ZonedDateTime) {
            return (ZonedDateTime) interfaceC1603l;
        }
        try {
            ZoneId zoneIdM23972r = ZoneId.m23972r(interfaceC1603l);
            EnumC1592a enumC1592a = EnumC1592a.INSTANT_SECONDS;
            return interfaceC1603l.mo23842h(enumC1592a) ? m23984r(interfaceC1603l.mo23843i(enumC1592a), interfaceC1603l.mo23952g(EnumC1592a.NANO_OF_SECOND), zoneIdM23972r) : m23983K(LocalDateTime.m23955T(C1579h.m24111K(interfaceC1603l), C1583l.m24136K(interfaceC1603l)), zoneIdM23972r, null);
        } catch (C1512b e) {
            throw new C1512b("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: K */
    public static ZonedDateTime m23983K(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listM24198f = rules.m24198f(localDateTime);
        if (listM24198f.size() == 1) {
            zoneOffset = (ZoneOffset) listM24198f.get(0);
        } else if (listM24198f.size() == 0) {
            Object objM24197e = rules.m24197e(localDateTime);
            C1618b c1618b = objM24197e instanceof C1618b ? (C1618b) objM24197e : null;
            localDateTime = localDateTime.m23961b0(Duration.ofSeconds(c1618b.f10877d.getTotalSeconds() - c1618b.f10876c.getTotalSeconds()).getSeconds());
            zoneOffset = c1618b.f10877d;
        } else if (zoneOffset == null || !listM24198f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listM24198f.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: renamed from: r */
    public static ZonedDateTime m23984r(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetM24196d = zoneId.getRules().m24196d(Instant.m23942K(j, i));
        return new ZonedDateTime(LocalDateTime.m23956Z(j, i, zoneOffsetM24196d), zoneId, zoneOffsetM24196d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 6, this);
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    /* JADX INFO: renamed from: I */
    public final InterfaceC1530i mo23985I(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f10629c.equals(zoneId) ? this : m23983K(this.f10627a, zoneId, this.f10628b);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo23950e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.mo24160E(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return m23983K(this.f10627a.mo23950e(j, temporalUnit), this.f10629c, this.f10628b);
        }
        LocalDateTime localDateTimeMo23950e = this.f10627a.mo23950e(j, temporalUnit);
        ZoneOffset zoneOffset = this.f10628b;
        ZoneId zoneId = this.f10629c;
        Objects.requireNonNull(localDateTimeMo23950e, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.getRules().m24198f(localDateTimeMo23950e).contains(zoneOffset) ? new ZonedDateTime(localDateTimeMo23950e, zoneId, zoneOffset) : m23984r(localDateTimeMo23950e.toEpochSecond(zoneOffset), localDateTimeMo23950e.f10616b.f10795d, zoneId);
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ZonedDateTime mo23989k(C1579h c1579h) {
        return m23983K(LocalDateTime.m23955T(c1579h, this.f10627a.f10616b), this.f10629c, this.f10628b);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final InterfaceC1530i mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo23990m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f10629c.equals(zoneId) ? this : m23984r(this.f10627a.toEpochSecond(this.f10628b), this.f10627a.f10616b.f10795d, zoneId);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10839f ? this.f10627a.f10615a : super.mo23841b(c1580i);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (ZonedDateTime) interfaceC1607p.mo24164Z(this, j);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        int i = AbstractC1511a0.f10632a[enumC1592a.ordinal()];
        if (i == 1) {
            return m23984r(j, this.f10627a.f10616b.f10795d, this.f10629c);
        }
        if (i != 2) {
            return m23983K(this.f10627a.mo23948c(j, interfaceC1607p), this.f10629c, this.f10628b);
        }
        ZoneOffset zoneOffsetM23978d0 = ZoneOffset.m23978d0(enumC1592a.f10817b.m24175a(j, enumC1592a));
        return (zoneOffsetM23978d0.equals(this.f10628b) || !this.f10629c.getRules().m24198f(this.f10627a).contains(zoneOffsetM23978d0)) ? this : new ZonedDateTime(this.f10627a, this.f10629c, zoneOffsetM23978d0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f10627a.equals(zonedDateTime.f10627a) && this.f10628b.equals(zonedDateTime.f10628b) && this.f10629c.equals(zonedDateTime.f10629c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return super.mo23952g(interfaceC1607p);
        }
        int i = AbstractC1511a0.f10632a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f10627a.mo23952g(interfaceC1607p) : this.f10628b.getTotalSeconds();
        }
        throw new C1609r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    public final ZoneOffset getOffset() {
        return this.f10628b;
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    public ZoneId getZone() {
        return this.f10629c;
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
        return (this.f10627a.hashCode() ^ this.f10628b.f10625b) ^ Integer.rotateLeft(this.f10629c.hashCode(), 3);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        int i = AbstractC1511a0.f10632a[((EnumC1592a) interfaceC1607p).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f10627a.mo23843i(interfaceC1607p) : this.f10628b.getTotalSeconds();
        }
        return toEpochSecond();
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return (interfaceC1607p == EnumC1592a.INSTANT_SECONDS || interfaceC1607p == EnumC1592a.OFFSET_SECONDS) ? ((EnumC1592a) interfaceC1607p).f10817b : this.f10627a.mo23920j(interfaceC1607p);
        }
        return interfaceC1607p.mo24162E(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeM23982E = m23982E(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, zonedDateTimeM23982E);
        }
        ZonedDateTime zonedDateTimeMo23990m = zonedDateTimeM23982E.mo23990m(this.f10629c);
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return (chronoUnit.compareTo(ChronoUnit.DAYS) < 0 || chronoUnit == ChronoUnit.FOREVER) ? new OffsetDateTime(this.f10627a, this.f10628b).mo23953l(new OffsetDateTime(zonedDateTimeMo23990m.f10627a, zonedDateTimeMo23990m.f10628b), temporalUnit) : this.f10627a.mo23953l(zonedDateTimeMo23990m.f10627a, temporalUnit);
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    public final InterfaceC1516b toLocalDate() {
        return this.f10627a.f10615a;
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    public final C1583l toLocalTime() {
        return this.f10627a.f10616b;
    }

    public final String toString() {
        String str = this.f10627a.toString() + this.f10628b.f10626c;
        ZoneOffset zoneOffset = this.f10628b;
        ZoneId zoneId = this.f10629c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.chrono.InterfaceC1530i
    public LocalDateTime toLocalDateTime() {
        return this.f10627a;
    }
}
