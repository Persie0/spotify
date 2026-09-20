package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.tmw0[], still in use, count: 1, list:
  (r0v1 p.tmw0[]) from 0x0047: CONSTRUCTOR (r0v1 p.tmw0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:72) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tmw0 {
    f221788c(0, "UNKNOWN_REPLACEMENT_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1, "WITH_TIME_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(2, "CHARGE_PRORATED_PRICE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(3, "WITHOUT_PRORATION"),
    f221789d(6, "DEFERRED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF60(5, "CHARGE_FULL_PRICE");


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f221791f;

    /* JADX INFO: renamed from: a */
    public final String f221792a;

    /* JADX INFO: renamed from: b */
    public final int f221793b;

    static {
        f221791f = new nzv(tmw0VarArr);
    }

    public tmw0(int i, String str) {
        super(str, i);
        this.f221792a = str;
        this.f221793b = i;
    }

    public static tmw0 valueOf(String str) {
        return (tmw0) Enum.valueOf(tmw0.class, str);
    }

    public static tmw0[] values() {
        return (tmw0[]) f221790e.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m81147a() {
        return this.f221792a;
    }
}
