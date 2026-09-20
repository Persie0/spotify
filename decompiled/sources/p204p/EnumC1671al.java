package p204p;

/* JADX INFO: renamed from: p.al */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC1671al implements od50 {
    GENDER_UNKNOWN(0),
    GENDER_MALE(1),
    GENDER_FEMALE(2),
    GENDER_NON_BINARY(3),
    GENDER_OTHER(4),
    GENDER_PREFER_NOT_TO_SAY(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f16696a;

    EnumC1671al(int i) {
        this.f16696a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16696a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
