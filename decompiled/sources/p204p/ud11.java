package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ud11[], still in use, count: 1, list:
  (r0v1 p.ud11[]) from 0x002a: CONSTRUCTOR (r0v1 p.ud11[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:43) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class ud11 {
    RECENTS(R.string.shares_sort_button_recents, R.string.shares_sort_recents, gvd.f84720a),
    /* JADX INFO: Fake field, exist only in values array */
    OLDEST(R.string.shares_sort_button_oldest, R.string.shares_sort_oldest, gvd.f84721b);


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f229156f;

    /* JADX INFO: renamed from: a */
    public final int f229157a;

    /* JADX INFO: renamed from: b */
    public final int f229158b;

    /* JADX INFO: renamed from: c */
    public final gvd f229159c;

    static {
        f229156f = new nzv(ud11VarArr);
    }

    public ud11(int i, int i2, gvd gvdVar) {
        super(str, i);
        this.f229157a = i;
        this.f229158b = i2;
        this.f229159c = gvdVar;
    }

    public static ud11 valueOf(String str) {
        return (ud11) Enum.valueOf(ud11.class, str);
    }

    public static ud11[] values() {
        return (ud11[]) f229155e.clone();
    }
}
