package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 p.mzc1[], still in use, count: 1, list:
  (r0v3 p.mzc1[]) from 0x00a8: CONSTRUCTOR (r0v3 p.mzc1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:169) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mzc1 {
    None(0),
    Cut(1),
    Crossfade(2),
    /* JADX INFO: Fake field, exist only in values array */
    SlowInFastOut(3),
    /* JADX INFO: Fake field, exist only in values array */
    FastInSlowOut(4),
    SlowInSlowOut(5),
    CrossShape(6),
    FullOverlap(7),
    /* JADX INFO: Fake field, exist only in values array */
    Switcheroo(8),
    SlowInFastOutAtEnd(9),
    FastInAtStartSlowOut(10),
    SlowInSemiFastOutAtEnd(11),
    FadeInOneBarCutOut(12),
    OverlapOneBarCutOut(13),
    Unknown(-1);


    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ nzv f148676M0;

    /* JADX INFO: renamed from: a */
    public final int f148689a;

    static {
        f148676M0 = new nzv(mzc1VarArr);
    }

    public mzc1(int i) {
        super(str, i);
        this.f148689a = i;
    }

    public static mzc1 valueOf(String str) {
        return (mzc1) Enum.valueOf(mzc1.class, str);
    }

    public static mzc1[] values() {
        return (mzc1[]) f148675L0.clone();
    }
}
