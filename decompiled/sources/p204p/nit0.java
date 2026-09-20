package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum nit0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYED_STATE_NONE(0),
    PLAYED_STATE_UNPLAYED(1),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYED_STATE_IN_PROGRESS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f154349a;

    nit0(int i) {
        this.f154349a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f154349a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
