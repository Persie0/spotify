package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.zm70[], still in use, count: 1, list:
  (r0v1 p.zm70[]) from 0x0032: CONSTRUCTOR (r0v1 p.zm70[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zm70 {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    JAM("jam"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE_SEND("share_send"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAPPED("wrapped");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f284175d;

    /* JADX INFO: renamed from: a */
    public final String f284176a;

    static {
        f284175d = new nzv(zm70VarArr);
    }

    public zm70(String str) {
        super(str, i);
        this.f284176a = str;
    }

    public static zm70 valueOf(String str) {
        return (zm70) Enum.valueOf(zm70.class, str);
    }

    public static zm70[] values() {
        return (zm70[]) f284174c.clone();
    }
}
