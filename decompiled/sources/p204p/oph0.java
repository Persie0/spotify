package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.oph0[], still in use, count: 1, list:
  (r0v1 p.oph0[]) from 0x0046: CONSTRUCTOR (r0v1 p.oph0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class oph0 {
    REAL_ENDPOINT(z7g0.f280205T0),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_ADDRESS(z7g0.f280206U0),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_ADDRESS_AUTOCOMPLETE(z7g0.f280207V0),
    /* JADX INFO: Fake field, exist only in values array */
    SAVED_ADDRESS(z7g0.f280208W0),
    /* JADX INFO: Fake field, exist only in values array */
    SAVED_ADDRESS_AUTOCOMPLETE(z7g0.f280210X0),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(z7g0.f280212Y0);


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f167937d;

    /* JADX INFO: renamed from: a */
    public final qe70 f167938a;

    static {
        f167937d = new nzv(oph0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oph0(gh00 gh00Var) {
        super(str, i);
        this.f167938a = (qe70) gh00Var;
    }

    public static oph0 valueOf(String str) {
        return (oph0) Enum.valueOf(oph0.class, str);
    }

    public static oph0[] values() {
        return (oph0[]) f167936c.clone();
    }
}
