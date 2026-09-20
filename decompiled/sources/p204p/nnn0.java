package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum nnn0 implements od50 {
    PERMISSION_LEVEL_STATE_UNSPECIFIED(0),
    PERMISSION_LEVEL_STATE_PENDING(1),
    PERMISSION_LEVEL_STATE_ACCEPTED(2),
    PERMISSION_LEVEL_STATE_REJECTED(3);


    /* JADX INFO: renamed from: a */
    public final int f156456a;

    nnn0(int i) {
        this.f156456a = i;
    }

    /* JADX INFO: renamed from: a */
    public static nnn0 m65212a(int i) {
        if (i == 0) {
            return PERMISSION_LEVEL_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return PERMISSION_LEVEL_STATE_PENDING;
        }
        if (i == 2) {
            return PERMISSION_LEVEL_STATE_ACCEPTED;
        }
        if (i != 3) {
            return null;
        }
        return PERMISSION_LEVEL_STATE_REJECTED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f156456a;
    }
}
