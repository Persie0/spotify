package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum fwl0 implements od50 {
    APP_LAUNCH(0),
    MANUAL_LOGOUT(1),
    FORCED_LOGOUT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f74101a;

    fwl0(int i) {
        this.f74101a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74101a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
