package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum w2m implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_BY(1),
    ONLY_CURATED(2),
    ONLY_NOT_CURATED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f247385a;

    w2m(int i) {
        this.f247385a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f247385a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
