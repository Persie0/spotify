package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.hab1[], still in use, count: 1, list:
  (r0v1 p.hab1[]) from 0x001d: CONSTRUCTOR (r0v1 p.hab1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:30) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
public final class hab1 {
    FIRST(1),
    SECOND(2);


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f89188e;

    /* JADX INFO: renamed from: a */
    public final int f89189a;

    static {
        f89188e = new nzv(hab1VarArr);
    }

    public hab1(int i) {
        super(str, i);
        this.f89189a = i;
    }

    public static hab1 valueOf(String str) {
        return (hab1) Enum.valueOf(hab1.class, str);
    }

    public static hab1[] values() {
        return (hab1[]) f89187d.clone();
    }
}
