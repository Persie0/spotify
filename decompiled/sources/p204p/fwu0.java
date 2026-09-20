package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fwu0[], still in use, count: 1, list:
  (r0v1 p.fwu0[]) from 0x0084: CONSTRUCTOR (r0v1 p.fwu0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:133) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class fwu0 {
    UNKNOWN(0),
    CAST_INTERNAL_ERROR(1),
    CASTING_STOPPED(2),
    APPLICATION_NOT_RUNNING(3),
    SESSION_START_FAILED(4),
    SESSION_RESUME_FAILED(5),
    CAST_SOCKET_ERROR(6),
    TIMEOUT(7),
    NETWORK_ERROR(8),
    CASTING_ROUTE_CHANGED(9),
    APPLICATION_LAUNCH_ERROR(10),
    CANCELLED(11);


    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ nzv f74166M0;

    /* JADX INFO: renamed from: a */
    public final int f74179a;

    static {
        f74166M0 = new nzv(fwu0VarArr);
    }

    public fwu0(int i) {
        super(str, i);
        this.f74179a = i;
    }

    public static fwu0 valueOf(String str) {
        return (fwu0) Enum.valueOf(fwu0.class, str);
    }

    public static fwu0[] values() {
        return (fwu0[]) f74165L0.clone();
    }
}
