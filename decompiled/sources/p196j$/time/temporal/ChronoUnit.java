package p196j$.time.temporal;

import p196j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: a */
    public final String f10813a;

    /* JADX INFO: renamed from: b */
    public final Duration f10814b;

    ChronoUnit(String str, Duration duration) {
        this.f10813a = str;
        this.f10814b = duration;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: E */
    public final Temporal mo24160E(Temporal temporal, long j) {
        return temporal.mo23950e(j, this);
    }

    @Override // p196j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f10814b;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // p196j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: r */
    public final long mo24161r(Temporal temporal, Temporal temporal2) {
        return temporal.mo23953l(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10813a;
    }
}
