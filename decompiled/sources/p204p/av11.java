package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.av11[], still in use, count: 1, list:
  (r0v1 p.av11[]) from 0x001c: CONSTRUCTOR (r0v1 p.av11[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
public final class av11 {
    FRESH("FRESH"),
    RANDOM("RANDOM");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f20071e;

    /* JADX INFO: renamed from: a */
    public final String f20072a;

    static {
        f20071e = new nzv(av11VarArr);
    }

    public av11(String str) {
        super(str, i);
        this.f20072a = str;
    }

    public static av11 valueOf(String str) {
        return (av11) Enum.valueOf(av11.class, str);
    }

    public static av11[] values() {
        return (av11[]) f20070d.clone();
    }
}
