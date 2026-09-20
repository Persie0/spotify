package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum dqr0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_COMPLETION_SCREEN_UNSPECIFIED(0),
    INTRO(1),
    DISPLAY_NAME(2),
    PROFILE_PICTURE(3),
    CONFIRM(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f52074a;

    dqr0(int i) {
        this.f52074a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52074a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
