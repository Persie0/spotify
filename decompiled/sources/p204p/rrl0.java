package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rrl0[], still in use, count: 1, list:
  (r0v1 p.rrl0[]) from 0x001c: CONSTRUCTOR (r0v1 p.rrl0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class rrl0 {
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL("notify-social"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("notify-comments");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f202082c;

    /* JADX INFO: renamed from: a */
    public final String f202083a;

    static {
        f202082c = new nzv(rrl0VarArr);
    }

    public rrl0(String str) {
        super(str, i);
        this.f202083a = str;
    }

    public static rrl0 valueOf(String str) {
        return (rrl0) Enum.valueOf(rrl0.class, str);
    }

    public static rrl0[] values() {
        return (rrl0[]) f202081b.clone();
    }
}
