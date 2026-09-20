package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pk00[], still in use, count: 1, list:
  (r0v1 p.pk00[]) from 0x0090: CONSTRUCTOR (r0v1 p.pk00[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:145) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pk00 {
    None(0),
    ReverbOutCentre(1),
    ReverbCutEnd(2),
    ReverbOutEnd(3),
    EchoHalfCutEnd(4),
    EchoHalfOutEnd(5),
    Echo3QCutEnd(6),
    Echo3QOutEnd(7),
    DelayHalfCutEnd(8),
    Delay3QCutEnd(9),
    Echo1CutEnd(10),
    Echo1OutEnd(11),
    Unknown(-1);


    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ nzv f178345N0;

    /* JADX INFO: renamed from: a */
    public final int f178358a;

    static {
        f178345N0 = new nzv(pk00VarArr);
    }

    public pk00(int i) {
        super(str, i);
        this.f178358a = i;
    }

    public static pk00 valueOf(String str) {
        return (pk00) Enum.valueOf(pk00.class, str);
    }

    public static pk00[] values() {
        return (pk00[]) f178344M0.clone();
    }
}
