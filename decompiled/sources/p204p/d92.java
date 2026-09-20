package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.d92[], still in use, count: 1, list:
  (r0v1 p.d92[]) from 0x0032: CONSTRUCTOR (r0v1 p.d92[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d92 {
    UNSET("UNSET"),
    /* JADX INFO: Fake field, exist only in values array */
    PENDING_DISABLED("PENDING_DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTIVATED("REACTIVATED"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED("COMPLETED");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f46641d;

    /* JADX INFO: renamed from: a */
    public final String f46642a;

    static {
        f46641d = new nzv(d92VarArr);
    }

    public d92(String str) {
        super(str, i);
        this.f46642a = str;
    }

    public static d92 valueOf(String str) {
        return (d92) Enum.valueOf(d92.class, str);
    }

    public static d92[] values() {
        return (d92[]) f46640c.clone();
    }
}
