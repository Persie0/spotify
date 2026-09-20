package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum u0l0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(0),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(1),
    /* JADX INFO: Fake field, exist only in values array */
    DRM(2),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE(3),
    VIDEO(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f225530a;

    u0l0(int i) {
        this.f225530a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f225530a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
