package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum yta implements od50 {
    UNKNOWN_BUTTON_TYPE(0),
    PRIMARY(1),
    TERTIARY(2),
    TEXT_LINK(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f276065a;

    yta(int i) {
        this.f276065a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f276065a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
