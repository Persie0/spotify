package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum izb1 implements od50 {
    VIDEO_MEDIA_FORMAT_UNSPECIFIED(0),
    VIDEO_MEDIA_FORMAT_ADAPTIVE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f107193a;

    izb1(int i) {
        this.f107193a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f107193a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
