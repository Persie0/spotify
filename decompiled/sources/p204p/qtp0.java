package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum qtp0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_UNSPECIFIED(0),
    ACTION_ADD_TRACK(1),
    ACTION_REMOVE_TRACK(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f192436a;

    qtp0(int i) {
        this.f192436a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f192436a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
