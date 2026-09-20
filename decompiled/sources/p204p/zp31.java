package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.zp31[], still in use, count: 1, list:
  (r0v1 p.zp31[]) from 0x0050: CONSTRUCTOR (r0v1 p.zp31[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zp31 {
    /* JADX INFO: Fake field, exist only in values array */
    ULT_WEAR("ULT WEAR"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_1000XM5("WH-1000XM5"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_1000XM6("WH-1000XM6"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_ULT900N("WH-ULT900N"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2954("YY2954"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2981("YY2981"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2984("YY2984"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2985("YY2985");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f284924c;

    /* JADX INFO: renamed from: a */
    public final String f284925a;

    static {
        f284924c = new nzv(zp31VarArr);
    }

    public zp31(String str) {
        super(str, i);
        this.f284925a = str;
    }

    public static zp31 valueOf(String str) {
        return (zp31) Enum.valueOf(zp31.class, str);
    }

    public static zp31[] values() {
        return (zp31[]) f284923b.clone();
    }
}
