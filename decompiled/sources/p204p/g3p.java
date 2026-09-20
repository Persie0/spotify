package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.g3p[], still in use, count: 1, list:
  (r0v1 p.g3p[]) from 0x0063: CONSTRUCTOR (r0v1 p.g3p[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
public final class g3p {
    LOCKED(R.id.locked_badge),
    PIN(R.id.pin_badge),
    MIX(R.id.mix_badge),
    PRE_RELEASE(R.id.pre_release_badge),
    NEW_RELEASE(R.id.new_release_badge),
    GENERATING(R.id.generating_badge),
    DOWNLOAD(R.id.download_badge);


    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ nzv f76261t;

    /* JADX INFO: renamed from: a */
    public final int f76262a;

    static {
        f76261t = new nzv(g3pVarArr);
    }

    public g3p(int i) {
        super(str, i);
        this.f76262a = i;
    }

    public static g3p valueOf(String str) {
        return (g3p) Enum.valueOf(g3p.class, str);
    }

    public static g3p[] values() {
        return (g3p[]) f76260i.clone();
    }
}
