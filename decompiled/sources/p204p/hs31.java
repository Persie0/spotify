package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum hs31 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0),
    CONSUMPTION_ORDER_ASC(1),
    PUBLISH_DATE_ASC(2),
    PUBLISH_DATE_DESC(3),
    POPULARITY_DESC(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f94602a;

    hs31(int i) {
        this.f94602a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f94602a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
