package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.lcb[], still in use, count: 1, list:
  (r0v1 p.lcb[]) from 0x001c: CONSTRUCTOR (r0v1 p.lcb[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
public final class lcb {
    /* JADX INFO: Fake field, exist only in values array */
    A('A'),
    /* JADX INFO: Fake field, exist only in values array */
    B('B');


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f131892c;

    /* JADX INFO: renamed from: a */
    public final char f131893a;

    static {
        f131892c = new nzv(lcbVarArr);
    }

    public lcb(char c) {
        super(str, i);
        this.f131893a = c;
    }

    public static lcb valueOf(String str) {
        return (lcb) Enum.valueOf(lcb.class, str);
    }

    public static lcb[] values() {
        return (lcb[]) f131891b.clone();
    }
}
