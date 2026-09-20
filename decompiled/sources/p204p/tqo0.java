package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum tqo0 implements od50 {
    PLAY_REASON_UNKNOWN(0),
    PLAY_REASON_APP_LOAD(1),
    PLAY_REASON_BACK_BTN(2),
    PLAY_REASON_CLICK_ROW(3),
    PLAY_REASON_CLICK_SIDE(4),
    PLAY_REASON_END_PLAY(5),
    PLAY_REASON_FWD_BTN(6),
    PLAY_REASON_INTERRUPTED(7),
    PLAY_REASON_LOGOUT(8),
    PLAY_REASON_PLAY_BTN(9),
    PLAY_REASON_POPUP(10),
    PLAY_REASON_REMOTE(11),
    PLAY_REASON_SONG_DONE(12),
    PLAY_REASON_TRACK_DONE(13),
    PLAY_REASON_TRACK_ERROR(14),
    PLAY_REASON_PREVIEW(15),
    PLAY_REASON_URI_OPEN(16),
    PLAY_REASON_BACKGROUNDED(17),
    PLAY_REASON_OFFLINE(18),
    PLAY_REASON_UNEXPECTED_EXIT(19),
    PLAY_REASON_UNEXPECTED_EXIT_WHILE_PAUSED(20),
    PLAY_REASON_SWITCHED_TO_AUDIO(21),
    PLAY_REASON_SWITCHED_TO_VIDEO(22),
    PLAY_REASON_RECONNECT(23),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f222861a;

    tqo0(int i) {
        this.f222861a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f222861a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
