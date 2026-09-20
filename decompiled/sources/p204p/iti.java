package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum iti implements od50 {
    PROTOCOL_CHOICE_REASON_DEFAULT(0),
    PROTOCOL_CHOICE_REASON_USER_SELECTED(1),
    PROTOCOL_CHOICE_REASON_STREAM_EXPANSION(2),
    PROTOCOL_CHOICE_REASON_ANDROID_TV(3),
    PROTOCOL_CHOICE_REASON_TAP_DEVICE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f105600a;

    iti(int i) {
        this.f105600a = i;
    }

    /* JADX INFO: renamed from: a */
    public static iti m51631a(int i) {
        if (i == 0) {
            return PROTOCOL_CHOICE_REASON_DEFAULT;
        }
        if (i == 1) {
            return PROTOCOL_CHOICE_REASON_USER_SELECTED;
        }
        if (i == 2) {
            return PROTOCOL_CHOICE_REASON_STREAM_EXPANSION;
        }
        if (i == 3) {
            return PROTOCOL_CHOICE_REASON_ANDROID_TV;
        }
        if (i != 4) {
            return null;
        }
        return PROTOCOL_CHOICE_REASON_TAP_DEVICE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f105600a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
