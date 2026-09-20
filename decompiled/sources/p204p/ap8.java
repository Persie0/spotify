package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ap8[], still in use, count: 1, list:
  (r0v1 p.ap8[]) from 0x0020: CONSTRUCTOR (r0v1 p.ap8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:33) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ap8 {
    PREV_TRACK("prev-track"),
    RESTART_TRACK("restart-track");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f17850e;

    /* JADX INFO: renamed from: a */
    public final String f17851a;

    static {
        f17850e = new nzv(ap8VarArr);
    }

    public ap8(String str) {
        super(str, i);
        this.f17851a = str;
    }

    public static ap8 valueOf(String str) {
        return (ap8) Enum.valueOf(ap8.class, str);
    }

    public static ap8[] values() {
        return (ap8[]) f17849d.clone();
    }
}
