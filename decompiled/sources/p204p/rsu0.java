package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rsu0[], still in use, count: 1, list:
  (r0v1 p.rsu0[]) from 0x0078: CONSTRUCTOR (r0v1 p.rsu0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:121) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class rsu0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Yellow"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Green"),
    f202437b("Blue"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("Pink");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f202439d;

    /* JADX INFO: renamed from: a */
    public final long f202440a;

    static {
        f202439d = new nzv(rsu0VarArr);
    }

    public rsu0(String str) {
        super(str, i);
        this.f202440a = j;
    }

    /* JADX INFO: renamed from: a */
    public static nzv m76354a() {
        return f202439d;
    }

    public static rsu0 valueOf(String str) {
        return (rsu0) Enum.valueOf(rsu0.class, str);
    }

    public static rsu0[] values() {
        return (rsu0[]) f202438c.clone();
    }
}
