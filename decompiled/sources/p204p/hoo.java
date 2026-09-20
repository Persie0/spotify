package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum hoo implements od50 {
    DAY_OF_WEEK_UNSPECIFIED(0),
    DAY_OF_WEEK_SUNDAY(1),
    DAY_OF_WEEK_MONDAY(2),
    DAY_OF_WEEK_TUESDAY(3),
    DAY_OF_WEEK_WEDNESDAY(4),
    DAY_OF_WEEK_THURSDAY(5),
    DAY_OF_WEEK_FRIDAY(6),
    DAY_OF_WEEK_SATURDAY(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f93583a;

    hoo(int i) {
        this.f93583a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f93583a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
