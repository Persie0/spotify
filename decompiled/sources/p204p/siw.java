package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum siw implements od50 {
    unknown(0),
    smsCode(1),
    emailCode(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f209679a;

    siw(int i) {
        this.f209679a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f209679a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
