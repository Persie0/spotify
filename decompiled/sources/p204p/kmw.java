package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum kmw implements od50 {
    RESOURCE_TYPE_VIDEO(0),
    RESOURCE_TYPE_AUDIO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f124222a;

    kmw(int i) {
        this.f124222a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f124222a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
