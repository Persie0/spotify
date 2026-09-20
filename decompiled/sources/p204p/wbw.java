package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 p.wbw[], still in use, count: 1, list:
  (r0v4 p.wbw[]) from 0x00aa: CONSTRUCTOR (r0v4 p.wbw[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:171) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class wbw {
    None(0),
    EqSwap(1),
    /* JADX INFO: Fake field, exist only in values array */
    BassFadeIn(2),
    /* JADX INFO: Fake field, exist only in values array */
    BassCrossfade(3),
    BassSwap(4),
    /* JADX INFO: Fake field, exist only in values array */
    BassAndMidSwap(7),
    /* JADX INFO: Fake field, exist only in values array */
    MidSwap(8),
    /* JADX INFO: Fake field, exist only in values array */
    HiSwap(9),
    BassSwapAtEnd(10),
    BassSwapAtStart(11),
    BassCuts(12),
    NoBass(13),
    StartFadeOut(14),
    BassFadeOut(15),
    Unknown(-1);


    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ nzv f249863Z;

    /* JADX INFO: renamed from: a */
    public final int f249873a;

    static {
        f249863Z = new nzv(wbwVarArr);
    }

    public wbw(int i) {
        super(str, i);
        this.f249873a = i;
    }

    public static wbw valueOf(String str) {
        return (wbw) Enum.valueOf(wbw.class, str);
    }

    public static wbw[] values() {
        return (wbw[]) f249862Y.clone();
    }
}
