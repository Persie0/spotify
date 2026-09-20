package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum hmw implements od50 {
    NOT_DOWNLOADED(0),
    ERROR(1),
    DOWNLOADED_EXPIRED(2),
    DOWNLOADED(3),
    WAITING_FOR_REDOWNLOAD(4),
    DOWNLOADING(5),
    WAITING(6),
    WAITING_LIMIT_EXCEEDED(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f93090a;

    hmw(int i) {
        this.f93090a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f93090a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
