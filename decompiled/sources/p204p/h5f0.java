package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum h5f0 implements od50 {
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6);


    /* JADX INFO: renamed from: a */
    public final int f87831a;

    h5f0(int i) {
        this.f87831a = i;
    }

    /* JADX INFO: renamed from: a */
    public static h5f0 m46685a(int i) {
        switch (i) {
            case 1:
                return ALBUM;
            case 2:
                return SINGLE;
            case 3:
                return COMPILATION;
            case 4:
                return EP;
            case 5:
                return AUDIOBOOK;
            case 6:
                return PODCAST;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f87831a;
    }
}
