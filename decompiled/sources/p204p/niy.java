package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum niy implements od50 {
    FEED_ENTITY_SOURCE_UNSPECIFIED(0),
    FEED_ENTITY_SOURCE_DM(1),
    FEED_ENTITY_SOURCE_GROUP(2),
    FEED_ENTITY_SOURCE_FOLLOWING(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f154381a;

    niy(int i) {
        this.f154381a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f154381a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
