package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum jz30 implements od50 {
    ICON_UNKNOWN(0),
    SHUFFLE(1),
    SPOTIFYLOGO(2),
    X(3),
    EXCLAMATIONCIRCLE(4),
    CHEVRONRIGHT(5),
    FOLLOWACTIVE(6),
    DEVICETV(7),
    DEVICESPEAKER(8),
    EXTERNALLINK(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f117581a;

    jz30(int i) {
        this.f117581a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f117581a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
