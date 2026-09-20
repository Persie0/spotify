package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum b8q0 implements od50 {
    DRAFT(0),
    SCHEDULED(1),
    LIVE(2),
    CLOSED(3),
    BLOCKED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f24647a;

    b8q0(int i) {
        this.f24647a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24647a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
