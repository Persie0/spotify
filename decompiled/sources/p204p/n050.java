package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.n050[], still in use, count: 1, list:
  (r0v1 p.n050[]) from 0x007a: CONSTRUCTOR (r0v1 p.n050[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:123) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class n050 {
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTING(0),
    PAIRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBING(2),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHING_APP_STORE(3),
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_APP_TO_BE_INSTALLED(4),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHING_THE_APP(5),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(6),
    UNKNOWN_ERROR(100),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_NOT_FOUND(101),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_NOT_SUPPORTED(102),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(103),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(104);


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f148893e;

    /* JADX INFO: renamed from: a */
    public final int f148894a;

    static {
        f148893e = new nzv(n050VarArr);
    }

    public n050(int i) {
        super(str, i);
        this.f148894a = i;
    }

    public static n050 valueOf(String str) {
        return (n050) Enum.valueOf(n050.class, str);
    }

    public static n050[] values() {
        return (n050[]) f148892d.clone();
    }
}
