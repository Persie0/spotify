package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.vw50[], still in use, count: 1, list:
  (r0v1 p.vw50[]) from 0x0063: CONSTRUCTOR (r0v1 p.vw50[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vw50 {
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_2("Elite 2"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_3("Elite 3"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_3_ACTIVE("Elite 3 Active"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_4("Elite 4"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_4_ACTIVE("Elite 4 Active"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_5("Elite 5"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_5T("Connect 5t"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_8("Elite 8"),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_10("Elite 10");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f245396c;

    /* JADX INFO: renamed from: a */
    public final String f245397a;

    static {
        f245396c = new nzv(vw50VarArr);
    }

    public vw50(String str) {
        super(str, i);
        this.f245397a = str;
    }

    public static vw50 valueOf(String str) {
        return (vw50) Enum.valueOf(vw50.class, str);
    }

    public static vw50[] values() {
        return (vw50[]) f245395b.clone();
    }
}
