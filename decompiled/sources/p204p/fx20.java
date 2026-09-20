package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fx20[], still in use, count: 1, list:
  (r0v1 p.fx20[]) from 0x001c: CONSTRUCTOR (r0v1 p.fx20[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fx20 {
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EPISODES(0, y4y.f269270f),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_EPISODES(1, fby.f67943f);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f74228c;

    /* JADX INFO: renamed from: a */
    public final ix20 f74229a;

    static {
        f74228c = new nzv(fx20VarArr);
    }

    public fx20(int i, ix20 ix20Var) {
        super(str, i);
        this.f74229a = ix20Var;
    }

    public static fx20 valueOf(String str) {
        return (fx20) Enum.valueOf(fx20.class, str);
    }

    public static fx20[] values() {
        return (fx20[]) f74227b.clone();
    }
}
