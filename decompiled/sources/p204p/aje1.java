package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum aje1 implements od50 {
    YOTI_VERIFICATION_TYPE_UNKNOWN(0),
    YOTI_VERIFICATION_TYPE_ID_AND_SELFIE(1),
    YOTI_VERIFICATION_TYPE_ID_ONLY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f16261a;

    aje1(int i) {
        this.f16261a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16261a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
