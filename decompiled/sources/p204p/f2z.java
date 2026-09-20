package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 p.f2z[], still in use, count: 1, list:
  (r0v17 p.f2z[]) from 0x00c4: CONSTRUCTOR (r0v17 p.f2z[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:197) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f2z {
    None(0),
    /* JADX INFO: Fake field, exist only in values array */
    Echo(1),
    /* JADX INFO: Fake field, exist only in values array */
    Reverb(2),
    /* JADX INFO: Fake field, exist only in values array */
    Riser(3),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbRiser(4),
    FilterIn(5),
    FilterOut(6),
    FilterInFilterOut(7),
    /* JADX INFO: Fake field, exist only in values array */
    EchoAtEnd(8),
    LowPassFilterIn(9),
    LowPassFilterOut(10),
    LowPassFilterInLowPassFilterOut(11),
    FilterInLowPassFilterOut(12),
    LowPassFilterInFilterOut(13),
    HighPassFilterHalfOut(14),
    NoiseOutEnd(15),
    Unknown(-1);


    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ nzv f65295M0;

    /* JADX INFO: renamed from: a */
    public final int f65308a;

    static {
        f65295M0 = new nzv(f2zVarArr);
    }

    public f2z(int i) {
        super(str, i);
        this.f65308a = i;
    }

    public static f2z valueOf(String str) {
        return (f2z) Enum.valueOf(f2z.class, str);
    }

    public static f2z[] values() {
        return (f2z[]) f65294L0.clone();
    }
}
