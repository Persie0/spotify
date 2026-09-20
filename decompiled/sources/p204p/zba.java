package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.zba[], still in use, count: 1, list:
  (r0v1 p.zba[]) from 0x003e: CONSTRUCTOR (r0v1 p.zba[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:63) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class zba {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Music", squ.f213162c),
    f281286c("Chapters", guu.f84544c),
    /* JADX INFO: Fake field, exist only in values array */
    EF38("Theme", xvu.f266512c),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("Annotations", xou.f264362c);


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f281288e;

    /* JADX INFO: renamed from: a */
    public final wwu f281289a;

    /* JADX INFO: renamed from: b */
    public final int f281290b;

    static {
        f281288e = new nzv(zbaVarArr);
    }

    public zba(String str, wwu wwuVar) {
        super(str, i);
        this.f281289a = wwuVar;
        this.f281290b = i;
    }

    public static zba valueOf(String str) {
        return (zba) Enum.valueOf(zba.class, str);
    }

    public static zba[] values() {
        return (zba[]) f281287d.clone();
    }
}
