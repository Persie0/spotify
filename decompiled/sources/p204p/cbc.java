package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum cbc implements od50 {
    OK(0),
    NOT_FOUND(1),
    FAILED_TO_PARSE_JSON(2),
    INVALID_STATE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f36084a;

    cbc(int i) {
        this.f36084a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36084a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
