package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.hu51[], still in use, count: 1, list:
  (r0v1 p.hu51[]) from 0x004e: CONSTRUCTOR (r0v1 p.hu51[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class hu51 {
    f95290c(0, "UNKNOWN_REPLACEMENT_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1, "WITH_TIME_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(2, "CHARGE_PRORATED_PRICE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(3, "WITHOUT_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(4, "CHARGE_FULL_PRICE"),
    f95291d(5, "DEFERRED"),
    f95292e(6, "KEEP_EXISTING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67(7, "CHARGE_FULL_PRICE_WITH_PRORATED_REFUND");


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f95294g;

    /* JADX INFO: renamed from: a */
    public final String f95295a;

    /* JADX INFO: renamed from: b */
    public final int f95296b;

    static {
        f95294g = new nzv(hu51VarArr);
    }

    public hu51(int i, String str) {
        super(str, i);
        this.f95295a = str;
        this.f95296b = i;
    }

    public static hu51 valueOf(String str) {
        return (hu51) Enum.valueOf(hu51.class, str);
    }

    public static hu51[] values() {
        return (hu51[]) f95293f.clone();
    }
}
