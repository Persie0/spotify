package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum yxz implements od50 {
    NONE(0),
    CAN_BE_FOLLOWED(1),
    CAN_BE_UNFOLLOWED(2);


    /* JADX INFO: renamed from: a */
    public final int f277366a;

    yxz(int i) {
        this.f277366a = i;
    }

    /* JADX INFO: renamed from: a */
    public static yxz m94863a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return CAN_BE_FOLLOWED;
        }
        if (i != 2) {
            return null;
        }
        return CAN_BE_UNFOLLOWED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f277366a;
    }
}
