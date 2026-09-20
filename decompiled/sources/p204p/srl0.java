package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 p.srl0[], still in use, count: 1, list:
  (r0v16 p.srl0[]) from 0x00de: CONSTRUCTOR (r0v16 p.srl0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:223) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
public final class srl0 {
    MUSIC_ARTIST_RECOMMENDATIONS("notify-music-and-artist-recommendations"),
    CONCERTS_EVENTS("notify-in-person-concerts-and-events"),
    OFFERS_AND_BUNDLES("notify-spotify-offers-and-bundles"),
    EXPERIENCES_MADE_FOR_YOU("notify-spotify-experiences-made-for-you"),
    PODCAST_SHOW_RECOMMENDATIONS("notify-podcast-and-show-recommendations"),
    PODCAST_COMMENTS_REPLIES("notify-comments-replies"),
    PODCAST_COMMENTS_REACTIONS("notify-comments-reactions"),
    LIVESTREAM_VIRTUAL_EVENTS("notify-livestream-and-virtual-events"),
    FEATURES_AND_TIPS("notify-spotify-features-and-tips"),
    SURVEYS("notify-surveys"),
    NEWS_AND_CULTURAL_MOMENTS("notify-news-and-cultural-moments"),
    ARTIST_CREATOR_MERCHANDISE("notify-artist-and-creator-merchandise"),
    AUDIOBOOKS("notify-audiobooks"),
    JAM("notify-jam"),
    MESSAGES("notify-messages"),
    PROMPTED_EXPERIENCES("notify-prompted-experiences");


    /* JADX INFO: renamed from: Q0 */
    public static final /* synthetic */ nzv f213342Q0;

    /* JADX INFO: renamed from: a */
    public final String f213355a;

    static {
        f213342Q0 = new nzv(srl0VarArr);
    }

    public srl0(String str) {
        super(str, i);
        this.f213355a = str;
    }

    public static srl0 valueOf(String str) {
        return (srl0) Enum.valueOf(srl0.class, str);
    }

    public static srl0[] values() {
        return (srl0[]) f213341P0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m79117a() {
        return this.f213355a;
    }
}
