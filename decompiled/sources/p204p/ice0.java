package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ice0[], still in use, count: 1, list:
  (r0v1 p.ice0[]) from 0x0028: CONSTRUCTOR (r0v1 p.ice0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ice0 {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f100807c;

    /* JADX INFO: renamed from: a */
    public final dfz f100808a;

    static {
        f100807c = new nzv(ice0VarArr);
    }

    public ice0(int i) {
        super(str, i);
        this.f100808a = new dfz(nfz.f153476q, i);
    }

    public static ice0 valueOf(String str) {
        return (ice0) Enum.valueOf(ice0.class, str);
    }

    public static ice0[] values() {
        return (ice0[]) f100806b.clone();
    }
}
