package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.chrono.ChronoLocalDateTime;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1530i;
import p196j$.time.format.DateTimeFormatter;
import p196j$.time.format.DateTimeParseException;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class LocalDateTime implements Temporal, InterfaceC1604m, ChronoLocalDateTime<C1579h>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final LocalDateTime f10613c = m23955T(C1579h.f10779d, C1583l.f10788e);

    /* JADX INFO: renamed from: d */
    public static final LocalDateTime f10614d = m23955T(C1579h.f10780e, C1583l.f10789f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a */
    public final C1579h f10615a;

    /* JADX INFO: renamed from: b */
    public final C1583l f10616b;

    public LocalDateTime(C1579h c1579h, C1583l c1583l) {
        this.f10615a = c1579h;
        this.f10616b = c1583l;
    }

    /* JADX INFO: renamed from: E */
    public static LocalDateTime m23954E(InterfaceC1603l interfaceC1603l) {
        if (interfaceC1603l instanceof LocalDateTime) {
            return (LocalDateTime) interfaceC1603l;
        }
        if (interfaceC1603l instanceof ZonedDateTime) {
            return ((ZonedDateTime) interfaceC1603l).toLocalDateTime();
        }
        if (interfaceC1603l instanceof OffsetDateTime) {
            return ((OffsetDateTime) interfaceC1603l).toLocalDateTime();
        }
        try {
            return new LocalDateTime(C1579h.m24111K(interfaceC1603l), C1583l.m24136K(interfaceC1603l));
        } catch (C1512b e) {
            throw new C1512b("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: T */
    public static LocalDateTime m23955T(C1579h c1579h, C1583l c1583l) {
        Objects.requireNonNull(c1579h, "date");
        Objects.requireNonNull(c1583l, "time");
        return new LocalDateTime(c1579h, c1583l);
    }

    /* JADX INFO: renamed from: Z */
    public static LocalDateTime m23956Z(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        EnumC1592a.NANO_OF_SECOND.m24165a0(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        long j3 = 86400;
        return new LocalDateTime(C1579h.m24114i0(Math.floorDiv(totalSeconds, j3)), C1583l.m24138a0((((long) ((int) Math.floorMod(totalSeconds, j3))) * 1000000000) + j2));
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C1580i c1580i = new C1580i(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (LocalDateTime) dateTimeFormatter.m24063b(charSequence).mo23841b(c1580i);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 5, this);
    }

    @Override // p196j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: J */
    public final InterfaceC1530i mo23957J(ZoneId zoneId) {
        return ZonedDateTime.m23983K(this, zoneId, null);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m23958K(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m23965r((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jMo24011M = this.f10615a.mo24011M();
        long jMo24011M2 = chronoLocalDateTime.toLocalDate().mo24011M();
        if (jMo24011M >= jMo24011M2) {
            return jMo24011M == jMo24011M2 && this.f10616b.m24146h0() < chronoLocalDateTime.toLocalTime().m24146h0();
        }
        return true;
    }

    @Override // p196j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? m23965r((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final ChronoLocalDateTime mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo23950e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.mo24160E(this, j);
        }
        switch (AbstractC1581j.f10785a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m23962c0(this.f10615a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeM23964e0 = m23964e0(this.f10615a.m24126l0(j / 86400000000L), this.f10616b);
                return localDateTimeM23964e0.m23962c0(localDateTimeM23964e0.f10615a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeM23964e1 = m23964e0(this.f10615a.m24126l0(j / 86400000), this.f10616b);
                return localDateTimeM23964e1.m23962c0(localDateTimeM23964e1.f10615a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m23961b0(j);
            case 5:
                return m23962c0(this.f10615a, 0L, j, 0L, 0L);
            case 6:
                return m23962c0(this.f10615a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeM23964e2 = m23964e0(this.f10615a.m24126l0(j / 256), this.f10616b);
                return localDateTimeM23964e2.m23962c0(localDateTimeM23964e2.f10615a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m23964e0(this.f10615a.mo23950e(j, temporalUnit), this.f10616b);
        }
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return new OffsetDateTime(this, zoneOffset);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10839f ? this.f10615a : super.mo23841b(c1580i);
    }

    /* JADX INFO: renamed from: b0 */
    public final LocalDateTime m23961b0(long j) {
        return m23962c0(this.f10615a, 0L, 0L, j, 0L);
    }

    /* JADX INFO: renamed from: c0 */
    public final LocalDateTime m23962c0(C1579h c1579h, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m23964e0(c1579h, this.f10616b);
        }
        long j5 = 1;
        long jM24146h0 = this.f10616b.m24146h0();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jM24146h0;
        long jFloorDiv = Math.floorDiv(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jFloorMod = Math.floorMod(j6, 86400000000000L);
        return m23964e0(c1579h.m24126l0(jFloorDiv), jFloorMod == jM24146h0 ? this.f10616b : C1583l.m24138a0(jFloorMod));
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final ChronoLocalDateTime mo23989k(C1579h c1579h) {
        return m23964e0(c1579h, this.f10616b);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0() ? m23964e0(this.f10615a, this.f10616b.mo23948c(j, interfaceC1607p)) : m23964e0(this.f10615a.mo23948c(j, interfaceC1607p), this.f10616b);
        }
        return (LocalDateTime) interfaceC1607p.mo24164Z(this, j);
    }

    /* JADX INFO: renamed from: e0 */
    public final LocalDateTime m23964e0(C1579h c1579h, C1583l c1583l) {
        return (this.f10615a == c1579h && this.f10616b == c1583l) ? this : new LocalDateTime(c1579h, c1583l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f10615a.equals(localDateTime.f10615a) && this.f10616b.equals(localDateTime.f10616b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.m24062a(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0() ? this.f10616b.mo23952g(interfaceC1607p) : this.f10615a.mo23952g(interfaceC1607p);
        }
        return super.mo23952g(interfaceC1607p);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        return enumC1592a.isDateBased() || enumC1592a.m24166b0();
    }

    public final int hashCode() {
        return this.f10615a.hashCode() ^ this.f10616b.hashCode();
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0() ? this.f10616b.mo23843i(interfaceC1607p) : this.f10615a.mo23843i(interfaceC1607p);
        }
        return interfaceC1607p.mo24163T(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0() ? this.f10616b.mo23920j(interfaceC1607p) : this.f10615a.mo23920j(interfaceC1607p);
        }
        return interfaceC1607p.mo24162E(this);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        LocalDateTime localDateTimeM23954E = m23954E(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, localDateTimeM23954E);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            C1579h c1579hM24126l0 = localDateTimeM23954E.f10615a;
            C1579h c1579h = this.f10615a;
            if (c1579h == null) {
                if (c1579hM24126l0.mo24011M() > c1579h.mo24011M()) {
                    if (localDateTimeM23954E.f10616b.compareTo(this.f10616b) < 0) {
                        c1579hM24126l0 = c1579hM24126l0.m24126l0(-1L);
                    }
                }
                return this.f10615a.mo23953l(c1579hM24126l0, temporalUnit);
            }
            c1579hM24126l0.getClass();
            if (c1579hM24126l0.m24131r(c1579h) > 0) {
                if (localDateTimeM23954E.f10616b.compareTo(this.f10616b) < 0) {
                    c1579hM24126l0 = c1579hM24126l0.m24126l0(-1L);
                }
            }
            return this.f10615a.mo23953l(c1579hM24126l0, temporalUnit);
            if (c1579hM24126l0.m24121c0(this.f10615a) && localDateTimeM23954E.f10616b.compareTo(this.f10616b) > 0) {
                c1579hM24126l0 = c1579hM24126l0.m24126l0(1L);
            }
            return this.f10615a.mo23953l(c1579hM24126l0, temporalUnit);
        }
        C1579h c1579h2 = this.f10615a;
        C1579h c1579h3 = localDateTimeM23954E.f10615a;
        c1579h2.getClass();
        long jMo24011M = c1579h3.mo24011M() - c1579h2.mo24011M();
        if (jMo24011M == 0) {
            return this.f10616b.mo23953l(localDateTimeM23954E.f10616b, temporalUnit);
        }
        long jM24146h0 = localDateTimeM23954E.f10616b.m24146h0() - this.f10616b.m24146h0();
        if (jMo24011M > 0) {
            jMultiplyExact = jMo24011M - 1;
            j = jM24146h0 + 86400000000000L;
        } else {
            jMultiplyExact = jMo24011M + 1;
            j = jM24146h0 - 86400000000000L;
        }
        switch (AbstractC1581j.f10785a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    /* JADX INFO: renamed from: r */
    public final int m23965r(LocalDateTime localDateTime) {
        int iM24131r = this.f10615a.m24131r(localDateTime.f10615a);
        return iM24131r == 0 ? this.f10616b.compareTo(localDateTime.f10616b) : iM24131r;
    }

    @Override // p196j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC1516b toLocalDate() {
        return this.f10615a;
    }

    @Override // p196j$.time.chrono.ChronoLocalDateTime
    public final C1583l toLocalTime() {
        return this.f10616b;
    }

    public final String toString() {
        return this.f10615a.toString() + "T" + this.f10616b.toString();
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo23989k(C1579h c1579h) {
        return m23964e0(c1579h, this.f10616b);
    }
}
