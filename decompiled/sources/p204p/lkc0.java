package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum lkc0 implements od50 {
    MAPS_PROVIDER_UNSPECIFIED(0),
    MAPS_PROVIDER_GOOGLE(1),
    MAPS_PROVIDER_APPLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f134320a;

    lkc0(int i) {
        this.f134320a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f134320a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
