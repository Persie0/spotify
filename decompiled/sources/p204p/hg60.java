package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.hg60[], still in use, count: 1, list:
  (r0v1 p.hg60[]) from 0x0064: CONSTRUCTOR (r0v1 p.hg60[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:101) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hg60 {
    None(0),
    SpinbackEnd1Beat(1),
    SpinbackEnd2Beat(2),
    SpinbackEnd4Beat(3),
    VinylStopFast4End(4),
    VinylStopFast2End(5),
    VinylStopFast1End(6),
    VinylStopSlowEnd(7),
    Unknown(-1);


    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ nzv f91040Y;

    /* JADX INFO: renamed from: a */
    public final int f91050a;

    static {
        f91040Y = new nzv(hg60VarArr);
    }

    public hg60(int i) {
        super(str, i);
        this.f91050a = i;
    }

    public static hg60 valueOf(String str) {
        return (hg60) Enum.valueOf(hg60.class, str);
    }

    public static hg60[] values() {
        return (hg60[]) f91039X.clone();
    }
}
