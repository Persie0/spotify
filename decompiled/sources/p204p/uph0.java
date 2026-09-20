package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 p.uph0[], still in use, count: 1, list:
  (r0v25 p.uph0[]) from 0x0149: CONSTRUCTOR (r0v25 p.uph0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:330) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uph0 {
    f232693b("REAL_ENDPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("TST1_ENDPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("NO_ADDRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("TIMELINE_V2_SIMPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("TIMELINE_V2_2_ITEMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("TIMELINE_V2_END_TEXT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("REQUIRE_ADDRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("INVALID_ADDRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF101("REDIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF112("ERROR_CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF123("ERROR_FOLLOW_LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF134("ERROR_DOUBLE_FOLLOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF147("ERROR_LINK_CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF160("CHECKOUT_STATUS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF173("NETWORK_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF186("SUBMIT_SUCCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF199("SUBMIT_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF212("SUBMIT_UPDATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF225("SUBMIT_ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF238("SUBMIT_CHECKOUT_STATUS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF251("SUBMIT_NETWORK_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF264("TRANSITION_ADD"),
    /* JADX INFO: Fake field, exist only in values array */
    EF277("TRANSITION_REMOVAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF290("TRANSITION_UPDATE");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f232695d;

    /* JADX INFO: renamed from: a */
    public final th00 f232696a;

    static {
        f232695d = new nzv(uph0VarArr);
    }

    public uph0(String str) {
        super(str, i);
        this.f232696a = th00Var;
    }

    public static uph0 valueOf(String str) {
        return (uph0) Enum.valueOf(uph0.class, str);
    }

    public static uph0[] values() {
        return (uph0[]) f232694c.clone();
    }
}
