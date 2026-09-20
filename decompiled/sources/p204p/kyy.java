package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.kyy[], still in use, count: 1, list:
  (r0v1 p.kyy[]) from 0x0069: CONSTRUCTOR (r0v1 p.kyy[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:106) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class kyy {
    TOP(null, null),
    SHOWS(null, null),
    TRACKS(null, null),
    ALBUMS(null, null),
    ARTISTS(null, null),
    EPISODES(null, null),
    PLAYLISTS(null, null),
    AUDIOBOOKS(null, null),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST_BY_YOU("owned_by_you", PLAYLISTS);


    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ nzv f127937Y;

    /* JADX INFO: renamed from: a */
    public final String f127946a;

    /* JADX INFO: renamed from: b */
    public final kyy f127947b;

    static {
        f127937Y = new nzv(kyyVarArr);
    }

    public kyy(String str, kyy kyyVar) {
        super(str, i);
        this.f127946a = str;
        this.f127947b = kyyVar;
    }

    public static kyy valueOf(String str) {
        return (kyy) Enum.valueOf(kyy.class, str);
    }

    public static kyy[] values() {
        return (kyy[]) f127936X.clone();
    }
}
