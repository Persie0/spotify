package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum es20 implements od50 {
    UNSPECIFIED_STYLE(0),
    ARTIST(1),
    TRACK(2),
    PLAYLIST(3),
    MOOD(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f62268a;

    es20(int i) {
        this.f62268a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f62268a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
