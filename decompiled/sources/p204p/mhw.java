package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum mhw implements od50 {
    INVALID_CREDENTIALS(0),
    HTTP_ERROR(1),
    OFFLINE(2),
    BAD_REQUEST(3),
    UNSUPPORTED_LOGIN_PROTOCOL(4),
    TOO_MANY_ATTEMPTS(5),
    NOT_ALLOWED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f143881a;

    mhw(int i) {
        this.f143881a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f143881a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
