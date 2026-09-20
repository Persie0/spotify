package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pcc1[], still in use, count: 1, list:
  (r0v1 p.pcc1[]) from 0x002c: CONSTRUCTOR (r0v1 p.pcc1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pcc1 {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f176045f;

    /* JADX INFO: renamed from: a */
    public final String f176046a;

    static {
        f176045f = new nzv(pcc1VarArr);
    }

    public pcc1(String str) {
        super(str, i);
        this.f176046a = str;
    }

    public static pcc1 valueOf(String str) {
        return (pcc1) Enum.valueOf(pcc1.class, str);
    }

    public static pcc1[] values() {
        return (pcc1[]) f176044e.clone();
    }
}
