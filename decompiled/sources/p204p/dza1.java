package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum dza1 implements od50 {
    BIO_VIOLATION_UNSPECIFIED(0),
    BIO_VIOLATION_TOO_LONG(1),
    BIO_VIOLATION_CONTAINS_EMAIL(2),
    BIO_VIOLATION_CONTAINS_PHONE(3),
    BIO_VIOLATION_MODERATION_BLOCKED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f54607a;

    dza1(int i) {
        this.f54607a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f54607a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
