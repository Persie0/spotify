package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.eqj0[], still in use, count: 1, list:
  (r0v1 p.eqj0[]) from 0x002a: CONSTRUCTOR (r0v1 p.eqj0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:43) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class eqj0 {
    /* JADX INFO: Fake field, exist only in values array */
    Free("free"),
    OptOut("opt-out"),
    EntityKind("entity-kind");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f61912e;

    /* JADX INFO: renamed from: a */
    public final String f61913a;

    static {
        f61912e = new nzv(eqj0VarArr);
    }

    public eqj0(String str) {
        super(str, i);
        this.f61913a = str;
    }

    public static eqj0 valueOf(String str) {
        return (eqj0) Enum.valueOf(eqj0.class, str);
    }

    public static eqj0[] values() {
        return (eqj0[]) f61911d.clone();
    }
}
