package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum dt60 implements od50 {
    MASK_READY(0),
    ERROR(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f52741a;

    dt60(int i) {
        this.f52741a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52741a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
