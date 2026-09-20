package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.cqc1[], still in use, count: 1, list:
  (r0v1 p.cqc1[]) from 0x003e: CONSTRUCTOR (r0v1 p.cqc1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:63) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cqc1 {
    INTERNAL(0),
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f40831f;

    /* JADX INFO: renamed from: a */
    public final dfz f40832a;

    static {
        f40831f = new nzv(cqc1VarArr);
    }

    public cqc1(int i) {
        super(str, i);
        this.f40832a = new dfz(nfz.f153463d, i);
    }

    public static cqc1 valueOf(String str) {
        return (cqc1) Enum.valueOf(cqc1.class, str);
    }

    public static cqc1[] values() {
        return (cqc1[]) f40830e.clone();
    }
}
