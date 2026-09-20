package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum shd implements od50 {
    CHAT_MEDIA_UPLOAD_STATE_UNSPECIFIED(0),
    CHAT_MEDIA_UPLOAD_STATE_PROCESSING(1),
    CHAT_MEDIA_UPLOAD_STATE_COMPLETED(2),
    CHAT_MEDIA_UPLOAD_STATE_FAILED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f209178a;

    shd(int i) {
        this.f209178a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f209178a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
