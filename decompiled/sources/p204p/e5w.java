package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum e5w implements od50 {
    VODCAST(0),
    AUDIO(1),
    VIDEO(2);


    /* JADX INFO: renamed from: a */
    public final int f56485a;

    e5w(int i) {
        this.f56485a = i;
    }

    /* JADX INFO: renamed from: a */
    public static e5w m37834a(int i) {
        if (i == 0) {
            return VODCAST;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f56485a;
    }
}
