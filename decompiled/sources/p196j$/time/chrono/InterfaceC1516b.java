package p196j$.time.chrono;

import p196j$.time.C1580i;
import p196j$.time.C1583l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC1516b extends Temporal, InterfaceC1604m, Comparable {
    /* JADX INFO: renamed from: M */
    default long mo24011M() {
        return mo23843i(EnumC1592a.EPOCH_DAY);
    }

    /* JADX INFO: renamed from: N */
    default ChronoLocalDateTime mo24012N(C1583l c1583l) {
        return new C1524f(this, c1583l);
    }

    /* JADX INFO: renamed from: Q */
    default InterfaceC1536m mo24013Q() {
        return getChronology().mo24001F(mo23952g(EnumC1592a.ERA));
    }

    /* JADX INFO: renamed from: V */
    InterfaceC1516b mo24014V(InterfaceC1606o interfaceC1606o);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC1516b interfaceC1516b) {
        int iCompare = Long.compare(mo24011M(), interfaceC1516b.mo24011M());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1514a) getChronology()).mo24008o().compareTo(interfaceC1516b.getChronology().mo24008o());
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    default InterfaceC1516b mo23946a(long j, TemporalUnit temporalUnit) {
        return AbstractC1520d.m24023r(getChronology(), super.mo23946a(j, temporalUnit));
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    default Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10834a || c1580i == AbstractC1608q.f10838e || c1580i == AbstractC1608q.f10837d || c1580i == AbstractC1608q.f10840g) {
            return null;
        }
        if (c1580i == AbstractC1608q.f10835b) {
            return getChronology();
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.DAYS : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    InterfaceC1516b mo23948c(long j, InterfaceC1607p interfaceC1607p);

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    InterfaceC1516b mo23950e(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    default Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(mo24011M(), EnumC1592a.EPOCH_DAY);
    }

    InterfaceC1535l getChronology();

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    default boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).isDateBased();
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    int hashCode();

    /* JADX INFO: renamed from: k */
    InterfaceC1516b mo23989k(InterfaceC1604m interfaceC1604m);

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    long mo23953l(Temporal temporal, TemporalUnit temporalUnit);

    String toString();
}
