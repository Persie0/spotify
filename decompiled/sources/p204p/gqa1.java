package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum gqa1 implements od50 {
    USER_GAME_STATE_UNSPECIFIED(0),
    USER_GAME_STATE_AVAILABLE_FIRST_GAME(1),
    USER_GAME_STATE_AVAILABLE(2),
    USER_GAME_STATE_COMPLETED(3),
    USER_GAME_STATE_INELIGIBLE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f83396a;

    gqa1(int i) {
        this.f83396a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f83396a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
