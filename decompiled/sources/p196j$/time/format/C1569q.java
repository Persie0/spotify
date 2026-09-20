package p196j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p196j$.nio.file.C1474g0;
import p196j$.time.C1580i;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.temporal.AbstractC1600i;
import p196j$.time.temporal.AbstractC1602k;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.EnumC1598g;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.q */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1569q {

    /* JADX INFO: renamed from: f */
    public static final C1580i f10746f = new C1580i(1);

    /* JADX INFO: renamed from: a */
    public C1569q f10747a;

    /* JADX INFO: renamed from: b */
    public final C1569q f10748b;

    /* JADX INFO: renamed from: c */
    public final List f10749c;

    /* JADX INFO: renamed from: d */
    public final boolean f10750d;

    /* JADX INFO: renamed from: e */
    public int f10751e;

    static {
        HashMap map = new HashMap();
        map.put('G', EnumC1592a.ERA);
        map.put('y', EnumC1592a.YEAR_OF_ERA);
        map.put('u', EnumC1592a.YEAR);
        EnumC1598g enumC1598g = AbstractC1600i.f10824a;
        map.put('Q', enumC1598g);
        map.put('q', enumC1598g);
        EnumC1592a enumC1592a = EnumC1592a.MONTH_OF_YEAR;
        map.put('M', enumC1592a);
        map.put('L', enumC1592a);
        map.put('D', EnumC1592a.DAY_OF_YEAR);
        map.put('d', EnumC1592a.DAY_OF_MONTH);
        map.put('F', EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC1592a enumC1592a2 = EnumC1592a.DAY_OF_WEEK;
        map.put('E', enumC1592a2);
        map.put('c', enumC1592a2);
        map.put('e', enumC1592a2);
        map.put('a', EnumC1592a.AMPM_OF_DAY);
        map.put('H', EnumC1592a.HOUR_OF_DAY);
        map.put('k', EnumC1592a.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC1592a.HOUR_OF_AMPM);
        map.put('h', EnumC1592a.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC1592a.MINUTE_OF_HOUR);
        map.put('s', EnumC1592a.SECOND_OF_MINUTE);
        EnumC1592a enumC1592a3 = EnumC1592a.NANO_OF_SECOND;
        map.put('S', enumC1592a3);
        map.put('A', EnumC1592a.MILLI_OF_DAY);
        map.put('n', enumC1592a3);
        map.put('N', EnumC1592a.NANO_OF_DAY);
        map.put('g', AbstractC1602k.f10831a);
    }

    public C1569q() {
        this.f10747a = this;
        this.f10749c = new ArrayList();
        this.f10751e = -1;
        this.f10748b = null;
        this.f10750d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m24081a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C1556d c1556d = dateTimeFormatter.f10701a;
        if (c1556d.f10713b) {
            c1556d = new C1556d(c1556d.f10712a, false);
        }
        m24082b(c1556d);
    }

    /* JADX INFO: renamed from: b */
    public final int m24082b(InterfaceC1557e interfaceC1557e) {
        Objects.requireNonNull(interfaceC1557e, "pp");
        C1569q c1569q = this.f10747a;
        c1569q.getClass();
        ((ArrayList) c1569q.f10749c).add(interfaceC1557e);
        C1569q c1569q2 = this.f10747a;
        c1569q2.f10751e = -1;
        return ((ArrayList) c1569q2.f10749c).size() - 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m24083c(char c) {
        m24082b(new C1555c(c));
    }

    /* JADX INFO: renamed from: d */
    public final void m24084d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m24082b(new C1555c(str.charAt(0)));
        } else {
            m24082b(new C1565m(str));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24085e(EnumC1592a enumC1592a, Map map) {
        Objects.requireNonNull(enumC1592a, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        m24082b(new C1566n(enumC1592a, textStyle, new C1553a(new C1474g0(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    /* JADX INFO: renamed from: f */
    public final void m24086f(C1560h c1560h) {
        C1560h c1560hMo24067b;
        C1569q c1569q = this.f10747a;
        int i = c1569q.f10751e;
        if (i < 0) {
            c1569q.f10751e = m24082b(c1560h);
            return;
        }
        C1560h c1560h2 = (C1560h) ((ArrayList) c1569q.f10749c).get(i);
        int i2 = c1560h.f10717b;
        int i3 = c1560h.f10718c;
        if (i2 == i3 && c1560h.f10719d == EnumC1576x.NOT_NEGATIVE) {
            c1560hMo24067b = c1560h2.mo24068c(i3);
            m24082b(c1560h.mo24067b());
            this.f10747a.f10751e = i;
        } else {
            c1560hMo24067b = c1560h2.mo24067b();
            this.f10747a.f10751e = m24082b(c1560h);
        }
        ((ArrayList) this.f10747a.f10749c).set(i, c1560hMo24067b);
    }

    /* JADX INFO: renamed from: g */
    public final void m24087g(InterfaceC1607p interfaceC1607p, int i) {
        Objects.requireNonNull(interfaceC1607p, "field");
        if (i >= 1 && i <= 19) {
            m24086f(new C1560h(interfaceC1607p, i, i, EnumC1576x.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m24088h(InterfaceC1607p interfaceC1607p, int i, int i2, EnumC1576x enumC1576x) {
        if (i == i2 && enumC1576x == EnumC1576x.NOT_NEGATIVE) {
            m24087g(interfaceC1607p, i2);
            return;
        }
        Objects.requireNonNull(interfaceC1607p, "field");
        Objects.requireNonNull(enumC1576x, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            m24086f(new C1560h(interfaceC1607p, i, i2, enumC1576x));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    /* JADX INFO: renamed from: i */
    public final void m24089i() {
        C1569q c1569q = this.f10747a;
        if (c1569q.f10748b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c1569q.f10749c).size() <= 0) {
            this.f10747a = this.f10747a.f10748b;
            return;
        }
        C1569q c1569q2 = this.f10747a;
        C1556d c1556d = new C1556d(c1569q2.f10749c, c1569q2.f10750d);
        this.f10747a = this.f10747a.f10748b;
        m24082b(c1556d);
    }

    /* JADX INFO: renamed from: j */
    public final void m24090j() {
        C1569q c1569q = this.f10747a;
        c1569q.f10751e = -1;
        this.f10747a = new C1569q(c1569q);
    }

    /* JADX INFO: renamed from: k */
    public final DateTimeFormatter m24091k(EnumC1575w enumC1575w, InterfaceC1535l interfaceC1535l) {
        return m24092l(Locale.getDefault(), enumC1575w, interfaceC1535l);
    }

    /* JADX INFO: renamed from: l */
    public final DateTimeFormatter m24092l(Locale locale, EnumC1575w enumC1575w, InterfaceC1535l interfaceC1535l) {
        Objects.requireNonNull(locale, "locale");
        while (this.f10747a.f10748b != null) {
            m24089i();
        }
        C1556d c1556d = new C1556d(this.f10749c, false);
        C1573u c1573u = C1573u.f10759a;
        return new DateTimeFormatter(c1556d, locale, enumC1575w, interfaceC1535l);
    }

    public C1569q(C1569q c1569q) {
        this.f10747a = this;
        this.f10749c = new ArrayList();
        this.f10751e = -1;
        this.f10748b = c1569q;
        this.f10750d = true;
    }
}
