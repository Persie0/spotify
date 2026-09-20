package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class vc20 {

    /* JADX INFO: renamed from: g */
    public static final vc20 f239646g;

    /* JADX INFO: renamed from: h */
    public static final vc20 f239647h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ vc20[] f239648i;

    /* JADX INFO: renamed from: a */
    public final String f239649a;

    /* JADX INFO: renamed from: b */
    public final String f239650b;

    /* JADX INFO: renamed from: c */
    public final String f239651c;

    /* JADX INFO: renamed from: d */
    public final String f239652d;

    /* JADX INFO: renamed from: e */
    public final String f239653e;

    /* JADX INFO: renamed from: f */
    public final xfr f239654f;

    /* JADX INFO: Fake field, exist only in values array */
    vc20 EF1;

    static {
        vc20 vc20Var = new vc20("NONE", 0, "None", "", "NONE", "", "", xfr.f261078a);
        f239646g = vc20Var;
        xfr xfrVar = xfr.f261068Q0;
        vc20 vc20Var2 = new vc20("SPECIFIC", 1, "Specific Headphones", "My imaginary Jabra device", "B9-B3-C2-D3-B2", "Jabra", "Elite 75t", xfrVar);
        vc20 vc20Var3 = new vc20("AIRPODS", 2, "Airpods", "My AirPods", "A9-B3-C2-D3-B2", "Apple", "AirPods", xfrVar);
        vc20 vc20Var4 = new vc20("BEATS", 3, "Beats Powerbeats Pro", "Beats Powerbeats Pro", "A9-B3-C2-D3-B2", "Beats", "Powerbeats Pro", xfrVar);
        vc20 vc20Var5 = new vc20("GENERIC", 4, "Generic Headphones", "My Generic Headphones", "G9-B3-C2-D3-B2", "Generic Brand", "Generic Model", xfrVar);
        vc20 vc20Var6 = new vc20("BLUETOOTH_UNKNOWN", 5, "Unknown Bluetooth Device", "Unknown Bluetooth Device", "U9-B3-C2-D3-B2", "Unknown Brand", "Unknown Model", xfr.f261070S0);
        f239647h = vc20Var6;
        f239648i = new vc20[]{vc20Var, vc20Var2, vc20Var3, vc20Var4, vc20Var5, vc20Var6, new vc20("MISCATEGORIZED_AS_CAR", 6, "QC35 II - miscategorized as car", "Bose QuietComfort 35 II", "U9-B3-C2-D3-B2", "Bose", "QuietComfort 35 II", xfr.f261071T0)};
    }

    public vc20(String str, int i, String str2, String str3, String str4, String str5, String str6, xfr xfrVar) {
        super(str, i);
        this.f239649a = str2;
        this.f239650b = str3;
        this.f239651c = str4;
        this.f239652d = str5;
        this.f239653e = str6;
        this.f239654f = xfrVar;
    }

    public static vc20 valueOf(String str) {
        return (vc20) Enum.valueOf(vc20.class, str);
    }

    public static vc20[] values() {
        return (vc20[]) f239648i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f239649a;
    }
}
