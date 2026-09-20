package p196j$.time;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.InterfaceC1535l;
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
/* JADX INFO: renamed from: j$.time.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1585n implements InterfaceC1603l, InterfaceC1604m {
    public static final EnumC1585n APRIL;
    public static final EnumC1585n AUGUST;
    public static final EnumC1585n DECEMBER;
    public static final EnumC1585n FEBRUARY;
    public static final EnumC1585n JANUARY;
    public static final EnumC1585n JULY;
    public static final EnumC1585n JUNE;
    public static final EnumC1585n MARCH;
    public static final EnumC1585n MAY;
    public static final EnumC1585n NOVEMBER;
    public static final EnumC1585n OCTOBER;
    public static final EnumC1585n SEPTEMBER;

    /* JADX INFO: renamed from: a */
    public static final EnumC1585n[] f10797a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1585n[] f10798b;

    static {
        EnumC1585n enumC1585n = new EnumC1585n("JANUARY", 0);
        JANUARY = enumC1585n;
        EnumC1585n enumC1585n2 = new EnumC1585n("FEBRUARY", 1);
        FEBRUARY = enumC1585n2;
        EnumC1585n enumC1585n3 = new EnumC1585n("MARCH", 2);
        MARCH = enumC1585n3;
        EnumC1585n enumC1585n4 = new EnumC1585n("APRIL", 3);
        APRIL = enumC1585n4;
        EnumC1585n enumC1585n5 = new EnumC1585n("MAY", 4);
        MAY = enumC1585n5;
        EnumC1585n enumC1585n6 = new EnumC1585n("JUNE", 5);
        JUNE = enumC1585n6;
        EnumC1585n enumC1585n7 = new EnumC1585n("JULY", 6);
        JULY = enumC1585n7;
        EnumC1585n enumC1585n8 = new EnumC1585n("AUGUST", 7);
        AUGUST = enumC1585n8;
        EnumC1585n enumC1585n9 = new EnumC1585n("SEPTEMBER", 8);
        SEPTEMBER = enumC1585n9;
        EnumC1585n enumC1585n10 = new EnumC1585n("OCTOBER", 9);
        OCTOBER = enumC1585n10;
        EnumC1585n enumC1585n11 = new EnumC1585n("NOVEMBER", 10);
        NOVEMBER = enumC1585n11;
        EnumC1585n enumC1585n12 = new EnumC1585n("DECEMBER", 11);
        DECEMBER = enumC1585n12;
        f10798b = new EnumC1585n[]{enumC1585n, enumC1585n2, enumC1585n3, enumC1585n4, enumC1585n5, enumC1585n6, enumC1585n7, enumC1585n8, enumC1585n9, enumC1585n10, enumC1585n11, enumC1585n12};
        f10797a = values();
    }

    /* JADX INFO: renamed from: T */
    public static EnumC1585n m24152T(int i) {
        if (i >= 1 && i <= 12) {
            return f10797a[i - 1];
        }
        throw new C1512b("Invalid value for MonthOfYear: " + i);
    }

    public static EnumC1585n valueOf(String str) {
        return (EnumC1585n) Enum.valueOf(EnumC1585n.class, str);
    }

    public static EnumC1585n[] values() {
        return (EnumC1585n[]) f10798b.clone();
    }

    /* JADX INFO: renamed from: E */
    public final int m24153E(boolean z) {
        int i = AbstractC1584m.f10796a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    /* JADX INFO: renamed from: K */
    public final int m24154K() {
        int i = AbstractC1584m.f10796a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10835b) {
            return C1542s.f10679c;
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.MONTHS : super.mo23841b(c1580i);
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        if (!InterfaceC1535l.m24039q(temporal).equals(C1542s.f10679c)) {
            throw new C1512b("Adjustment only supported on ISO date-time");
        }
        return temporal.mo23948c(getValue(), EnumC1592a.MONTH_OF_YEAR);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        return interfaceC1607p == EnumC1592a.MONTH_OF_YEAR ? getValue() : super.mo23952g(interfaceC1607p);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.MONTH_OF_YEAR;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.MONTH_OF_YEAR) {
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
        return interfaceC1607p == EnumC1592a.MONTH_OF_YEAR ? interfaceC1607p.range() : super.mo23920j(interfaceC1607p);
    }

    /* JADX INFO: renamed from: r */
    public final int m24155r(boolean z) {
        switch (AbstractC1584m.f10796a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + AdvertisementType.ON_DEMAND_POST_ROLL;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }
}
