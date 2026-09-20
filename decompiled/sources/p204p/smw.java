package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum smw implements od50 {
    OTHER(0),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(1),
    /* JADX INFO: Fake field, exist only in values array */
    DRM(2),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE(3),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f210737a;

    smw(int i) {
        this.f210737a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f210737a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
