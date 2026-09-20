package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum woe1 implements od50 {
    MESSAGE_STATUS_UNKNOWN(0),
    MESSAGE_STATUS_SUCCESS(1),
    MESSAGE_STATUS_QUEUED(2),
    MESSAGE_STATUS_PROCESSING(3),
    MESSAGE_STATUS_ERROR(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f253457a;

    woe1(int i) {
        this.f253457a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f253457a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
