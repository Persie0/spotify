package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum n70 implements od50 {
    ACTION_TYPE_UNSPECIFIED(0),
    ACTION_TYPE_PLAY(1),
    ACTION_TYPE_NAVIGATE(2),
    ACTION_TYPE_DOWNLOAD(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f150993a;

    n70(int i) {
        this.f150993a = i;
    }

    /* JADX INFO: renamed from: a */
    public static n70 m63788a(int i) {
        if (i == 0) {
            return ACTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_TYPE_PLAY;
        }
        if (i == 2) {
            return ACTION_TYPE_NAVIGATE;
        }
        if (i != 4) {
            return null;
        }
        return ACTION_TYPE_DOWNLOAD;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f150993a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
