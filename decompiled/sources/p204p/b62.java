package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.b62[], still in use, count: 1, list:
  (r0v1 p.b62[]) from 0x0024: CONSTRUCTOR (r0v1 p.b62[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:37) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class b62 {
    /* JADX INFO: Fake field, exist only in values array */
    ESTIMATION("ESTIMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION("VERIFICATION"),
    UNKNOWN("");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f23804d;

    /* JADX INFO: renamed from: a */
    public final String f23805a;

    static {
        f23804d = new nzv(b62VarArr);
    }

    public b62(String str) {
        super(str, i);
        this.f23805a = str;
    }

    public static b62 valueOf(String str) {
        return (b62) Enum.valueOf(b62.class, str);
    }

    public static b62[] values() {
        return (b62[]) f23803c.clone();
    }
}
