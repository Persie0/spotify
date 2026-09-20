package p196j$.time.temporal;

import p196j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface TemporalUnit {
    /* JADX INFO: renamed from: E */
    Temporal mo24160E(Temporal temporal, long j);

    Duration getDuration();

    boolean isDurationEstimated();

    /* JADX INFO: renamed from: r */
    long mo24161r(Temporal temporal, Temporal temporal2);
}
