package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum zdw implements od50 {
    ERROR_CODE_UNSPECIFIED(0),
    INVALID_REQUEST(1),
    NOTE_NOT_FOUND(2),
    POLICY_VIOLATION(3),
    UNAUTHORIZED(4),
    CONTENT_TOO_LONG(5),
    MAX_NOTES_REACHED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f281828a;

    zdw(int i) {
        this.f281828a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f281828a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
