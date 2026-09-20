package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ki30 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    HUB_VIEW_UNSPECIFIED(0),
    HUB_VIEW_BANNED(1),
    HUB_VIEW_ALLOWED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f122784a;

    ki30(int i) {
        this.f122784a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f122784a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
