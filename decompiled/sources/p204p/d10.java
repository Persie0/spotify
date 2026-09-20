package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum d10 implements od50 {
    ACTION_UNSPECIFIED(0),
    ACTION_QUEUED(1),
    ACTION_PROCESSING(2),
    ACTION_TIMEOUT(3),
    ACTION_SUCCESS(4),
    ACTION_ERROR(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f44120a;

    d10(int i) {
        this.f44120a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f44120a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
