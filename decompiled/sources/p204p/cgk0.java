package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum cgk0 implements od50 {
    CONTROLS_MODE_UNSPECIFIED(0),
    CONTROLS_MODE_MUSIC(1),
    CONTROLS_MODE_TALK(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f37709a;

    cgk0(int i) {
        this.f37709a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37709a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
