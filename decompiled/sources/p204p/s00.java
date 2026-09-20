package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum s00 implements od50 {
    URI(0),
    SUBMIT(1),
    DISMISS(2),
    NO_ACTION(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f204276a;

    s00(int i) {
        this.f204276a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f204276a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
