package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum ec7 implements od50 {
    UNSPECIFIED(0),
    BOOK_PAGE_REDIRECT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f58248a;

    ec7(int i) {
        this.f58248a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f58248a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
