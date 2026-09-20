package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum f410 implements od50 {
    UNKNOWN(0),
    DEFAULT(1),
    CONTENT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f65636a;

    f410(int i) {
        this.f65636a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f65636a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
