package p196j$.time.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p196j$.time.C1512b;
import p196j$.time.C1580i;
import p196j$.time.C1583l;
import p196j$.time.C1591t;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.ChronoLocalDateTime;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1530i;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1600i;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: f */
    public static final DateTimeFormatter f10700f;

    /* JADX INFO: renamed from: a */
    public final C1556d f10701a;

    /* JADX INFO: renamed from: b */
    public final Locale f10702b;

    /* JADX INFO: renamed from: c */
    public final C1573u f10703c;

    /* JADX INFO: renamed from: d */
    public final EnumC1575w f10704d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1535l f10705e;

    static {
        C1569q c1569q = new C1569q();
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        EnumC1576x enumC1576x = EnumC1576x.EXCEEDS_PAD;
        c1569q.m24088h(enumC1592a, 4, 10, enumC1576x);
        c1569q.m24083c('-');
        EnumC1592a enumC1592a2 = EnumC1592a.MONTH_OF_YEAR;
        c1569q.m24087g(enumC1592a2, 2);
        c1569q.m24083c('-');
        EnumC1592a enumC1592a3 = EnumC1592a.DAY_OF_MONTH;
        c1569q.m24087g(enumC1592a3, 2);
        EnumC1575w enumC1575w = EnumC1575w.STRICT;
        C1542s c1542s = C1542s.f10679c;
        DateTimeFormatter dateTimeFormatterM24091k = c1569q.m24091k(enumC1575w, c1542s);
        ISO_LOCAL_DATE = dateTimeFormatterM24091k;
        C1569q c1569q2 = new C1569q();
        EnumC1564l enumC1564l = EnumC1564l.INSENSITIVE;
        c1569q2.m24082b(enumC1564l);
        c1569q2.m24081a(dateTimeFormatterM24091k);
        C1561i c1561i = C1561i.f10722e;
        c1569q2.m24082b(c1561i);
        c1569q2.m24091k(enumC1575w, c1542s);
        C1569q c1569q3 = new C1569q();
        c1569q3.m24082b(enumC1564l);
        c1569q3.m24081a(dateTimeFormatterM24091k);
        c1569q3.m24090j();
        c1569q3.m24082b(c1561i);
        c1569q3.m24091k(enumC1575w, c1542s);
        C1569q c1569q4 = new C1569q();
        EnumC1592a enumC1592a4 = EnumC1592a.HOUR_OF_DAY;
        c1569q4.m24087g(enumC1592a4, 2);
        c1569q4.m24083c(':');
        EnumC1592a enumC1592a5 = EnumC1592a.MINUTE_OF_HOUR;
        c1569q4.m24087g(enumC1592a5, 2);
        c1569q4.m24090j();
        c1569q4.m24083c(':');
        EnumC1592a enumC1592a6 = EnumC1592a.SECOND_OF_MINUTE;
        c1569q4.m24087g(enumC1592a6, 2);
        c1569q4.m24090j();
        c1569q4.m24082b(new C1558f(EnumC1592a.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterM24091k2 = c1569q4.m24091k(enumC1575w, null);
        C1569q c1569q5 = new C1569q();
        c1569q5.m24082b(enumC1564l);
        c1569q5.m24081a(dateTimeFormatterM24091k2);
        c1569q5.m24082b(c1561i);
        c1569q5.m24091k(enumC1575w, null);
        C1569q c1569q6 = new C1569q();
        c1569q6.m24082b(enumC1564l);
        c1569q6.m24081a(dateTimeFormatterM24091k2);
        c1569q6.m24090j();
        c1569q6.m24082b(c1561i);
        c1569q6.m24091k(enumC1575w, null);
        C1569q c1569q7 = new C1569q();
        c1569q7.m24082b(enumC1564l);
        c1569q7.m24081a(dateTimeFormatterM24091k);
        c1569q7.m24083c('T');
        c1569q7.m24081a(dateTimeFormatterM24091k2);
        DateTimeFormatter dateTimeFormatterM24091k3 = c1569q7.m24091k(enumC1575w, c1542s);
        C1569q c1569q8 = new C1569q();
        c1569q8.m24082b(enumC1564l);
        c1569q8.m24081a(dateTimeFormatterM24091k3);
        EnumC1564l enumC1564l2 = EnumC1564l.LENIENT;
        c1569q8.m24082b(enumC1564l2);
        c1569q8.m24082b(c1561i);
        EnumC1564l enumC1564l3 = EnumC1564l.STRICT;
        c1569q8.m24082b(enumC1564l3);
        DateTimeFormatter dateTimeFormatterM24091k4 = c1569q8.m24091k(enumC1575w, c1542s);
        C1569q c1569q9 = new C1569q();
        c1569q9.m24081a(dateTimeFormatterM24091k4);
        c1569q9.m24090j();
        c1569q9.m24083c('[');
        EnumC1564l enumC1564l4 = EnumC1564l.SENSITIVE;
        c1569q9.m24082b(enumC1564l4);
        C1580i c1580i = C1569q.f10746f;
        c1569q9.m24082b(new C1567o(c1580i, "ZoneRegionId()"));
        c1569q9.m24083c(']');
        c1569q9.m24091k(enumC1575w, c1542s);
        C1569q c1569q10 = new C1569q();
        c1569q10.m24081a(dateTimeFormatterM24091k3);
        c1569q10.m24090j();
        c1569q10.m24082b(c1561i);
        c1569q10.m24090j();
        c1569q10.m24083c('[');
        c1569q10.m24082b(enumC1564l4);
        c1569q10.m24082b(new C1567o(c1580i, "ZoneRegionId()"));
        c1569q10.m24083c(']');
        ISO_DATE_TIME = c1569q10.m24091k(enumC1575w, c1542s);
        C1569q c1569q11 = new C1569q();
        c1569q11.m24082b(enumC1564l);
        c1569q11.m24088h(enumC1592a, 4, 10, enumC1576x);
        c1569q11.m24083c('-');
        c1569q11.m24087g(EnumC1592a.DAY_OF_YEAR, 3);
        c1569q11.m24090j();
        c1569q11.m24082b(c1561i);
        c1569q11.m24091k(enumC1575w, c1542s);
        C1569q c1569q12 = new C1569q();
        c1569q12.m24082b(enumC1564l);
        c1569q12.m24088h(AbstractC1600i.f10826c, 4, 10, enumC1576x);
        c1569q12.m24084d("-W");
        c1569q12.m24087g(AbstractC1600i.f10825b, 2);
        c1569q12.m24083c('-');
        EnumC1592a enumC1592a7 = EnumC1592a.DAY_OF_WEEK;
        c1569q12.m24087g(enumC1592a7, 1);
        c1569q12.m24090j();
        c1569q12.m24082b(c1561i);
        c1569q12.m24091k(enumC1575w, c1542s);
        C1569q c1569q13 = new C1569q();
        c1569q13.m24082b(enumC1564l);
        c1569q13.m24082b(new C1559g());
        f10700f = c1569q13.m24091k(enumC1575w, null);
        C1569q c1569q14 = new C1569q();
        c1569q14.m24082b(enumC1564l);
        c1569q14.m24087g(enumC1592a, 4);
        c1569q14.m24087g(enumC1592a2, 2);
        c1569q14.m24087g(enumC1592a3, 2);
        c1569q14.m24090j();
        c1569q14.m24082b(enumC1564l2);
        c1569q14.m24082b(new C1561i("+HHMMss", "Z"));
        c1569q14.m24082b(enumC1564l3);
        c1569q14.m24091k(enumC1575w, c1542s);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C1569q c1569q15 = new C1569q();
        c1569q15.m24082b(enumC1564l);
        c1569q15.m24082b(enumC1564l2);
        c1569q15.m24090j();
        c1569q15.m24085e(enumC1592a7, map);
        c1569q15.m24084d(", ");
        c1569q15.m24089i();
        c1569q15.m24088h(enumC1592a3, 1, 2, EnumC1576x.NOT_NEGATIVE);
        c1569q15.m24083c(' ');
        c1569q15.m24085e(enumC1592a2, map2);
        c1569q15.m24083c(' ');
        c1569q15.m24087g(enumC1592a, 4);
        c1569q15.m24083c(' ');
        c1569q15.m24087g(enumC1592a4, 2);
        c1569q15.m24083c(':');
        c1569q15.m24087g(enumC1592a5, 2);
        c1569q15.m24090j();
        c1569q15.m24083c(':');
        c1569q15.m24087g(enumC1592a6, 2);
        c1569q15.m24089i();
        c1569q15.m24083c(' ');
        c1569q15.m24082b(new C1561i("+HHMM", "GMT"));
        c1569q15.m24091k(EnumC1575w.SMART, c1542s);
    }

    public DateTimeFormatter(C1556d c1556d, Locale locale, EnumC1575w enumC1575w, InterfaceC1535l interfaceC1535l) {
        C1573u c1573u = C1573u.f10759a;
        this.f10701a = c1556d;
        Objects.requireNonNull(locale, "locale");
        this.f10702b = locale;
        this.f10703c = c1573u;
        Objects.requireNonNull(enumC1575w, "resolverStyle");
        this.f10704d = enumC1575w;
        this.f10705e = interfaceC1535l;
    }

    /* JADX INFO: renamed from: a */
    public final String m24062a(InterfaceC1603l interfaceC1603l) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f10701a.mo24065r(new C1571s(interfaceC1603l, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C1512b(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0322  */
    /* JADX WARN: Code duplicated, block: B:134:0x032e  */
    /* JADX WARN: Code duplicated, block: B:135:0x035b  */
    /* JADX WARN: Code duplicated, block: B:169:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0267  */
    /* JADX INFO: renamed from: b */
    public final C1574v m24063b(CharSequence charSequence) {
        long j;
        InterfaceC1607p interfaceC1607p;
        EnumC1592a enumC1592a;
        Map map;
        EnumC1592a enumC1592a2;
        InterfaceC1607p interfaceC1607p2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C1570r c1570r = new C1570r(this);
        int iMo24064E = this.f10701a.mo24064E(c1570r, charSequence, parsePosition.getIndex());
        ZoneId zoneId = null;
        if (iMo24064E < 0) {
            parsePosition.setErrorIndex(~iMo24064E);
            c1570r = null;
        } else {
            parsePosition.setIndex(iMo24064E);
        }
        if (c1570r != null) {
            DateTimeFormatter dateTimeFormatter = c1570r.f10752a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C1574v c1574vM24095c = c1570r.m24095c();
                InterfaceC1535l interfaceC1535l = c1570r.m24095c().f10762c;
                if (interfaceC1535l == null && (interfaceC1535l = dateTimeFormatter.f10705e) == null) {
                    interfaceC1535l = C1542s.f10679c;
                }
                c1574vM24095c.f10762c = interfaceC1535l;
                ZoneId zoneId2 = c1574vM24095c.f10761b;
                if (zoneId2 != null) {
                    zoneId = zoneId2;
                } else {
                    dateTimeFormatter.getClass();
                }
                c1574vM24095c.f10761b = zoneId;
                c1574vM24095c.f10764e = this.f10704d;
                c1574vM24095c.m24103o();
                c1574vM24095c.m24108t(c1574vM24095c.f10762c.mo23996W(c1574vM24095c.f10760a, c1574vM24095c.f10764e));
                c1574vM24095c.m24106r();
                if (((HashMap) c1574vM24095c.f10760a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c1574vM24095c.f10760a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            interfaceC1607p2 = (InterfaceC1607p) ((Map.Entry) it.next()).getKey();
                            InterfaceC1603l interfaceC1603lMo24168K = interfaceC1607p2.mo24168K(c1574vM24095c.f10760a, c1574vM24095c, c1574vM24095c.f10764e);
                            if (interfaceC1603lMo24168K != null) {
                                if (interfaceC1603lMo24168K instanceof InterfaceC1530i) {
                                    InterfaceC1530i interfaceC1530i = (InterfaceC1530i) interfaceC1603lMo24168K;
                                    ZoneId zoneId3 = c1574vM24095c.f10761b;
                                    if (zoneId3 == null) {
                                        c1574vM24095c.f10761b = interfaceC1530i.getZone();
                                    } else if (!zoneId3.equals(interfaceC1530i.getZone())) {
                                        throw new C1512b("ChronoZonedDateTime must use the effective parsed zone: " + c1574vM24095c.f10761b);
                                    }
                                    interfaceC1603lMo24168K = interfaceC1530i.toLocalDateTime();
                                }
                                if (interfaceC1603lMo24168K instanceof ChronoLocalDateTime) {
                                    ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) interfaceC1603lMo24168K;
                                    c1574vM24095c.m24107s(chronoLocalDateTime.toLocalTime(), C1591t.f10808d);
                                    c1574vM24095c.m24108t(chronoLocalDateTime.toLocalDate());
                                    break;
                                }
                                if (interfaceC1603lMo24168K instanceof InterfaceC1516b) {
                                    c1574vM24095c.m24108t((InterfaceC1516b) interfaceC1603lMo24168K);
                                    break;
                                }
                                if (!(interfaceC1603lMo24168K instanceof C1583l)) {
                                    throw new C1512b("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                                c1574vM24095c.m24107s((C1583l) interfaceC1603lMo24168K, C1591t.f10808d);
                                break;
                            }
                        } while (((HashMap) c1574vM24095c.f10760a).containsKey(interfaceC1607p2));
                        i++;
                    }
                    if (i == 50) {
                        throw new C1512b("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c1574vM24095c.m24103o();
                        c1574vM24095c.m24108t(c1574vM24095c.f10762c.mo23996W(c1574vM24095c.f10760a, c1574vM24095c.f10764e));
                        c1574vM24095c.m24106r();
                    }
                }
                if (c1574vM24095c.f10766g == null) {
                    Map map2 = c1574vM24095c.f10760a;
                    EnumC1592a enumC1592a3 = EnumC1592a.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(enumC1592a3)) {
                        long jLongValue = ((Long) ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a3)).longValue();
                        Map map3 = c1574vM24095c.f10760a;
                        EnumC1592a enumC1592a4 = EnumC1592a.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC1592a4)) {
                            long jLongValue2 = (((Long) ((HashMap) c1574vM24095c.f10760a).get(enumC1592a4)).longValue() % 1000) + (jLongValue * 1000);
                            c1574vM24095c.m24109v(enumC1592a3, enumC1592a4, Long.valueOf(jLongValue2));
                            ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a4);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = c1574vM24095c.f10760a;
                        EnumC1592a enumC1592a5 = EnumC1592a.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(enumC1592a5)) {
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a5)).longValue() * 1000));
                        }
                    }
                    Map map5 = c1574vM24095c.f10760a;
                    EnumC1592a enumC1592a6 = EnumC1592a.HOUR_OF_DAY;
                    Long l = (Long) ((HashMap) map5).get(enumC1592a6);
                    if (l != null) {
                        Map map6 = c1574vM24095c.f10760a;
                        EnumC1592a enumC1592a7 = EnumC1592a.MINUTE_OF_HOUR;
                        Long l2 = (Long) ((HashMap) map6).get(enumC1592a7);
                        Map map7 = c1574vM24095c.f10760a;
                        EnumC1592a enumC1592a8 = EnumC1592a.SECOND_OF_MINUTE;
                        Long l3 = (Long) ((HashMap) map7).get(enumC1592a8);
                        Map map8 = c1574vM24095c.f10760a;
                        EnumC1592a enumC1592a9 = EnumC1592a.NANO_OF_SECOND;
                        Long l4 = (Long) ((HashMap) map8).get(enumC1592a9);
                        if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
                            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                            long j2 = jLongValue4;
                            j = 1000000;
                            c1574vM24095c.m24105q(l.longValue(), jLongValue3, j2, jLongValue5);
                            ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a6);
                            ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a7);
                            ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a8);
                            ((HashMap) c1574vM24095c.f10760a).remove(enumC1592a9);
                        } else {
                            j = 1000000;
                        }
                    } else {
                        j = 1000000;
                    }
                    if (c1574vM24095c.f10764e != EnumC1575w.LENIENT && ((HashMap) c1574vM24095c.f10760a).size() > 0) {
                        for (Map.Entry entry : ((HashMap) c1574vM24095c.f10760a).entrySet()) {
                            interfaceC1607p = (InterfaceC1607p) entry.getKey();
                            if (interfaceC1607p instanceof EnumC1592a) {
                                enumC1592a = (EnumC1592a) interfaceC1607p;
                                if (enumC1592a.m24166b0()) {
                                    enumC1592a.m24165a0(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else {
                    j = 1000000;
                    if (c1574vM24095c.f10764e != EnumC1575w.LENIENT) {
                        while (r1.hasNext()) {
                            interfaceC1607p = (InterfaceC1607p) entry.getKey();
                            if (interfaceC1607p instanceof EnumC1592a) {
                                enumC1592a = (EnumC1592a) interfaceC1607p;
                                if (enumC1592a.m24166b0()) {
                                    enumC1592a.m24165a0(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                }
                InterfaceC1516b interfaceC1516b = c1574vM24095c.f10765f;
                if (interfaceC1516b != null) {
                    c1574vM24095c.m24102n(interfaceC1516b);
                }
                C1583l c1583l = c1574vM24095c.f10766g;
                if (c1583l != null) {
                    c1574vM24095c.m24102n(c1583l);
                    if (c1574vM24095c.f10765f != null && ((HashMap) c1574vM24095c.f10760a).size() > 0) {
                        c1574vM24095c.m24102n(c1574vM24095c.f10765f.mo24012N(c1574vM24095c.f10766g));
                    }
                }
                if (c1574vM24095c.f10765f != null && c1574vM24095c.f10766g != null) {
                    C1591t c1591t = c1574vM24095c.f10767h;
                    c1591t.getClass();
                    C1591t c1591t2 = C1591t.f10808d;
                    if (c1591t != c1591t2) {
                        c1574vM24095c.f10765f = c1574vM24095c.f10765f.mo24014V(c1574vM24095c.f10767h);
                        c1574vM24095c.f10767h = c1591t2;
                    }
                }
                if (c1574vM24095c.f10766g == null) {
                    if (((HashMap) c1574vM24095c.f10760a).containsKey(EnumC1592a.INSTANT_SECONDS)) {
                        map = c1574vM24095c.f10760a;
                        enumC1592a2 = EnumC1592a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC1592a2)) {
                            long jLongValue6 = ((Long) ((HashMap) c1574vM24095c.f10760a).get(enumC1592a2)).longValue();
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 / 1000));
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, Long.valueOf(jLongValue6 / j));
                        } else {
                            ((HashMap) c1574vM24095c.f10760a).put(enumC1592a2, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c1574vM24095c.f10760a).containsKey(EnumC1592a.SECOND_OF_DAY)) {
                        map = c1574vM24095c.f10760a;
                        enumC1592a2 = EnumC1592a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC1592a2)) {
                            long jLongValue7 = ((Long) ((HashMap) c1574vM24095c.f10760a).get(enumC1592a2)).longValue();
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, Long.valueOf(jLongValue7 / 1000));
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 / j));
                        } else {
                            ((HashMap) c1574vM24095c.f10760a).put(enumC1592a2, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c1574vM24095c.f10760a).containsKey(EnumC1592a.SECOND_OF_MINUTE)) {
                        map = c1574vM24095c.f10760a;
                        enumC1592a2 = EnumC1592a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC1592a2)) {
                            long jLongValue8 = ((Long) ((HashMap) c1574vM24095c.f10760a).get(enumC1592a2)).longValue();
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, Long.valueOf(jLongValue8 / 1000));
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, Long.valueOf(jLongValue8 / j));
                        } else {
                            ((HashMap) c1574vM24095c.f10760a).put(enumC1592a2, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MICRO_OF_SECOND, 0L);
                            ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (c1574vM24095c.f10765f != null && c1574vM24095c.f10766g != null) {
                    Long l5 = (Long) ((HashMap) c1574vM24095c.f10760a).get(EnumC1592a.OFFSET_SECONDS);
                    if (l5 != null) {
                        ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.INSTANT_SECONDS, Long.valueOf(c1574vM24095c.f10765f.mo24012N(c1574vM24095c.f10766g).mo23957J(ZoneOffset.m23978d0(l5.intValue())).toEpochSecond()));
                        return c1574vM24095c;
                    }
                    if (c1574vM24095c.f10761b != null) {
                        ((HashMap) c1574vM24095c.f10760a).put(EnumC1592a.INSTANT_SECONDS, Long.valueOf(c1574vM24095c.f10765f.mo24012N(c1574vM24095c.f10766g).mo23957J(c1574vM24095c.f10761b).toEpochSecond()));
                    }
                }
                return c1574vM24095c;
            }
        }
        String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f10701a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
