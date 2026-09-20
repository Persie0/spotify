package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v18 p.prg0[], still in use, count: 1, list:
  (r0v18 p.prg0[]) from 0x00dc: CONSTRUCTOR (r0v18 p.prg0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:221) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class prg0 {
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST_AND_CREATOR_MERCHANDISE("artist_and_creator_merchandise"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST_UPDATES("artist_updates"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIOBOOKS("audiobooks"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCERT_NOTIFICATIONS("concert_notifications"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_PERSON_CONCERTS_AND_EVENTS("in_person_concerts_and_events"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVESTREAM_AND_VIRTUAL_EVENTS("livestream_and_virtual_events"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_AND_ARTIST_RECOMMENDATIONS("music_and_artist_recommendations"),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_MUSIC("new_music"),
    /* JADX INFO: Fake field, exist only in values array */
    NEWS_AND_CULTURAL_MOMENTS("news_and_cultural_moments"),
    /* JADX INFO: Fake field, exist only in values array */
    NEWS_AND_OFFERS("news_and_offers"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST_UPDATES("playlist_updates"),
    /* JADX INFO: Fake field, exist only in values array */
    PODCAST_AND_SHOW_RECOMMENDATIONS("podcast_and_show_recommendations"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_NEWS("product_news"),
    /* JADX INFO: Fake field, exist only in values array */
    RECOMMENDED_MUSIC("recommended_music"),
    /* JADX INFO: Fake field, exist only in values array */
    SPOTIFY_EXPERIENCES_MADE_FOR_YOU("spotify_experiences_made_for_you"),
    /* JADX INFO: Fake field, exist only in values array */
    SPOTIFY_FEATURES_AND_TIPS("spotify_features_and_tips"),
    /* JADX INFO: Fake field, exist only in values array */
    SPOTIFY_OFFERS_AND_BUNDLES("spotify_offers_and_bundles"),
    /* JADX INFO: Fake field, exist only in values array */
    SURVEYS("surveys");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f180598c;

    /* JADX INFO: renamed from: a */
    public final String f180599a;

    static {
        f180598c = new nzv(prg0VarArr);
    }

    public prg0(String str) {
        super(str, i);
        this.f180599a = str;
    }

    public static prg0 valueOf(String str) {
        return (prg0) Enum.valueOf(prg0.class, str);
    }

    public static prg0[] values() {
        return (prg0[]) f180597b.clone();
    }
}
