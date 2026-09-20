package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.etd1[], still in use, count: 1, list:
  (r0v1 p.etd1[]) from 0x0040: CONSTRUCTOR (r0v1 p.etd1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:65) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class etd1 {
    /* JADX INFO: Fake field, exist only in values array */
    COVER_SCREEN("COVER_SCREEN"),
    LOCK_SCREEN("LOCK_SCREEN"),
    HOME_SCREEN("HOME_SCREEN"),
    TRANSSION_HOME_SCREEN("TRANSSION_HOME_SCREEN"),
    TRANSSION_HOME_SCREEN_CARD("TRANSSION_HOME_SCREEN_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    MIUI_HOME_SCREEN("MIUI_HOME_SCREEN");


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f62689g;

    /* JADX INFO: renamed from: a */
    public final String f62690a;

    static {
        f62689g = new nzv(etd1VarArr);
    }

    public etd1(String str) {
        super(str, i);
        this.f62690a = str;
    }

    public static etd1 valueOf(String str) {
        return (etd1) Enum.valueOf(etd1.class, str);
    }

    public static etd1[] values() {
        return (etd1[]) f62688f.clone();
    }
}
