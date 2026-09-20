package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum uae1 implements od50 {
    UNDEFINED(0),
    VALIDATION_ERROR(1),
    GENERATION_ERROR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f228490a;

    uae1(int i) {
        this.f228490a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f228490a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
