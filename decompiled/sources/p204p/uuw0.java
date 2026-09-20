package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 p.uuw0[], still in use, count: 1, list:
  (r0v17 p.uuw0[]) from 0x00e7: CONSTRUCTOR (r0v17 p.uuw0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:232) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uuw0 {
    ALBUM("album"),
    ARTIST("artist"),
    GENRE("genre"),
    PLAYLIST("playlist"),
    USER_PROFILE("user_profile"),
    TRACK("track"),
    AUDIO_SHOW("show"),
    AUDIO_EPISODE("audio_episode"),
    AUDIOBOOK("audiobook"),
    /* JADX INFO: Fake field, exist only in values array */
    SECTION("section"),
    AUTHOR("author"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCERT("concert"),
    KALLAX("kallax"),
    /* JADX INFO: Fake field, exist only in values array */
    VENUE("venue"),
    PODCAST_CHAPTER("podcast_chapter"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTENT_AGNOSTIC("content_agnostic"),
    QUERY("query");


    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ nzv f234280N0;

    /* JADX INFO: renamed from: a */
    public final String f234293a;

    static {
        f234280N0 = new nzv(uuw0VarArr);
    }

    public uuw0(String str) {
        super(str, i);
        this.f234293a = str;
    }

    public static uuw0 valueOf(String str) {
        return (uuw0) Enum.valueOf(uuw0.class, str);
    }

    public static uuw0[] values() {
        return (uuw0[]) f234279M0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f234293a;
    }
}
