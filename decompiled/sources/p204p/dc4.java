package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum dc4 implements uzv {
    VIDEO_ONLY("video_only"),
    /* JADX INFO: Fake field, exist only in values array */
    SESSION_ONLY("session_only");


    /* JADX INFO: renamed from: a */
    public final String f47421a;

    dc4(String str) {
        this.f47421a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f47421a;
    }
}
