package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum zik implements od50 {
    CONTRIBUTION_SOURCE_UNSPECIFIED(0),
    CONTRIBUTION_SOURCE_USER(1),
    CONTRIBUTION_SOURCE_EDITORIAL(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f283184a;

    zik(int i) {
        this.f283184a = i;
    }

    /* JADX INFO: renamed from: a */
    public static zik m96221a(int i) {
        if (i == 0) {
            return CONTRIBUTION_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONTRIBUTION_SOURCE_USER;
        }
        if (i != 2) {
            return null;
        }
        return CONTRIBUTION_SOURCE_EDITORIAL;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f283184a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
