package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.krl0[], still in use, count: 1, list:
  (r0v1 p.krl0[]) from 0x0055: CONSTRUCTOR (r0v1 p.krl0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:86) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class krl0 {
    /* JADX INFO: Fake field, exist only in values array */
    OPPO_ENCO_AIR5_PRO(0, "OPPO Enco Air5 Pro"),
    /* JADX INFO: Fake field, exist only in values array */
    ONEPLUS_NORD_BUDS_4_PRO(1, "OnePlus Nord Buds 4 Pro"),
    /* JADX INFO: Fake field, exist only in values array */
    OPPO_ENCO_EINSTEIN_3(2, "OPPO Enco Einstein 3"),
    /* JADX INFO: Fake field, exist only in values array */
    OPPO_ENCO_CLIP2(3, "OPPO Enco Clip2"),
    /* JADX INFO: Fake field, exist only in values array */
    OPPO_ENCO_AIR5S(4, "OPPO Enco Air5s"),
    /* JADX INFO: Fake field, exist only in values array */
    OPPO_ENCO_AIR5(5, "OPPO Enco Air5"),
    /* JADX INFO: Fake field, exist only in values array */
    ONEPLUS_NORD_BUDS_4(6, "OnePlus Nord Buds 4");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f125685d;

    /* JADX INFO: renamed from: a */
    public final String f125686a;

    /* JADX INFO: renamed from: b */
    public final String f125687b;

    static {
        f125685d = new nzv(krl0VarArr);
    }

    public krl0(int i, String str) {
        super(str, i);
        this.f125686a = str;
        this.f125687b = str;
    }

    public static krl0 valueOf(String str) {
        return (krl0) Enum.valueOf(krl0.class, str);
    }

    public static krl0[] values() {
        return (krl0[]) f125684c.clone();
    }
}
