package p196j$.time;

import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.d */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1550d implements InterfaceC1603l, InterfaceC1604m {
    public static final EnumC1550d FRIDAY;
    public static final EnumC1550d MONDAY;
    public static final EnumC1550d SATURDAY;
    public static final EnumC1550d SUNDAY;
    public static final EnumC1550d THURSDAY;
    public static final EnumC1550d TUESDAY;
    public static final EnumC1550d WEDNESDAY;

    /* JADX INFO: renamed from: a */
    public static final EnumC1550d[] f10695a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1550d[] f10696b;

    static {
        EnumC1550d enumC1550d = new EnumC1550d("MONDAY", 0);
        MONDAY = enumC1550d;
        EnumC1550d enumC1550d2 = new EnumC1550d("TUESDAY", 1);
        TUESDAY = enumC1550d2;
        EnumC1550d enumC1550d3 = new EnumC1550d("WEDNESDAY", 2);
        WEDNESDAY = enumC1550d3;
        EnumC1550d enumC1550d4 = new EnumC1550d("THURSDAY", 3);
        THURSDAY = enumC1550d4;
        EnumC1550d enumC1550d5 = new EnumC1550d("FRIDAY", 4);
        FRIDAY = enumC1550d5;
        EnumC1550d enumC1550d6 = new EnumC1550d("SATURDAY", 5);
        SATURDAY = enumC1550d6;
        EnumC1550d enumC1550d7 = new EnumC1550d("SUNDAY", 6);
        SUNDAY = enumC1550d7;
        f10696b = new EnumC1550d[]{enumC1550d, enumC1550d2, enumC1550d3, enumC1550d4, enumC1550d5, enumC1550d6, enumC1550d7};
        f10695a = values();
    }

    /* JADX INFO: renamed from: r */
    public static EnumC1550d m24061r(int i) {
        if (i >= 1 && i <= 7) {
            return f10695a[i - 1];
        }
        throw new C1512b("Invalid value for DayOfWeek: " + i);
    }

    public static EnumC1550d valueOf(String str) {
        return (EnumC1550d) Enum.valueOf(EnumC1550d.class, str);
    }

    public static EnumC1550d[] values() {
        return (EnumC1550d[]) f10696b.clone();
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.DAYS : super.mo23841b(c1580i);
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(getValue(), EnumC1592a.DAY_OF_WEEK);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p == EnumC1592a.DAY_OF_WEEK ? getValue() : super.mo23952g(interfaceC1607p);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.DAY_OF_WEEK;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC1607p instanceof EnumC1592a) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        return interfaceC1607p.mo24163T(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p == EnumC1592a.DAY_OF_WEEK ? interfaceC1607p.range() : super.mo23920j(interfaceC1607p);
    }
}
