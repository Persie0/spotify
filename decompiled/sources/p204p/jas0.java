package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum jas0 implements od50 {
    PROMINENCE_UNSPECIFIED(0),
    PROMINENCE_DEFAULT(1),
    PROMINENCE_HIGHLIGHTED(2),
    PROMINENCE_SUBDUED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f110547a;

    jas0(int i) {
        this.f110547a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f110547a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
