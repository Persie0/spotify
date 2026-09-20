package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum xon0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_VIDEO_ACCESS_PERMISSION_RESULT_ALLOWED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_VIDEO_ACCESS_PERMISSION_RESULT_DISALLOWED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f264341a;

    xon0(int i) {
        this.f264341a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f264341a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
