package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum i3c implements od50 {
    UNKNOWN(0),
    BACKGROUND(1),
    STICKER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f98122a;

    i3c(int i) {
        this.f98122a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f98122a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
