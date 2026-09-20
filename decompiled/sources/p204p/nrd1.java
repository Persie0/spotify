package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum nrd1 {
    VIEW_NOT_READY(false),
    APP_NOT_FOREGROUNDED(false),
    NOT_WITHIN_TIMEFRAME(false),
    ALREADY_SEEN_IN_SESSION(true),
    ALREADY_ONGOING_PLAYBACK(true),
    USER_ALREADY_IN_JAM(true),
    ALREADY_CONNECTED_TO_CONNECT_DEVICE(true),
    CONNECT_TRANSFER_IN_PROGRESS(true),
    NO_AVAILABLE_CONNECT_DEVICES_FOUND(true),
    ONGOING_JAM_IN_NETWORK(true),
    CONNECTED_TO_BLUETOOTH_DEVICE(true),
    ALREADY_CONNECTED_TO_HEADSET(true),
    ALL_CHECKS_CLEAR(false);


    /* JADX INFO: renamed from: a */
    public final boolean f157512a;

    nrd1(boolean z) {
        this.f157512a = z;
    }
}
