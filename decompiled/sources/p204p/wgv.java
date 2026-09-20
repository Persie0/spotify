package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum wgv implements od50 {
    UNSPECIFIED(0),
    TRACK(1),
    ARTIST(2),
    ALBUM(3),
    SHOW(4),
    AUDIOBOOK(5),
    PLAYLIST(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f251162a;

    wgv(int i) {
        this.f251162a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f251162a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
