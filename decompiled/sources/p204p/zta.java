package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum zta implements od50 {
    PRIMARY(0),
    SECONDARY(1),
    TERTIARY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f286119a;

    zta(int i) {
        this.f286119a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f286119a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
