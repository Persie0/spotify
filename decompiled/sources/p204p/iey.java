package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum iey implements od50 {
    UNKNOWN_FEATURE(0),
    CHAT(1),
    SPEAK(2),
    MODERATION_CONTROLS(3),
    HOST_CONTROLS(4),
    VIEW_CHAT_MESSAGES(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f101583a;

    iey(int i) {
        this.f101583a = i;
    }

    /* JADX INFO: renamed from: a */
    public static iey m50403a(int i) {
        if (i == 0) {
            return UNKNOWN_FEATURE;
        }
        if (i == 1) {
            return CHAT;
        }
        if (i == 2) {
            return SPEAK;
        }
        if (i == 3) {
            return MODERATION_CONTROLS;
        }
        if (i == 4) {
            return HOST_CONTROLS;
        }
        if (i != 10) {
            return null;
        }
        return VIEW_CHAT_MESSAGES;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f101583a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
