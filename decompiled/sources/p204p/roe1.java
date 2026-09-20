package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum roe1 implements od50 {
    UNSPECIFIED(0),
    RESERVED(1),
    FCFS(2),
    WAITLISTED(3),
    PURCHASED(4),
    INELIGIBLE(5),
    SOLD_OUT(6),
    CANCELLED(7),
    SALE_ENDED(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f201248a;

    roe1(int i) {
        this.f201248a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f201248a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
