package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class xri0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xri0[] f265351b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f265352c;

    /* JADX INFO: renamed from: a */
    public final cks f265353a;

    /* JADX INFO: Fake field, exist only in values array */
    xri0 EF0;

    static {
        hvi0 hvi0Var = cks.f39079b;
        ils ilsVar = ils.HOURS;
        xri0 xri0Var = new xri0("ONE_HOUR", 0, new cks(jwg1.m54449D(1, ilsVar)));
        xri0 xri0Var2 = new xri0("EIGHT_HOURS", 1, new cks(jwg1.m54449D(8, ilsVar)));
        ils ilsVar2 = ils.DAYS;
        xri0[] xri0VarArr = {xri0Var, xri0Var2, new xri0("ONE_DAY", 2, new cks(jwg1.m54449D(1, ilsVar2))), new xri0("ONE_WEEK", 3, new cks(jwg1.m54449D(7, ilsVar2))), new xri0("ALWAYS", 4, null)};
        f265351b = xri0VarArr;
        f265352c = new nzv(xri0VarArr);
    }

    public xri0(String str, int i, cks cksVar) {
        super(str, i);
        this.f265353a = cksVar;
    }

    public static xri0 valueOf(String str) {
        return (xri0) Enum.valueOf(xri0.class, str);
    }

    public static xri0[] values() {
        return (xri0[]) f265351b.clone();
    }
}
