package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum ujw implements od50 {
    UNKNOWN(0),
    LOW(1),
    NORMAL(2),
    HIGH(3),
    VERY_HIGH(4),
    HIFI(5),
    HIFI24(6),
    PETREL(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f231167a;

    ujw(int i) {
        this.f231167a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ujw m83295a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LOW;
            case 2:
                return NORMAL;
            case 3:
                return HIGH;
            case 4:
                return VERY_HIGH;
            case 5:
                return HIFI;
            case 6:
                return HIFI24;
            case 7:
                return PETREL;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f231167a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
