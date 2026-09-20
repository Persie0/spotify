package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum m051 implements od50 {
    SUCCESS(0),
    BAD_REQUEST(1),
    INTERNAL_ERROR(2),
    NOT_FOUND(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f138526a;

    m051(int i) {
        this.f138526a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f138526a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
