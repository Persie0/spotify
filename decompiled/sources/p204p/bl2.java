package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.bl2[], still in use, count: 1, list:
  (r0v1 p.bl2[]) from 0x004e: CONSTRUCTOR (r0v1 p.bl2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class bl2 {
    TOOL_START("tool_start"),
    /* JADX INFO: Fake field, exist only in values array */
    TOOL_END("tool_end"),
    THINKING("thinking"),
    ROUTINE_RESULT("routine_result"),
    PERMISSION_REQUEST("permission_request"),
    PERMISSION_RESOLVED("permission_resolved");


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f28064h;

    /* JADX INFO: renamed from: a */
    public final String f28065a;

    static {
        f28064h = new nzv(bl2VarArr);
    }

    public bl2(String str) {
        super(str, i);
        this.f28065a = str;
    }

    public static bl2 valueOf(String str) {
        return (bl2) Enum.valueOf(bl2.class, str);
    }

    public static bl2[] values() {
        return (bl2[]) f28063g.clone();
    }
}
