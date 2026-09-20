package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum zfr implements od50 {
    DEVICE_TYPE_UNKNOWN(0),
    COMPUTER(1),
    TABLET(2),
    SMARTPHONE(3),
    SPEAKER(4),
    TV(5),
    AVR(6),
    STB(7),
    AUDIO_DONGLE(8),
    GAME_CONSOLE(9),
    CAST_VIDEO(10),
    CAST_AUDIO(11),
    AUTOMOBILE(12),
    SMARTWATCH(13),
    HOME_THING(14),
    GLASSES(15),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f282387a;

    zfr(int i) {
        this.f282387a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f282387a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
