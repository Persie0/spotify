package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum q96 implements od50 {
    DEFAULT(0),
    ARTIST(1),
    SHOW(2),
    USER(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f186507a;

    q96(int i) {
        this.f186507a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f186507a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
