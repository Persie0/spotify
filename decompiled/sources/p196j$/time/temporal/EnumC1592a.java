package p196j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1592a implements InterfaceC1607p {
    public static final EnumC1592a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC1592a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC1592a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC1592a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC1592a AMPM_OF_DAY;
    public static final EnumC1592a CLOCK_HOUR_OF_AMPM;
    public static final EnumC1592a CLOCK_HOUR_OF_DAY;
    public static final EnumC1592a DAY_OF_MONTH;
    public static final EnumC1592a DAY_OF_WEEK;
    public static final EnumC1592a DAY_OF_YEAR;
    public static final EnumC1592a EPOCH_DAY;
    public static final EnumC1592a ERA;
    public static final EnumC1592a HOUR_OF_AMPM;
    public static final EnumC1592a HOUR_OF_DAY;
    public static final EnumC1592a INSTANT_SECONDS;
    public static final EnumC1592a MICRO_OF_DAY;
    public static final EnumC1592a MICRO_OF_SECOND;
    public static final EnumC1592a MILLI_OF_DAY;
    public static final EnumC1592a MILLI_OF_SECOND;
    public static final EnumC1592a MINUTE_OF_DAY;
    public static final EnumC1592a MINUTE_OF_HOUR;
    public static final EnumC1592a MONTH_OF_YEAR;
    public static final EnumC1592a NANO_OF_DAY;
    public static final EnumC1592a NANO_OF_SECOND;
    public static final EnumC1592a OFFSET_SECONDS;
    public static final EnumC1592a PROLEPTIC_MONTH;
    public static final EnumC1592a SECOND_OF_DAY;
    public static final EnumC1592a SECOND_OF_MINUTE;
    public static final EnumC1592a YEAR;
    public static final EnumC1592a YEAR_OF_ERA;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC1592a[] f10815c;

    /* JADX INFO: renamed from: a */
    public final String f10816a;

    /* JADX INFO: renamed from: b */
    public final C1610s f10817b;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        EnumC1592a enumC1592a = new EnumC1592a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, C1610s.m24173f(0L, 999999999L));
        NANO_OF_SECOND = enumC1592a;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        EnumC1592a enumC1592a2 = new EnumC1592a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, C1610s.m24173f(0L, 86399999999999L));
        NANO_OF_DAY = enumC1592a2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        EnumC1592a enumC1592a3 = new EnumC1592a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, C1610s.m24173f(0L, 999999L));
        MICRO_OF_SECOND = enumC1592a3;
        EnumC1592a enumC1592a4 = new EnumC1592a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, C1610s.m24173f(0L, 86399999999L));
        MICRO_OF_DAY = enumC1592a4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        EnumC1592a enumC1592a5 = new EnumC1592a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, C1610s.m24173f(0L, 999L));
        MILLI_OF_SECOND = enumC1592a5;
        EnumC1592a enumC1592a6 = new EnumC1592a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, C1610s.m24173f(0L, 86399999L));
        MILLI_OF_DAY = enumC1592a6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        EnumC1592a enumC1592a7 = new EnumC1592a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, C1610s.m24173f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC1592a7;
        EnumC1592a enumC1592a8 = new EnumC1592a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, C1610s.m24173f(0L, 86399L));
        SECOND_OF_DAY = enumC1592a8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        EnumC1592a enumC1592a9 = new EnumC1592a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, C1610s.m24173f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC1592a9;
        EnumC1592a enumC1592a10 = new EnumC1592a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, C1610s.m24173f(0L, 1439L));
        MINUTE_OF_DAY = enumC1592a10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        EnumC1592a enumC1592a11 = new EnumC1592a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, C1610s.m24173f(0L, 11L));
        HOUR_OF_AMPM = enumC1592a11;
        EnumC1592a enumC1592a12 = new EnumC1592a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, C1610s.m24173f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC1592a12;
        EnumC1592a enumC1592a13 = new EnumC1592a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, C1610s.m24173f(0L, 23L), 0);
        HOUR_OF_DAY = enumC1592a13;
        EnumC1592a enumC1592a14 = new EnumC1592a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, C1610s.m24173f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC1592a14;
        EnumC1592a enumC1592a15 = new EnumC1592a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, C1610s.m24173f(0L, 1L), 0);
        AMPM_OF_DAY = enumC1592a15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        EnumC1592a enumC1592a16 = new EnumC1592a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, C1610s.m24173f(1L, 7L), 0);
        DAY_OF_WEEK = enumC1592a16;
        EnumC1592a enumC1592a17 = new EnumC1592a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, C1610s.m24173f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC1592a17;
        EnumC1592a enumC1592a18 = new EnumC1592a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, C1610s.m24173f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC1592a18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        EnumC1592a enumC1592a19 = new EnumC1592a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, C1610s.m24174g(28L, 31L), 0);
        DAY_OF_MONTH = enumC1592a19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        EnumC1592a enumC1592a20 = new EnumC1592a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, C1610s.m24174g(365L, 366L));
        DAY_OF_YEAR = enumC1592a20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        EnumC1592a enumC1592a21 = new EnumC1592a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, C1610s.m24173f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC1592a21;
        EnumC1592a enumC1592a22 = new EnumC1592a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, C1610s.m24174g(4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC1592a22;
        EnumC1592a enumC1592a23 = new EnumC1592a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, C1610s.m24173f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC1592a23;
        EnumC1592a enumC1592a24 = new EnumC1592a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, C1610s.m24173f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC1592a24;
        EnumC1592a enumC1592a25 = new EnumC1592a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, C1610s.m24173f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC1592a25;
        EnumC1592a enumC1592a26 = new EnumC1592a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, C1610s.m24174g(999999999L, 1000000000L));
        YEAR_OF_ERA = enumC1592a26;
        EnumC1592a enumC1592a27 = new EnumC1592a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, C1610s.m24173f(-999999999L, 999999999L), 0);
        YEAR = enumC1592a27;
        EnumC1592a enumC1592a28 = new EnumC1592a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, C1610s.m24173f(0L, 1L), 0);
        ERA = enumC1592a28;
        EnumC1592a enumC1592a29 = new EnumC1592a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, C1610s.m24173f(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC1592a29;
        EnumC1592a enumC1592a30 = new EnumC1592a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, C1610s.m24173f(-64800L, 64800L));
        OFFSET_SECONDS = enumC1592a30;
        f10815c = new EnumC1592a[]{enumC1592a, enumC1592a2, enumC1592a3, enumC1592a4, enumC1592a5, enumC1592a6, enumC1592a7, enumC1592a8, enumC1592a9, enumC1592a10, enumC1592a11, enumC1592a12, enumC1592a13, enumC1592a14, enumC1592a15, enumC1592a16, enumC1592a17, enumC1592a18, enumC1592a19, enumC1592a20, enumC1592a21, enumC1592a22, enumC1592a23, enumC1592a24, enumC1592a25, enumC1592a26, enumC1592a27, enumC1592a28, enumC1592a29, enumC1592a30};
    }

    public EnumC1592a(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C1610s c1610s) {
        super(str, i);
        this.f10816a = str2;
        this.f10817b = c1610s;
    }

    public static EnumC1592a valueOf(String str) {
        return (EnumC1592a) Enum.valueOf(EnumC1592a.class, str);
    }

    public static EnumC1592a[] values() {
        return (EnumC1592a[]) f10815c.clone();
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: E */
    public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l.mo23920j(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: T */
    public final long mo24163T(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l.mo23843i(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: Z */
    public final Temporal mo24164Z(Temporal temporal, long j) {
        return temporal.mo23948c(j, this);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24165a0(long j) {
        this.f10817b.m24176b(j, this);
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m24166b0() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: r */
    public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l.mo23842h(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    public final C1610s range() {
        return this.f10817b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10816a;
    }

    public EnumC1592a(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C1610s c1610s, int i2) {
        super(str, i);
        this.f10816a = str2;
        this.f10817b = c1610s;
    }
}
