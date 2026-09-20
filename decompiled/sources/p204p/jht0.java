package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.jht0[], still in use, count: 1, list:
  (r0v1 p.jht0[]) from 0x0026: CONSTRUCTOR (r0v1 p.jht0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class jht0 {
    STANDARD(0),
    VERY_HIGH(1),
    LOSSLESS(2);


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f112563f;

    /* JADX INFO: renamed from: a */
    public final String f112564a;

    static {
        f112563f = new nzv(jht0VarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jht0(int i) {
        super(str, i);
        String strValueOf = String.valueOf(i);
        this.f112564a = strValueOf;
    }

    public static jht0 valueOf(String str) {
        return (jht0) Enum.valueOf(jht0.class, str);
    }

    public static jht0[] values() {
        return (jht0[]) f112562e.clone();
    }
}
