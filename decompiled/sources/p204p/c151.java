package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum c151 implements od50 {
    INVALID_STATUS_CODE(0),
    SUCCESS(1),
    EVENT_SENDER_ERROR(2),
    INVALID_STREAM_HANDLE(3),
    PENDING_EVENTS_ERROR(4),
    IGNORED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f32994a;

    c151(int i) {
        this.f32994a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f32994a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
