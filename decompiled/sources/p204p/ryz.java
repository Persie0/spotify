package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ryz[], still in use, count: 1, list:
  (r0v1 p.ryz[]) from 0x0024: CONSTRUCTOR (r0v1 p.ryz[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:37) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
public final class ryz {
    PROFILES(k0s0.f118140a, R.string.profile_list_following_tab_profiles),
    /* JADX INFO: Fake field, exist only in values array */
    ARTISTS(e0s0.f55029a, R.string.profile_list_following_tab_artists);


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f203993e;

    /* JADX INFO: renamed from: a */
    public final o0s0 f203994a;

    /* JADX INFO: renamed from: b */
    public final int f203995b;

    static {
        f203993e = new nzv(ryzVarArr);
    }

    public ryz(o0s0 o0s0Var, int i) {
        super(str, i);
        this.f203994a = o0s0Var;
        this.f203995b = i;
    }

    public static ryz valueOf(String str) {
        return (ryz) Enum.valueOf(ryz.class, str);
    }

    public static ryz[] values() {
        return (ryz[]) f203992d.clone();
    }
}
