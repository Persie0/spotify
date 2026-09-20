package p196j$.time.temporal;

import p196j$.time.C1579h;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface Temporal extends InterfaceC1603l {
    /* JADX INFO: renamed from: a */
    default Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    /* JADX INFO: renamed from: c */
    Temporal mo23948c(long j, InterfaceC1607p interfaceC1607p);

    /* JADX INFO: renamed from: d */
    default Temporal mo24016k(C1579h c1579h) {
        return c1579h.mo23951f(this);
    }

    /* JADX INFO: renamed from: e */
    Temporal mo23950e(long j, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: l */
    long mo23953l(Temporal temporal, TemporalUnit temporalUnit);
}
