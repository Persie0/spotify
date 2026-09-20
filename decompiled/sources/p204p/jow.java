package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum jow implements od50 {
    BEGINNING(0),
    END(1),
    CURRENT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f114520a;

    jow(int i) {
        this.f114520a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f114520a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
