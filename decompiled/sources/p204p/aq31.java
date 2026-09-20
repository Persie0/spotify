package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.aq31[], still in use, count: 1, list:
  (r0v1 p.aq31[]) from 0x001a: CONSTRUCTOR (r0v1 p.aq31[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:27) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class aq31 {
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS_SPEAKER("Linkbuds Speaker"),
    /* JADX INFO: Fake field, exist only in values array */
    YY7863E("YY7863E");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f18066c;

    /* JADX INFO: renamed from: a */
    public final String f18067a;

    static {
        f18066c = new nzv(aq31VarArr);
    }

    public aq31(String str) {
        super(str, i);
        this.f18067a = str;
    }

    public static aq31 valueOf(String str) {
        return (aq31) Enum.valueOf(aq31.class, str);
    }

    public static aq31[] values() {
        return (aq31[]) f18065b.clone();
    }
}
