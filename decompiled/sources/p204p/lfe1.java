package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.lfe1[], still in use, count: 1, list:
  (r0v1 p.lfe1[]) from 0x0038: CONSTRUCTOR (r0v1 p.lfe1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class lfe1 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f132939h;

    /* JADX INFO: renamed from: a */
    public final char f132940a;

    /* JADX INFO: renamed from: b */
    public final char f132941b;

    static {
        f132939h = new nzv(lfe1VarArr);
    }

    public lfe1(char c, char c2) {
        super(str, i);
        this.f132940a = c;
        this.f132941b = c2;
    }

    public static lfe1 valueOf(String str) {
        return (lfe1) Enum.valueOf(lfe1.class, str);
    }

    public static lfe1[] values() {
        return (lfe1[]) f132938g.clone();
    }
}
