package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum cp01 implements od50 {
    COPY_LINK(0),
    WHATSAPP(2),
    SMS(3),
    INSTAGRAM_STORIES(4),
    INSTAGRAM_DM(5),
    SNAPCHAT(6),
    TWITTER(8),
    FACEBOOK_STORIES(9),
    FACEBOOK_MESSENGER(10),
    LINE(12),
    MORE(13),
    DOWNLOAD(14),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f40399a;

    cp01(int i) {
        this.f40399a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40399a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
