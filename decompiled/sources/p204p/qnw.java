package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum qnw implements od50 {
    NONE(0),
    MEDIA(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f190712a;

    qnw(int i) {
        this.f190712a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f190712a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
