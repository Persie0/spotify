package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.nzl0[], still in use, count: 1, list:
  (r0v1 p.nzl0[]) from 0x0044: CONSTRUCTOR (r0v1 p.nzl0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class nzl0 {
    BUILT_IN_SPEAKER("Built-in"),
    WIRED("LineOut"),
    CAR_PROJECTED("CarProjected"),
    BLUETOOTH("Bluetooth"),
    UNKNOWN("Unknown");


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f160110h;

    /* JADX INFO: renamed from: a */
    public final String f160111a;

    static {
        f160110h = new nzv(nzl0VarArr);
    }

    public nzl0(String str) {
        super(str, i);
        this.f160111a = str;
    }

    public static nzl0 valueOf(String str) {
        return (nzl0) Enum.valueOf(nzl0.class, str);
    }

    public static nzl0[] values() {
        return (nzl0[]) f160109g.clone();
    }
}
