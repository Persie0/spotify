package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum qoe1 implements od50 {
    NOT_STARTED(0),
    IN_PROGRESS(1),
    FINISHED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f190934a;

    qoe1(int i) {
        this.f190934a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f190934a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
