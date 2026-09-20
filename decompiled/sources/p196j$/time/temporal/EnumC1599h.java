package p196j$.time.temporal;

import p196j$.time.Duration;

/* JADX INFO: renamed from: j$.time.temporal.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC1599h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));


    /* JADX INFO: renamed from: a */
    public final String f10822a;

    /* JADX INFO: renamed from: b */
    public final Duration f10823b;

    EnumC1599h(String str, Duration duration) {
        this.f10822a = str;
        this.f10823b = duration;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: E */
    public final Temporal mo24160E(Temporal temporal, long j) {
        int i = AbstractC1593b.f10818a[ordinal()];
        if (i == 1) {
            EnumC1598g enumC1598g = AbstractC1600i.f10826c;
            return temporal.mo23948c(Math.addExact(temporal.mo23952g(enumC1598g), j), enumC1598g);
        }
        if (i == 2) {
            return temporal.mo23950e(j / 4, ChronoUnit.YEARS).mo23950e((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p196j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f10823b;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: r */
    public final long mo24161r(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.mo23953l(temporal2, this);
        }
        int i = AbstractC1593b.f10818a[ordinal()];
        if (i == 1) {
            EnumC1598g enumC1598g = AbstractC1600i.f10826c;
            return Math.subtractExact(temporal2.mo23843i(enumC1598g), temporal.mo23843i(enumC1598g));
        }
        if (i == 2) {
            return temporal.mo23953l(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10822a;
    }
}
