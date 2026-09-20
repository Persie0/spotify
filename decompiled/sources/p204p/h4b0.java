package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.h4b0[], still in use, count: 1, list:
  (r0v1 p.h4b0[]) from 0x005b: CONSTRUCTOR (r0v1 p.h4b0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:92) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
public final class h4b0 {
    None(0),
    TwoBeat(1),
    FourBeat(2),
    EightBeat(3),
    SixteenBeat(4),
    HalvingEnd(5),
    OneBeat(8),
    Unknown(-1);


    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ nzv f87485X;

    /* JADX INFO: renamed from: a */
    public final int f87495a;

    static {
        f87485X = new nzv(h4b0VarArr);
    }

    public h4b0(int i) {
        super(str, i);
        this.f87495a = i;
    }

    public static h4b0 valueOf(String str) {
        return (h4b0) Enum.valueOf(h4b0.class, str);
    }

    public static h4b0[] values() {
        return (h4b0[]) f87494t.clone();
    }
}
