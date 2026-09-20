package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum lnp0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0),
    SET_AS_AVAILABLE_OFFLINE(1),
    REMOVE_AS_AVAILABLE_OFFLINE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f135209a;

    lnp0(int i) {
        this.f135209a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f135209a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
