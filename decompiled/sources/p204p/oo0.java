package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum oo0 implements od50 {
    UNKNOWN(0),
    AUDIO(1),
    VIDEO(2),
    DISPLAY(3),
    DUMMY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f167425a;

    oo0(int i) {
        this.f167425a = i;
    }

    /* JADX INFO: renamed from: a */
    public static oo0 m67447a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i == 2) {
            return VIDEO;
        }
        if (i == 3) {
            return DISPLAY;
        }
        if (i != 4) {
            return null;
        }
        return DUMMY;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f167425a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
