package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ag1[], still in use, count: 1, list:
  (r0v1 p.ag1[]) from 0x0028: CONSTRUCTOR (r0v1 p.ag1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
public final class ag1 {
    /* JADX INFO: Fake field, exist only in values array */
    AudiobookBoost("1"),
    /* JADX INFO: Fake field, exist only in values array */
    AudiobookFamily("2"),
    Invalid("");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f15267d;

    /* JADX INFO: renamed from: a */
    public final String f15268a;

    static {
        f15267d = new nzv(ag1VarArr);
    }

    public ag1(String str) {
        super(str, i);
        this.f15268a = str;
    }

    public static ag1 valueOf(String str) {
        return (ag1) Enum.valueOf(ag1.class, str);
    }

    public static ag1[] values() {
        return (ag1[]) f15266c.clone();
    }
}
