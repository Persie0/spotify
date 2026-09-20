package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.oth0[], still in use, count: 1, list:
  (r0v1 p.oth0[]) from 0x0030: CONSTRUCTOR (r0v1 p.oth0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class oth0 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f169098g;

    /* JADX INFO: renamed from: a */
    public final dfz f169099a;

    static {
        f169098g = new nzv(oth0VarArr);
    }

    public oth0(int i) {
        super(str, i);
        this.f169099a = new dfz(nfz.f153464e, i);
    }

    public static oth0 valueOf(String str) {
        return (oth0) Enum.valueOf(oth0.class, str);
    }

    public static oth0[] values() {
        return (oth0[]) f169097f.clone();
    }
}
