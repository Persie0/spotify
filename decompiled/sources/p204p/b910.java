package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum b910 implements od50 {
    EDUCATION_UNSPECIFIED(0),
    EDUCATION_AGGRESSIVE(1),
    EDUCATION_MEDIUM(2),
    EDUCATION_PASSIVE(3),
    EDUCATION_NONE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f24745a;

    b910(int i) {
        this.f24745a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24745a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
