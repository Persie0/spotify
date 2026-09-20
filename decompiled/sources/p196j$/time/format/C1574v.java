package p196j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p196j$.time.AbstractC1513c;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.C1580i;
import p196j$.time.C1583l;
import p196j$.time.C1591t;
import p196j$.time.Instant;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.chrono.InterfaceC1516b;
import p196j$.time.chrono.InterfaceC1530i;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.v */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1574v implements InterfaceC1603l {

    /* JADX INFO: renamed from: b */
    public ZoneId f10761b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1535l f10762c;

    /* JADX INFO: renamed from: d */
    public boolean f10763d;

    /* JADX INFO: renamed from: e */
    public EnumC1575w f10764e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1516b f10765f;

    /* JADX INFO: renamed from: g */
    public C1583l f10766g;

    /* JADX INFO: renamed from: a */
    public final Map f10760a = new HashMap();

    /* JADX INFO: renamed from: h */
    public C1591t f10767h = C1591t.f10808d;

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10834a) {
            return this.f10761b;
        }
        if (c1580i == AbstractC1608q.f10835b) {
            return this.f10762c;
        }
        if (c1580i == AbstractC1608q.f10839f) {
            InterfaceC1516b interfaceC1516b = this.f10765f;
            if (interfaceC1516b != null) {
                return C1579h.m24111K(interfaceC1516b);
            }
            return null;
        }
        if (c1580i == AbstractC1608q.f10840g) {
            return this.f10766g;
        }
        if (c1580i == AbstractC1608q.f10837d) {
            Long l = (Long) ((HashMap) this.f10760a).get(EnumC1592a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.m23978d0(l.intValue());
            }
            ZoneId zoneId = this.f10761b;
            return zoneId instanceof ZoneOffset ? zoneId : c1580i.m24134j(this);
        }
        if (c1580i == AbstractC1608q.f10838e) {
            return c1580i.m24134j(this);
        }
        if (c1580i == AbstractC1608q.f10836c) {
            return null;
        }
        return c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (((HashMap) this.f10760a).containsKey(interfaceC1607p)) {
            return true;
        }
        InterfaceC1516b interfaceC1516b = this.f10765f;
        if (interfaceC1516b != null && interfaceC1516b.mo23842h(interfaceC1607p)) {
            return true;
        }
        C1583l c1583l = this.f10766g;
        if (c1583l == null || !c1583l.mo23842h(interfaceC1607p)) {
            return (interfaceC1607p == null || (interfaceC1607p instanceof EnumC1592a) || !interfaceC1607p.mo24167r(this)) ? false : true;
        }
        return true;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        Objects.requireNonNull(interfaceC1607p, "field");
        Long l = (Long) ((HashMap) this.f10760a).get(interfaceC1607p);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC1516b interfaceC1516b = this.f10765f;
        if (interfaceC1516b != null && interfaceC1516b.mo23842h(interfaceC1607p)) {
            return this.f10765f.mo23843i(interfaceC1607p);
        }
        C1583l c1583l = this.f10766g;
        if (c1583l != null && c1583l.mo23842h(interfaceC1607p)) {
            return this.f10766g.mo23843i(interfaceC1607p);
        }
        if (interfaceC1607p instanceof EnumC1592a) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        return interfaceC1607p.mo24163T(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m24102n(InterfaceC1603l interfaceC1603l) {
        Iterator it = ((HashMap) this.f10760a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC1607p interfaceC1607p = (InterfaceC1607p) entry.getKey();
            if (interfaceC1603l.mo23842h(interfaceC1607p)) {
                try {
                    long jMo23843i = interfaceC1603l.mo23843i(interfaceC1607p);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jMo23843i != jLongValue) {
                        throw new C1512b("Conflict found: Field " + interfaceC1607p + " " + jMo23843i + " differs from " + interfaceC1607p + " " + jLongValue + " derived from " + interfaceC1603l);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m24103o() {
        if (((HashMap) this.f10760a).containsKey(EnumC1592a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f10761b;
            if (zoneId != null) {
                m24104p(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.f10760a).get(EnumC1592a.OFFSET_SECONDS);
            if (l != null) {
                m24104p(ZoneOffset.m23978d0(l.intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m24104p(ZoneId zoneId) {
        Map map = this.f10760a;
        EnumC1592a enumC1592a = EnumC1592a.INSTANT_SECONDS;
        InterfaceC1530i interfaceC1530iMo24006X = this.f10762c.mo24006X(Instant.m23943r(((Long) ((HashMap) map).remove(enumC1592a)).longValue(), 0), zoneId);
        m24108t(interfaceC1530iMo24006X.toLocalDate());
        m24109v(enumC1592a, EnumC1592a.SECOND_OF_DAY, Long.valueOf(interfaceC1530iMo24006X.toLocalTime().m24147i0()));
    }

    /* JADX INFO: renamed from: q */
    public final void m24105q(long j, long j2, long j3, long j4) {
        if (this.f10764e == EnumC1575w.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            m24107s(C1583l.m24138a0(Math.floorMod(jAddExact, 86400000000000L)), C1591t.m24159a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        EnumC1592a enumC1592a = EnumC1592a.MINUTE_OF_HOUR;
        int iM24175a = enumC1592a.f10817b.m24175a(j2, enumC1592a);
        EnumC1592a enumC1592a2 = EnumC1592a.NANO_OF_SECOND;
        int iM24175a2 = enumC1592a2.f10817b.m24175a(j4, enumC1592a2);
        if (this.f10764e == EnumC1575w.SMART && j == 24 && iM24175a == 0 && j3 == 0 && iM24175a2 == 0) {
            m24107s(C1583l.f10790g, C1591t.m24159a(0, 0, 1));
            return;
        }
        EnumC1592a enumC1592a3 = EnumC1592a.HOUR_OF_DAY;
        int iM24175a3 = enumC1592a3.f10817b.m24175a(j, enumC1592a3);
        EnumC1592a enumC1592a4 = EnumC1592a.SECOND_OF_MINUTE;
        m24107s(C1583l.m24137Z(iM24175a3, iM24175a, enumC1592a4.f10817b.m24175a(j3, enumC1592a4), iM24175a2), C1591t.f10808d);
    }

    /* JADX INFO: renamed from: r */
    public final void m24106r() {
        Map map = this.f10760a;
        EnumC1592a enumC1592a = EnumC1592a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC1592a)) {
            long jLongValue = ((Long) ((HashMap) this.f10760a).remove(enumC1592a)).longValue();
            EnumC1575w enumC1575w = this.f10764e;
            if (enumC1575w == EnumC1575w.STRICT || (enumC1575w == EnumC1575w.SMART && jLongValue != 0)) {
                enumC1592a.m24165a0(jLongValue);
            }
            EnumC1592a enumC1592a2 = EnumC1592a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m24109v(enumC1592a, enumC1592a2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f10760a;
        EnumC1592a enumC1592a3 = EnumC1592a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC1592a3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a3)).longValue();
            EnumC1575w enumC1575w2 = this.f10764e;
            if (enumC1575w2 == EnumC1575w.STRICT || (enumC1575w2 == EnumC1575w.SMART && jLongValue2 != 0)) {
                enumC1592a3.m24165a0(jLongValue2);
            }
            m24109v(enumC1592a3, EnumC1592a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f10760a;
        EnumC1592a enumC1592a4 = EnumC1592a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC1592a4)) {
            Map map4 = this.f10760a;
            EnumC1592a enumC1592a5 = EnumC1592a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC1592a5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a5)).longValue();
                if (this.f10764e == EnumC1575w.LENIENT) {
                    m24109v(enumC1592a4, EnumC1592a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC1592a4.m24165a0(jLongValue3);
                    enumC1592a5.m24165a0(jLongValue3);
                    m24109v(enumC1592a4, EnumC1592a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f10760a;
        EnumC1592a enumC1592a6 = EnumC1592a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC1592a6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a6)).longValue();
            if (this.f10764e != EnumC1575w.LENIENT) {
                enumC1592a6.m24165a0(jLongValue5);
            }
            m24109v(enumC1592a6, EnumC1592a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m24109v(enumC1592a6, EnumC1592a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m24109v(enumC1592a6, EnumC1592a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            m24109v(enumC1592a6, EnumC1592a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f10760a;
        EnumC1592a enumC1592a7 = EnumC1592a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC1592a7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a7)).longValue();
            if (this.f10764e != EnumC1575w.LENIENT) {
                enumC1592a7.m24165a0(jLongValue6);
            }
            m24109v(enumC1592a7, EnumC1592a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m24109v(enumC1592a7, EnumC1592a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f10760a;
        EnumC1592a enumC1592a8 = EnumC1592a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC1592a8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a8)).longValue();
            if (this.f10764e != EnumC1575w.LENIENT) {
                enumC1592a8.m24165a0(jLongValue7);
            }
            m24109v(enumC1592a8, EnumC1592a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m24109v(enumC1592a8, EnumC1592a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f10760a;
        EnumC1592a enumC1592a9 = EnumC1592a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC1592a9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a9)).longValue();
            if (this.f10764e != EnumC1575w.LENIENT) {
                enumC1592a9.m24165a0(jLongValue8);
            }
            m24109v(enumC1592a9, EnumC1592a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m24109v(enumC1592a9, EnumC1592a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m24109v(enumC1592a9, EnumC1592a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f10760a;
        EnumC1592a enumC1592a10 = EnumC1592a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC1592a10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a10)).longValue();
            if (this.f10764e != EnumC1575w.LENIENT) {
                enumC1592a10.m24165a0(jLongValue9);
            }
            m24109v(enumC1592a10, EnumC1592a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m24109v(enumC1592a10, EnumC1592a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f10760a;
        EnumC1592a enumC1592a11 = EnumC1592a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC1592a11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f10760a).get(enumC1592a11)).longValue();
            EnumC1575w enumC1575w3 = this.f10764e;
            EnumC1575w enumC1575w4 = EnumC1575w.LENIENT;
            if (enumC1575w3 != enumC1575w4) {
                enumC1592a11.m24165a0(jLongValue10);
            }
            Map map11 = this.f10760a;
            EnumC1592a enumC1592a12 = EnumC1592a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC1592a12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a12)).longValue();
                if (this.f10764e != enumC1575w4) {
                    enumC1592a12.m24165a0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m24109v(enumC1592a12, enumC1592a11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f10760a;
            EnumC1592a enumC1592a13 = EnumC1592a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC1592a13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f10760a).remove(enumC1592a13)).longValue();
                if (this.f10764e != enumC1575w4) {
                    enumC1592a13.m24165a0(jLongValue12);
                }
                m24109v(enumC1592a13, enumC1592a11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f10760a;
        EnumC1592a enumC1592a14 = EnumC1592a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC1592a14)) {
            Map map14 = this.f10760a;
            EnumC1592a enumC1592a15 = EnumC1592a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC1592a15)) {
                Map map15 = this.f10760a;
                EnumC1592a enumC1592a16 = EnumC1592a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC1592a16) && ((HashMap) this.f10760a).containsKey(enumC1592a11)) {
                    m24105q(((Long) ((HashMap) this.f10760a).remove(enumC1592a14)).longValue(), ((Long) ((HashMap) this.f10760a).remove(enumC1592a15)).longValue(), ((Long) ((HashMap) this.f10760a).remove(enumC1592a16)).longValue(), ((Long) ((HashMap) this.f10760a).remove(enumC1592a11)).longValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24107s(C1583l c1583l, C1591t c1591t) {
        C1583l c1583l2 = this.f10766g;
        if (c1583l2 == null) {
            this.f10766g = c1583l;
            this.f10767h = c1591t;
            return;
        }
        if (!c1583l2.equals(c1583l)) {
            throw new C1512b("Conflict found: Fields resolved to different times: " + this.f10766g + " " + c1583l);
        }
        C1591t c1591t2 = this.f10767h;
        c1591t2.getClass();
        C1591t c1591t3 = C1591t.f10808d;
        if (c1591t2 == c1591t3 || c1591t == c1591t3 || this.f10767h.equals(c1591t)) {
            this.f10767h = c1591t;
            return;
        }
        throw new C1512b("Conflict found: Fields resolved to different excess periods: " + this.f10767h + " " + c1591t);
    }

    /* JADX INFO: renamed from: t */
    public final void m24108t(InterfaceC1516b interfaceC1516b) {
        InterfaceC1516b interfaceC1516b2 = this.f10765f;
        if (interfaceC1516b2 != null) {
            if (interfaceC1516b == null || interfaceC1516b2.equals(interfaceC1516b)) {
                return;
            }
            throw new C1512b("Conflict found: Fields resolved to two different dates: " + this.f10765f + " " + interfaceC1516b);
        }
        if (interfaceC1516b != null) {
            if (this.f10762c.equals(interfaceC1516b.getChronology())) {
                this.f10765f = interfaceC1516b;
                return;
            }
            throw new C1512b("ChronoLocalDate must use the effective parsed chronology: " + this.f10762c);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f10760a);
        sb.append(',');
        sb.append(this.f10762c);
        if (this.f10761b != null) {
            sb.append(',');
            sb.append(this.f10761b);
        }
        if (this.f10765f != null || this.f10766g != null) {
            sb.append(" resolved to ");
            InterfaceC1516b interfaceC1516b = this.f10765f;
            if (interfaceC1516b != null) {
                sb.append(interfaceC1516b);
                if (this.f10766g != null) {
                    sb.append('T');
                    sb.append(this.f10766g);
                }
            } else {
                sb.append(this.f10766g);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public final void m24109v(InterfaceC1607p interfaceC1607p, EnumC1592a enumC1592a, Long l) {
        Long l2 = (Long) ((HashMap) this.f10760a).put(enumC1592a, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new C1512b("Conflict found: " + enumC1592a + " " + l2 + " differs from " + enumC1592a + " " + l + " while resolving  " + interfaceC1607p);
    }
}
