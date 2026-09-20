package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.xxm0[], still in use, count: 1, list:
  (r0v1 p.xxm0[]) from 0x0038: CONSTRUCTOR (r0v1 p.xxm0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
public final class xxm0 {
    ChildInitiatedAgeAssurance("child-initiated-age-assurance"),
    ChildInitiatedAgeAssuranceWeb("child-initiated-age-assurance-web"),
    ChildInitiatedSignup("child-initiated-signup"),
    ParentalControls("parental-controls");


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f267027g;

    /* JADX INFO: renamed from: a */
    public final String f267028a;

    static {
        f267027g = new nzv(xxm0VarArr);
    }

    public xxm0(String str) {
        super(str, i);
        this.f267028a = str;
    }

    public static xxm0 valueOf(String str) {
        return (xxm0) Enum.valueOf(xxm0.class, str);
    }

    public static xxm0[] values() {
        return (xxm0[]) f267026f.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m92338a() {
        return this.f267028a;
    }
}
