package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.gxx[], still in use, count: 1, list:
  (r0v1 p.gxx[]) from 0x006e: CONSTRUCTOR (r0v1 p.gxx[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:111) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gxx {
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_PLAYED("com.spotify.recently-played"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSE("com.spotify.browse"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_LIBRARY("com.spotify.your-library"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_ALBUMS("com.spotify.your-albums"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_ARTISTS("com.spotify.your-artists"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_PLAYLISTS("com.spotify.your-playlists"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_PODCASTS("com.spotify.your-podcasts"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_AUDIOBOOKS("com.spotify.your-audiobooks"),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOADED("com.spotify.downloaded"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE("com.spotify.offline");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f85352c;

    /* JADX INFO: renamed from: a */
    public final String f85353a;

    static {
        f85352c = new nzv(gxxVarArr);
    }

    public gxx(String str) {
        super(str, i);
        this.f85353a = str;
    }

    public static gxx valueOf(String str) {
        return (gxx) Enum.valueOf(gxx.class, str);
    }

    public static gxx[] values() {
        return (gxx[]) f85351b.clone();
    }
}
