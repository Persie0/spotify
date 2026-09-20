package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum fbe1 implements od50 {
    BLACK_TEXT_ON_WHITE_BACKGROUND(0),
    WHITE_TEXT_ON_BLACK_BACKGROUND(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f67812a;

    fbe1(int i) {
        this.f67812a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f67812a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
