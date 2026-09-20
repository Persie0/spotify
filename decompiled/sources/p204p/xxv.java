package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 p.xxv, still in use, count: 1, list:
  (r1v0 p.xxv) from 0x03a2: INVOKE ("social-feed"), (r1v0 p.xxv) STATIC call: p.pft0.u(java.lang.Object, java.lang.Object):p.pqm0 A[MD:(java.lang.Object, java.lang.Object):p.pqm0 (m), WRAPPED] (LINE:931)
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
public final class xxv {
    /* JADX INFO: Fake field, exist only in values array */
    EF1(R.string.activity_feed_nav_title, "ACTIVITY"),
    f267096e(0, "ADVERTISEMENT"),
    f267098f(0, "ALBUM"),
    f267100g(0, "ALBUM_RADIO"),
    f267102h(0, "ARTIST"),
    f267104i(0, "AUDIOBOOK"),
    f267113t(0, "ARTIST_RADIO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(0, "BROWSE"),
    f267084X(0, "CHARTS"),
    f267086Y(0, "DAILY_MIX"),
    f267088Z(0, "ENDLESS_FEED"),
    f267072L0(R.string.follow_feed_feature_title, "FOLLOW_FEED"),
    f267073M0(0, "GENRE_RADIO"),
    f267074N0(0, "HOME"),
    f267075O0(0, "LIVE_ROOM_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.string.local_files_title, "LOCAL_FILES"),
    f267076P0(0, "MUSIC_AUTOPLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(0, "NEW_MUSIC_TUESDAY"),
    f267077Q0(0, "PLAY_QUEUE"),
    f267078R0(0, "PLAYLIST"),
    f267079S0(0, "PLAYLIST_FOLDER"),
    f267080T0(0, "PLAYLIST_RADIO"),
    f267081U0(0, "PODCAST_AUTOPLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(0, "PROFILE"),
    f267082V0(0, "RADIO"),
    f267083W0(0, "SEARCH"),
    f267085X0(0, "SHOW"),
    f267087Y0(0, "SHOW_VIDEO"),
    f267089Z0(0, "SUGGESTED_TRACK"),
    f267090a1(0, "TRACK"),
    f267091b1(0, "TRACK_RADIO"),
    f267093c1(R.string.collection_your_episodes_title, "YOUR_EPISODES"),
    f267095d1(R.string.collection_liked_songs_title, "YOUR_LIBRARY"),
    f267097e1(0, "YOUR_LIBRARY_ALBUM"),
    f267099f1(0, "YOUR_LIBRARY_ARTIST"),
    f267101g1(R.string.collection_podcasts_tab_downloads, "YOUR_LIBRARY_PODCAST_DOWNLOADS"),
    f267103h1(R.string.collection_podcasts_tab_episodes, "YOUR_LIBRARY_PODCAST_EPISODES"),
    f267105i1(R.string.collection_podcasts_tab_shows, "YOUR_LIBRARY_PODCAST_FOLLOWING"),
    f267106j1(R.string.collection_liked_songs_title, "YOUR_LIBRARY_TRACKS"),
    f267107k1(R.string.collection_start_songs_title, "YOUR_MUSIC"),
    f267108l1(0, "YOUR_MUSIC_ALBUM"),
    f267109m1(0, "YOUR_MUSIC_ARTIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.string.collection_episodes_offlined_title, "YOUR_MUSIC_OFFLINED_EPISODES"),
    f267110n1(R.string.collection_start_songs_title, "YOUR_MUSIC_TRACKS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.string.collection_episodes_unheard_title, "YOUR_MUSIC_UNPLAYED_EPISODES"),
    f267111o1(0, "UNKNOWN");


    /* JADX INFO: renamed from: c */
    public static final hcj0 f267092c;

    /* JADX INFO: renamed from: d */
    public static final Object f267094d;

    /* JADX INFO: renamed from: a */
    public final j1x0 f267114a;

    /* JADX INFO: renamed from: b */
    public final j1x0 f267115b;

    static {
        xxv xxvVar = f267098f;
        xxv xxvVar2 = f267102h;
        xxv xxvVar3 = f267084X;
        xxv xxvVar4 = f267088Z;
        xxv xxvVar5 = f267072L0;
        xxv xxvVar6 = f267074N0;
        xxv xxvVar7 = f267077Q0;
        xxv xxvVar8 = f267078R0;
        xxv xxvVar9 = f267079S0;
        xxv xxvVar10 = EF2;
        xxv xxvVar11 = f267083W0;
        xxv xxvVar12 = f267107k1;
        xxv xxvVar13 = f267108l1;
        xxv xxvVar14 = f267109m1;
        f267092c = new hcj0(25);
        f267094d = kkc0.m56695h0(pft0.m69840u("album", xxvVar), pft0.m69840u("com.spotify.feature.album", xxvVar), pft0.m69840u("artist", xxvVar2), pft0.m69840u("com.spotify.feature.artist", xxvVar2), pft0.m69840u("chart", xxvVar3), pft0.m69840u("discover-weekly", xxvVar8), pft0.m69840u("library-collection", xxvVar12), pft0.m69840u("library-collection-album", xxvVar13), pft0.m69840u("library-collection-artist", xxvVar14), pft0.m69840u("library-collection-missing-album", xxvVar), pft0.m69840u("localfiles", xxvVar), pft0.m69840u("playlist", xxvVar8), pft0.m69840u("enhanced-session", xxvVar8), pft0.m69840u("playlistfolder", xxvVar9), pft0.m69840u("playlists", xxvVar9), pft0.m69840u("playqueue", xxvVar7), pft0.m69840u("profile", xxvVar10), pft0.m69840u("search", xxvVar11), pft0.m69840u("com.spotify.feature.search", xxvVar11), pft0.m69840u("com.spotify.feature.profile", xxvVar10), pft0.m69840u("social-feed", xxvVar), pft0.m69840u("com.spotify.feature.browse", xxvVar), pft0.m69840u("com.spotify.feature.newmusictuesday", xxvVar), pft0.m69840u("com.spotify.feature.chart", xxvVar3), pft0.m69840u("com.spotify.feature.home", xxvVar6), pft0.m69840u("home", xxvVar6), pft0.m69840u("show-format", xxvVar8), pft0.m69840u("follow-feed", xxvVar5), pft0.m69840u("endless-feed", xxvVar4));
    }

    public xxv(int i, String str) {
        super(str, i);
        this.f267114a = new j1x0(i);
        this.f267115b = new j1x0(i);
    }

    public static xxv valueOf(String str) {
        return (xxv) Enum.valueOf(xxv.class, str);
    }

    public static xxv[] values() {
        return (xxv[]) f267112p1.clone();
    }
}
