package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v24 p.v1r0[], still in use, count: 1, list:
  (r0v24 p.v1r0[]) from 0x011d: CONSTRUCTOR (r0v24 p.v1r0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:286) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class v1r0 {
    None(0),
    SimpleFade(1),
    EqSwap(2),
    BassSwap(3),
    BassSwapFilterIn(4),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapFilterOut(5),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapEcho(6),
    /* JADX INFO: Fake field, exist only in values array */
    BassAndMidSwap(7),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeOut(8),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeIn(9),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeInOut(10),
    SimpleCut(11),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbCut(12),
    /* JADX INFO: Fake field, exist only in values array */
    RiserCut(13),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbRiserCut(14),
    /* JADX INFO: Fake field, exist only in values array */
    LowPassFilterFadeInOut(15),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapLowPassFilterOut(16),
    BassSwapLowPassFilterIn(17),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapLowPassFilterOut(18),
    /* JADX INFO: Fake field, exist only in values array */
    LowPassFilterFadeInOut(19),
    Dissolve(20),
    Surge(21),
    Afterglow(22),
    Unknown(-1);


    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ nzv f236443L0;

    /* JADX INFO: renamed from: a */
    public final int f236456a;

    static {
        f236443L0 = new nzv(v1r0VarArr);
    }

    public v1r0(int i) {
        super(str, i);
        this.f236456a = i;
    }

    public static v1r0 valueOf(String str) {
        return (v1r0) Enum.valueOf(v1r0.class, str);
    }

    public static v1r0[] values() {
        return (v1r0[]) f236446Z.clone();
    }
}
