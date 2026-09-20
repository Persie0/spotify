package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum dlw implements od50 {
    UNKNOWN(0),
    ITUNES(1),
    DOWNLOADS(2),
    MY_MUSIC(3),
    WINDOWS_MUSIC_LIBRARY(4),
    ANDROID_MEDIA_STORE(5),
    IOS_DOCUMENTS(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f50381a;

    dlw(int i) {
        this.f50381a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f50381a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
