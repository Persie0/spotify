package p196j$.time.temporal;

import java.util.Map;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.EnumC1550d;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.format.C1574v;
import p196j$.time.format.EnumC1575w;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class EnumC1598g implements InterfaceC1607p {
    public static final EnumC1598g DAY_OF_QUARTER;
    public static final EnumC1598g QUARTER_OF_YEAR;
    public static final EnumC1598g WEEK_BASED_YEAR;
    public static final EnumC1598g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a */
    public static final int[] f10819a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1598g[] f10820b;

    static {
        EnumC1598g enumC1598g = new EnumC1598g() { // from class: j$.time.temporal.c
            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: E */
            public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
                if (!mo24167r(interfaceC1603l)) {
                    throw new C1609r("Unsupported field: DayOfQuarter");
                }
                long jMo23843i = interfaceC1603l.mo23843i(EnumC1598g.QUARTER_OF_YEAR);
                if (jMo23843i == 1) {
                    long jMo23843i2 = interfaceC1603l.mo23843i(EnumC1592a.YEAR);
                    C1542s.f10679c.getClass();
                    return C1542s.m24053b0(jMo23843i2) ? C1610s.m24173f(1L, 91L) : C1610s.m24173f(1L, 90L);
                }
                if (jMo23843i == 2) {
                    return C1610s.m24173f(1L, 91L);
                }
                return (jMo23843i == 3 || jMo23843i == 4) ? C1610s.m24173f(1L, 92L) : range();
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: K */
            public final InterfaceC1603l mo24168K(Map map, C1574v c1574v, EnumC1575w enumC1575w) {
                long jSubtractExact;
                C1579h c1579hM24127m0;
                EnumC1592a enumC1592a = EnumC1592a.YEAR;
                Long l = (Long) map.get(enumC1592a);
                InterfaceC1607p interfaceC1607p = EnumC1598g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(interfaceC1607p);
                if (l == null || l2 == null) {
                    return null;
                }
                int iM24175a = enumC1592a.f10817b.m24175a(l.longValue(), enumC1592a);
                long jLongValue = ((Long) map.get(EnumC1598g.DAY_OF_QUARTER)).longValue();
                EnumC1598g enumC1598g2 = AbstractC1600i.f10824a;
                if (!InterfaceC1535l.m24039q(c1574v).equals(C1542s.f10679c)) {
                    throw new C1512b("Resolve requires IsoChronology");
                }
                if (enumC1575w == EnumC1575w.LENIENT) {
                    c1579hM24127m0 = C1579h.m24113h0(iM24175a, 1, 1).m24127m0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    C1579h c1579hM24113h0 = C1579h.m24113h0(iM24175a, ((interfaceC1607p.range().m24175a(l2.longValue(), interfaceC1607p) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC1575w == EnumC1575w.STRICT) {
                            mo24162E(c1579hM24113h0).m24176b(jLongValue, this);
                        } else {
                            range().m24176b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    c1579hM24127m0 = c1579hM24113h0;
                }
                map.remove(this);
                map.remove(enumC1592a);
                map.remove(interfaceC1607p);
                return c1579hM24127m0.m24126l0(jSubtractExact);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: T */
            public final long mo24163T(InterfaceC1603l interfaceC1603l) {
                if (!mo24167r(interfaceC1603l)) {
                    throw new C1609r("Unsupported field: DayOfQuarter");
                }
                int iMo23952g = interfaceC1603l.mo23952g(EnumC1592a.DAY_OF_YEAR);
                int iMo23952g2 = interfaceC1603l.mo23952g(EnumC1592a.MONTH_OF_YEAR);
                long jMo23843i = interfaceC1603l.mo23843i(EnumC1592a.YEAR);
                int i = (iMo23952g2 - 1) / 3;
                C1542s.f10679c.getClass();
                return iMo23952g - EnumC1598g.f10819a[i + (C1542s.m24053b0(jMo23843i) ? 4 : 0)];
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: Z */
            public final Temporal mo24164Z(Temporal temporal, long j) {
                long jMo24163T = mo24163T(temporal);
                range().m24176b(j, this);
                EnumC1592a enumC1592a = EnumC1592a.DAY_OF_YEAR;
                return temporal.mo23948c((j - jMo24163T) + temporal.mo23843i(enumC1592a), enumC1592a);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: r */
            public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
                if (!interfaceC1603l.mo23842h(EnumC1592a.DAY_OF_YEAR) || !interfaceC1603l.mo23842h(EnumC1592a.MONTH_OF_YEAR) || !interfaceC1603l.mo23842h(EnumC1592a.YEAR)) {
                    return false;
                }
                EnumC1598g enumC1598g2 = AbstractC1600i.f10824a;
                return InterfaceC1535l.m24039q(interfaceC1603l).equals(C1542s.f10679c);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            public final C1610s range() {
                return C1610s.m24174g(90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC1598g;
        EnumC1598g enumC1598g2 = new EnumC1598g() { // from class: j$.time.temporal.d
            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: E */
            public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return range();
                }
                throw new C1609r("Unsupported field: QuarterOfYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: T */
            public final long mo24163T(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return (interfaceC1603l.mo23843i(EnumC1592a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C1609r("Unsupported field: QuarterOfYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: Z */
            public final Temporal mo24164Z(Temporal temporal, long j) {
                long jMo24163T = mo24163T(temporal);
                range().m24176b(j, this);
                EnumC1592a enumC1592a = EnumC1592a.MONTH_OF_YEAR;
                return temporal.mo23948c(((j - jMo24163T) * 3) + temporal.mo23843i(enumC1592a), enumC1592a);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: r */
            public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
                if (!interfaceC1603l.mo23842h(EnumC1592a.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC1598g enumC1598g3 = AbstractC1600i.f10824a;
                return InterfaceC1535l.m24039q(interfaceC1603l).equals(C1542s.f10679c);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            public final C1610s range() {
                return C1610s.m24173f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC1598g2;
        EnumC1598g enumC1598g3 = new EnumC1598g() { // from class: j$.time.temporal.e
            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: E */
            public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return EnumC1598g.m24172d0(C1579h.m24111K(interfaceC1603l));
                }
                throw new C1609r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: K */
            public final InterfaceC1603l mo24168K(Map map, C1574v c1574v, EnumC1575w enumC1575w) {
                C1579h c1579hMo23948c;
                long j;
                long j2;
                InterfaceC1607p interfaceC1607p = EnumC1598g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(interfaceC1607p);
                EnumC1592a enumC1592a = EnumC1592a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(enumC1592a);
                if (l == null || l2 == null) {
                    return null;
                }
                int iM24175a = interfaceC1607p.range().m24175a(l.longValue(), interfaceC1607p);
                long jLongValue = ((Long) map.get(EnumC1598g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC1598g enumC1598g4 = AbstractC1600i.f10824a;
                if (!InterfaceC1535l.m24039q(c1574v).equals(C1542s.f10679c)) {
                    throw new C1512b("Resolve requires IsoChronology");
                }
                C1579h c1579hM24113h0 = C1579h.m24113h0(iM24175a, 1, 4);
                if (enumC1575w == EnumC1575w.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        j = 1;
                        c1579hM24113h0 = c1579hM24113h0.m24128n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            c1579hM24113h0 = c1579hM24113h0.m24128n0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        c1579hMo23948c = c1579hM24113h0.m24128n0(Math.subtractExact(jLongValue, j)).mo23948c(jLongValue2, enumC1592a);
                    }
                    jLongValue2 = j2 + j;
                    c1579hMo23948c = c1579hM24113h0.m24128n0(Math.subtractExact(jLongValue, j)).mo23948c(jLongValue2, enumC1592a);
                } else {
                    int iM24175a2 = enumC1592a.f10817b.m24175a(l2.longValue(), enumC1592a);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (enumC1575w == EnumC1575w.STRICT) {
                            EnumC1598g.m24172d0(c1579hM24113h0).m24176b(jLongValue, this);
                        } else {
                            range().m24176b(jLongValue, this);
                        }
                    }
                    c1579hMo23948c = c1579hM24113h0.m24128n0(jLongValue - 1).mo23948c(iM24175a2, enumC1592a);
                }
                map.remove(this);
                map.remove(interfaceC1607p);
                map.remove(enumC1592a);
                return c1579hMo23948c;
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: T */
            public final long mo24163T(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return EnumC1598g.m24169a0(C1579h.m24111K(interfaceC1603l));
                }
                throw new C1609r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: Z */
            public final Temporal mo24164Z(Temporal temporal, long j) {
                range().m24176b(j, this);
                return temporal.mo23950e(Math.subtractExact(j, mo24163T(temporal)), ChronoUnit.WEEKS);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: r */
            public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
                if (!interfaceC1603l.mo23842h(EnumC1592a.EPOCH_DAY)) {
                    return false;
                }
                EnumC1598g enumC1598g4 = AbstractC1600i.f10824a;
                return InterfaceC1535l.m24039q(interfaceC1603l).equals(C1542s.f10679c);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            public final C1610s range() {
                return C1610s.m24174g(52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC1598g3;
        EnumC1598g enumC1598g4 = new EnumC1598g() { // from class: j$.time.temporal.f
            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: E */
            public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return range();
                }
                throw new C1609r("Unsupported field: WeekBasedYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: T */
            public final long mo24163T(InterfaceC1603l interfaceC1603l) {
                if (mo24167r(interfaceC1603l)) {
                    return EnumC1598g.m24170b0(C1579h.m24111K(interfaceC1603l));
                }
                throw new C1609r("Unsupported field: WeekBasedYear");
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: Z */
            public final Temporal mo24164Z(Temporal temporal, long j) {
                if (!mo24167r(temporal)) {
                    throw new C1609r("Unsupported field: WeekBasedYear");
                }
                int iM24175a = EnumC1592a.YEAR.f10817b.m24175a(j, EnumC1598g.WEEK_BASED_YEAR);
                C1579h c1579hM24111K = C1579h.m24111K(temporal);
                EnumC1592a enumC1592a = EnumC1592a.DAY_OF_WEEK;
                int iMo23952g = c1579hM24111K.mo23952g(enumC1592a);
                int iM24169a0 = EnumC1598g.m24169a0(c1579hM24111K);
                if (iM24169a0 == 53 && EnumC1598g.m24171c0(iM24175a) == 52) {
                    iM24169a0 = 52;
                }
                C1579h c1579hM24113h0 = C1579h.m24113h0(iM24175a, 1, 4);
                return temporal.mo24016k(c1579hM24113h0.m24126l0(((iM24169a0 - 1) * 7) + (iMo23952g - c1579hM24113h0.mo23952g(enumC1592a))));
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            /* JADX INFO: renamed from: r */
            public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
                if (!interfaceC1603l.mo23842h(EnumC1592a.EPOCH_DAY)) {
                    return false;
                }
                EnumC1598g enumC1598g5 = AbstractC1600i.f10824a;
                return InterfaceC1535l.m24039q(interfaceC1603l).equals(C1542s.f10679c);
            }

            @Override // p196j$.time.temporal.InterfaceC1607p
            public final C1610s range() {
                return EnumC1592a.YEAR.f10817b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC1598g4;
        f10820b = new EnumC1598g[]{enumC1598g, enumC1598g2, enumC1598g3, enumC1598g4};
        f10819a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: renamed from: a0 */
    public static int m24169a0(C1579h c1579h) {
        int iOrdinal = c1579h.m24118Z().ordinal();
        int iM24119a0 = c1579h.m24119a0() - 1;
        int i = (3 - iOrdinal) + iM24119a0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iM24119a0 < i3) {
            if (c1579h.m24119a0() != 180) {
                c1579h = C1579h.m24115j0(c1579h.f10781a, 180);
            }
            return (int) m24172d0(c1579h.m24129o0(-1L)).f10844d;
        }
        int i4 = ((iM24119a0 - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && c1579h.m24122d0())) {
            return i4;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m24170b0(C1579h c1579h) {
        int i = c1579h.f10781a;
        int iM24119a0 = c1579h.m24119a0();
        if (iM24119a0 <= 3) {
            return iM24119a0 - c1579h.m24118Z().ordinal() < -2 ? i - 1 : i;
        }
        if (iM24119a0 >= 363) {
            return ((iM24119a0 - 363) - (c1579h.m24122d0() ? 1 : 0)) - c1579h.m24118Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    /* JADX INFO: renamed from: c0 */
    public static int m24171c0(int i) {
        C1579h c1579hM24113h0 = C1579h.m24113h0(i, 1, 1);
        if (c1579hM24113h0.m24118Z() != EnumC1550d.THURSDAY) {
            return (c1579hM24113h0.m24118Z() == EnumC1550d.WEDNESDAY && c1579hM24113h0.m24122d0()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: renamed from: d0 */
    public static C1610s m24172d0(C1579h c1579h) {
        return C1610s.m24173f(1L, m24171c0(m24170b0(c1579h)));
    }

    public static EnumC1598g valueOf(String str) {
        return (EnumC1598g) Enum.valueOf(EnumC1598g.class, str);
    }

    public static EnumC1598g[] values() {
        return (EnumC1598g[]) f10820b.clone();
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    public final boolean isDateBased() {
        return true;
    }
}
