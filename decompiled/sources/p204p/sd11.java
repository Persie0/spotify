package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.sd11[], still in use, count: 1, list:
  (r0v1 p.sd11[]) from 0x0049: CONSTRUCTOR (r0v1 p.sd11[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:74) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sd11 {
    /* JADX INFO: Fake field, exist only in values array */
    EF10(R.string.shares_filter_songs, "track"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(R.string.shares_filter_podcasts, "episode"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(R.string.shares_filter_albums, "album"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49(R.string.shares_filter_artists, "artist"),
    /* JADX INFO: Fake field, exist only in values array */
    EF62(R.string.shares_filter_playlists, "playlist_v2");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f207855d;

    /* JADX INFO: renamed from: a */
    public final int f207856a;

    /* JADX INFO: renamed from: b */
    public final String f207857b;

    static {
        f207855d = new nzv(sd11VarArr);
    }

    public sd11(int i, String str) {
        super(str, i);
        this.f207856a = i;
        this.f207857b = str;
    }

    public static sd11 valueOf(String str) {
        return (sd11) Enum.valueOf(sd11.class, str);
    }

    public static sd11[] values() {
        return (sd11[]) f207854c.clone();
    }
}
