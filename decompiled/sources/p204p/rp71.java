package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum rp71 implements od50 {
    BEHAVIOR_UNSPECIFIED(0),
    EXTERNAL_PURCHASE(1),
    CURATE(2),
    CANT_ATTEND(3),
    NOT_INTERESTED(4),
    SEE_ALL_SHOWS(5),
    NAVIGATE(6),
    SHARE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f201459a;

    rp71(int i) {
        this.f201459a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f201459a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
