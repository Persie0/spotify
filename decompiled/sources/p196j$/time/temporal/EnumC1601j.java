package p196j$.time.temporal;

import java.util.Map;
import p196j$.time.C1512b;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.format.C1574v;
import p196j$.time.format.EnumC1575w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.j */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC1601j implements InterfaceC1607p {
    public static final EnumC1601j JULIAN_DAY;
    public static final EnumC1601j MODIFIED_JULIAN_DAY;
    public static final EnumC1601j RATA_DIE;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC1601j[] f10827d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a */
    public final transient String f10828a;

    /* JADX INFO: renamed from: b */
    public final transient C1610s f10829b;

    /* JADX INFO: renamed from: c */
    public final transient long f10830c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC1601j enumC1601j = new EnumC1601j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC1601j;
        EnumC1601j enumC1601j2 = new EnumC1601j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC1601j2;
        EnumC1601j enumC1601j3 = new EnumC1601j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC1601j3;
        f10827d = new EnumC1601j[]{enumC1601j, enumC1601j2, enumC1601j3};
    }

    public EnumC1601j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.f10828a = str2;
        this.f10829b = C1610s.m24173f((-365243219162L) + j, 365241780471L + j);
        this.f10830c = j;
    }

    public static EnumC1601j valueOf(String str) {
        return (EnumC1601j) Enum.valueOf(EnumC1601j.class, str);
    }

    public static EnumC1601j[] values() {
        return (EnumC1601j[]) f10827d.clone();
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: E */
    public final C1610s mo24162E(InterfaceC1603l interfaceC1603l) {
        if (interfaceC1603l.mo23842h(EnumC1592a.EPOCH_DAY)) {
            return this.f10829b;
        }
        throw new C1512b("Unsupported field: " + this);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: K */
    public final InterfaceC1603l mo24168K(Map map, C1574v c1574v, EnumC1575w enumC1575w) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC1535l interfaceC1535lM24039q = InterfaceC1535l.m24039q(c1574v);
        EnumC1575w enumC1575w2 = EnumC1575w.LENIENT;
        long j = this.f10830c;
        if (enumC1575w == enumC1575w2) {
            return interfaceC1535lM24039q.mo24007n(Math.subtractExact(jLongValue, j));
        }
        this.f10829b.m24176b(jLongValue, this);
        return interfaceC1535lM24039q.mo24007n(jLongValue - j);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: T */
    public final long mo24163T(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l.mo23843i(EnumC1592a.EPOCH_DAY) + this.f10830c;
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: Z */
    public final Temporal mo24164Z(Temporal temporal, long j) {
        if (this.f10829b.m24179e(j)) {
            return temporal.mo23948c(Math.subtractExact(j, this.f10830c), EnumC1592a.EPOCH_DAY);
        }
        throw new C1512b("Invalid value: " + this.f10828a + " " + j);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    public final boolean isDateBased() {
        return true;
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    /* JADX INFO: renamed from: r */
    public final boolean mo24167r(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l.mo23842h(EnumC1592a.EPOCH_DAY);
    }

    @Override // p196j$.time.temporal.InterfaceC1607p
    public final C1610s range() {
        return this.f10829b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10828a;
    }
}
