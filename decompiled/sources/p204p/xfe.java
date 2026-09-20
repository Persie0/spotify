package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.xfe[], still in use, count: 1, list:
  (r0v1 p.xfe[]) from 0x004e: CONSTRUCTOR (r0v1 p.xfe[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
public final class xfe {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ nzv f260939t;

    /* JADX INFO: renamed from: a */
    public final dfz f260940a;

    static {
        f260939t = new nzv(xfeVarArr);
    }

    public xfe(int i) {
        super(str, i);
        this.f260940a = new dfz(nfz.f153465f, i);
    }

    public static xfe valueOf(String str) {
        return (xfe) Enum.valueOf(xfe.class, str);
    }

    public static xfe[] values() {
        return (xfe[]) f260938i.clone();
    }
}
