package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum uow implements od50 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    NEUTRAL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f232533a;

    uow(int i) {
        this.f232533a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f232533a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
