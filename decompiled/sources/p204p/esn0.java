package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.esn0[], still in use, count: 1, list:
  (r0v1 p.esn0[]) from 0x002c: CONSTRUCTOR (r0v1 p.esn0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class esn0 {
    INSTALLED("installed"),
    APP_OPENED("app_opened"),
    SIGNED_IN("signed_in");


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f62430f;

    /* JADX INFO: renamed from: a */
    public final String f62431a;

    static {
        f62430f = new nzv(esn0VarArr);
    }

    public esn0(String str) {
        super(str, i);
        this.f62431a = str;
    }

    public static esn0 valueOf(String str) {
        return (esn0) Enum.valueOf(esn0.class, str);
    }

    public static esn0[] values() {
        return (esn0[]) f62429e.clone();
    }
}
