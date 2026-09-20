package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum v8k implements eac1 {
    NOW_PLAYING_BAR("now-playing-bar", false),
    NOW_PLAYING_VIEW_MINI("now-playing-sidebar", false),
    NOW_PLAYING_VIEW_HORIZONTAL_LANDSCAPE("fullscreen", true),
    NOW_PLAYING_VIEW_HORIZONTAL_PORTRAIT("now-playing-view", true),
    NOW_PLAYING_VIEW_VERTICAL_PORTRAIT("now-playing-view-vertical-portrait", true),
    PICTURE_IN_PICTURE("picture-in-picture", false),
    STICKY_HEADER("sticky-header", false),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_TRIMMER("media-trimmer", false);


    /* JADX INFO: renamed from: a */
    public final String f238595a;

    /* JADX INFO: renamed from: b */
    public final boolean f238596b;

    v8k(String str, boolean z) {
        this.f238595a = str;
        this.f238596b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m84922a() {
        return this.f238595a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84923b() {
        return this.f238596b;
    }
}
