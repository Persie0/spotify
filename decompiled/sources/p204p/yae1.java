package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum yae1 implements od50 {
    WORLD_STATE_UNDEFINED(0),
    WORLD_STATE_EMPTY(1),
    WORLD_STATE_IN_PROGRESS(2),
    WORLD_STATE_POPULATED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f270883a;

    yae1(int i) {
        this.f270883a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f270883a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
