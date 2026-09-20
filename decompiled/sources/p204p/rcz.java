package p204p;

import com.comscore.streaming.ContentMediaFormat;

/* JADX INFO: loaded from: classes10.dex */
public enum rcz {
    Track(40),
    Kallax(554),
    Episode(777),
    Artist(951),
    Album(907),
    PreRelease(907),
    Playlist(955),
    PodcastOrAudiobook(899),
    Genre(1023),
    User(ContentMediaFormat.PARTIAL_CONTENT_PODCAST),
    Venue(1023),
    PodcastChapter(779),
    Author(959);


    /* JADX INFO: renamed from: a */
    public final boolean f197967a;

    /* JADX INFO: renamed from: b */
    public final boolean f197968b;

    /* JADX INFO: renamed from: c */
    public final boolean f197969c;

    /* JADX INFO: renamed from: d */
    public final boolean f197970d;

    /* JADX INFO: renamed from: e */
    public final boolean f197971e;

    /* JADX INFO: renamed from: f */
    public final boolean f197972f;

    /* JADX INFO: renamed from: g */
    public final boolean f197973g;

    /* JADX INFO: renamed from: h */
    public final boolean f197974h;

    /* JADX INFO: renamed from: i */
    public final boolean f197975i;

    rcz(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 16) == 0;
        boolean z5 = (i & 32) == 0;
        boolean z6 = (i & 64) == 0;
        boolean z7 = (i & 128) == 0;
        boolean z8 = (i & 256) == 0;
        boolean z9 = (i & 512) == 0;
        this.f197967a = z;
        this.f197968b = z2;
        this.f197969c = z3;
        this.f197970d = z4;
        this.f197971e = z5;
        this.f197972f = z6;
        this.f197973g = z7;
        this.f197974h = z8;
        this.f197975i = z9;
    }
}
