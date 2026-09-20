package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum ob10 implements od50 {
    SUCCESS(0),
    NOT_FOUND(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f163513a;

    ob10(int i) {
        this.f163513a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f163513a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
