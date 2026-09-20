package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum y051 implements od50 {
    UNSPECIFIED(0),
    QUEUED(1),
    PROCESSING(2),
    SUCCESS(3),
    TIMEOUT(4),
    ERROR(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f267912a;

    y051(int i) {
        this.f267912a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f267912a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
