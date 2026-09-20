package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 p.yp31[], still in use, count: 1, list:
  (r0v18 p.yp31[]) from 0x00c8: CONSTRUCTOR (r0v18 p.yp31[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:201) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yp31 {
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS("Linkbuds"),
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS_FIT("Linkbuds Fit"),
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS_OPEN("Linkbuds Open"),
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS_S("Linkbuds S"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_1000XM5("WF-1000XM5"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_C510("WF-C510"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_C710N("WF-C710N"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_L910("WF-L910"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_LC900("WF-LC900"),
    /* JADX INFO: Fake field, exist only in values array */
    WF_LS910N("WF-LS910N"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2950("YY2950"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2953("YY2953"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2963("YY2963"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2964("YY2964"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2975("YY2975"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2982("YY2982"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2986("YY2986"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2999("YY2999");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f274809c;

    /* JADX INFO: renamed from: a */
    public final String f274810a;

    static {
        f274809c = new nzv(yp31VarArr);
    }

    public yp31(String str) {
        super(str, i);
        this.f274810a = str;
    }

    public static yp31 valueOf(String str) {
        return (yp31) Enum.valueOf(yp31.class, str);
    }

    public static yp31[] values() {
        return (yp31[]) f274808b.clone();
    }
}
