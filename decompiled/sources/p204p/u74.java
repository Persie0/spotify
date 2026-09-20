package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum u74 implements uzv {
    DISABLED(x09.f256833e),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_PODCAST("video_podcast"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_VIDEOS("music_videos"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL("all");


    /* JADX INFO: renamed from: a */
    public final String f227496a;

    u74(String str) {
        this.f227496a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f227496a;
    }
}
