package p196j$.time.chrono;

import java.util.Objects;
import p196j$.time.C1579h;
import p196j$.time.C1580i;
import p196j$.time.C1583l;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface ChronoLocalDateTime<D extends InterfaceC1516b> extends Temporal, InterfaceC1604m, Comparable<ChronoLocalDateTime<?>> {
    /* JADX INFO: renamed from: J */
    InterfaceC1530i mo23957J(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: S */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? ((AbstractC1514a) getChronology()).mo24008o().compareTo(chronoLocalDateTime.getChronology().mo24008o()) : iCompareTo;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    default Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10834a || c1580i == AbstractC1608q.f10838e || c1580i == AbstractC1608q.f10837d) {
            return null;
        }
        if (c1580i == AbstractC1608q.f10840g) {
            return toLocalTime();
        }
        if (c1580i == AbstractC1608q.f10835b) {
            return getChronology();
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.NANOS : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    ChronoLocalDateTime mo23948c(long j, InterfaceC1607p interfaceC1607p);

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    ChronoLocalDateTime mo23950e(long j, TemporalUnit temporalUnit);

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    default Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(toLocalDate().mo24011M(), EnumC1592a.EPOCH_DAY).mo23948c(toLocalTime().m24146h0(), EnumC1592a.NANO_OF_DAY);
    }

    default InterfaceC1535l getChronology() {
        return toLocalDate().getChronology();
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().mo24011M() * 86400) + ((long) toLocalTime().m24147i0())) - ((long) zoneOffset.getTotalSeconds());
    }

    InterfaceC1516b toLocalDate();

    C1583l toLocalTime();

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    default ChronoLocalDateTime mo23946a(long j, TemporalUnit temporalUnit) {
        return C1524f.m24025r(getChronology(), super.mo23946a(j, temporalUnit));
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    default ChronoLocalDateTime mo23989k(C1579h c1579h) {
        return C1524f.m24025r(getChronology(), c1579h.mo23951f(this));
    }
}
