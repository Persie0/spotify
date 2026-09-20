package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum g5f0 implements od50 {
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6);


    /* JADX INFO: renamed from: a */
    public final int f76672a;

    g5f0(int i) {
        this.f76672a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f76672a;
    }
}
