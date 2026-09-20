package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum jc4 implements uzv {
    STICKY_VIDEO_ONLY("sticky_video_only"),
    STICKY_VIDEO_MINIMIZABLE_T3("sticky_video_minimizable_t3"),
    /* JADX INFO: Fake field, exist only in values array */
    SCROLLABLE_VIDEO_ONLY("scrollable_video_only"),
    SCROLLABLE_VIDEO_EXPANDABLE_T2("scrollable_video_expandable_t2");


    /* JADX INFO: renamed from: a */
    public final String f110985a;

    jc4(String str) {
        this.f110985a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f110985a;
    }
}
