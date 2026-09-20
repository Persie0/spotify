package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum fe51 implements od50 {
    STORY_TYPE_UNSPECIFIED(0),
    STORY_TYPE_EVERGREEN(1),
    STORY_TYPE_TIMELY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f68691a;

    fe51(int i) {
        this.f68691a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f68691a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
