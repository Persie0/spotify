package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum dce implements dz61 {
    NANO_OF_SECOND("NanoOfSecond", a4b1.m24687d(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", a4b1.m24687d(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", a4b1.m24687d(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", a4b1.m24687d(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", a4b1.m24687d(0, 999)),
    MILLI_OF_DAY("MilliOfDay", a4b1.m24687d(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", a4b1.m24687d(0, 59)),
    SECOND_OF_DAY("SecondOfDay", a4b1.m24687d(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", a4b1.m24687d(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", a4b1.m24687d(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", a4b1.m24687d(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", a4b1.m24687d(1, 12)),
    HOUR_OF_DAY("HourOfDay", a4b1.m24687d(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", a4b1.m24687d(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", a4b1.m24687d(0, 1)),
    DAY_OF_WEEK("DayOfWeek", a4b1.m24687d(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", a4b1.m24687d(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", a4b1.m24687d(1, 7)),
    DAY_OF_MONTH("DayOfMonth", a4b1.m24688e(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", a4b1.m24688e(1, 365, 366)),
    EPOCH_DAY("EpochDay", a4b1.m24687d(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", a4b1.m24688e(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", a4b1.m24687d(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", a4b1.m24687d(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", a4b1.m24687d(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", a4b1.m24688e(1, 999999999, 1000000000)),
    YEAR("Year", a4b1.m24687d(-999999999, 999999999)),
    ERA("Era", a4b1.m24687d(0, 1)),
    INSTANT_SECONDS("InstantSeconds", a4b1.m24687d(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", a4b1.m24687d(-64800, 64800));


    /* JADX INFO: renamed from: a */
    public final String f47537a;

    /* JADX INFO: renamed from: b */
    public final a4b1 f47538b;

    static {
        gce gceVar = gce.NANOS;
    }

    dce(String str, a4b1 a4b1Var) {
        this.f47537a = str;
        this.f47538b = a4b1Var;
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: a */
    public final boolean mo35640a(bz61 bz61Var) {
        return bz61Var.mo26516d(this);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: b */
    public final az61 mo35641b(az61 az61Var, long j) {
        return az61Var.mo27575l(j, this);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: c */
    public final a4b1 mo35642c(bz61 bz61Var) {
        return bz61Var.mo30953j(this);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: d */
    public final bz61 mo35643d(HashMap map, ano anoVar, z0x0 z0x0Var) {
        return null;
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: e */
    public final long mo35644e(bz61 bz61Var) {
        return bz61Var.mo26517g(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m35645f(long j) {
        this.f47538b.m24690b(j, this);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m35646g() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p204p.dz61
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p204p.dz61
    public final a4b1 range() {
        return this.f47538b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f47537a;
    }
}
