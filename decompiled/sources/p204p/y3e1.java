package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.y3e1[], still in use, count: 1, list:
  (r0v1 p.y3e1[]) from 0x0032: CONSTRUCTOR (r0v1 p.y3e1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@rtz0
public final class y3e1 {
    STEADY("steady"),
    /* JADX INFO: Fake field, exist only in values array */
    TAPERED("tapered"),
    /* JADX INFO: Fake field, exist only in values array */
    PYRAMID("pyramid"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERVALS("intervals");

    public static final x3e1 Companion = new x3e1();

    /* JADX INFO: renamed from: b */
    public static final Object f268905b = q3d0.m72078I(2, rfd1.f198596O0);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f268908e;

    /* JADX INFO: renamed from: a */
    public final String f268909a;

    static {
        f268908e = new nzv(new y3e1[]{r0, new y3e1("tapered"), new y3e1("pyramid"), new y3e1("intervals")});
    }

    public y3e1(String str) {
        super(str, i);
        this.f268909a = str;
    }

    public static y3e1 valueOf(String str) {
        return (y3e1) Enum.valueOf(y3e1.class, str);
    }

    public static y3e1[] values() {
        return (y3e1[]) f268907d.clone();
    }
}
