package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum fwi0 implements od50 {
    UNSET(0),
    SHOWCASE_DEFAULT(1),
    SHOWCASE_VIDEO(2),
    SHOWCASE_PRERELEASE(3),
    SHOWCASE_MUSIC_VIDEO(4);


    /* JADX INFO: renamed from: a */
    public final int f74078a;

    fwi0(int i) {
        this.f74078a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f74078a;
    }
}
