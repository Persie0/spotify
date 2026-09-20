package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum i140 implements od50 {
    UNSPECIFIED(0),
    INVALID_FORMAT(1),
    ALREADY_TAKEN(2),
    UPDATE_LIMITED(3),
    CONTAINS_BLOCKED_WORD(4),
    INVALID_LENGTH(5),
    INVALID_BOUNDARY_CHARACTER(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f97386a;

    i140(int i) {
        this.f97386a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f97386a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
