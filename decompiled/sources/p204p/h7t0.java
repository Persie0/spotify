package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum h7t0 implements od50 {
    PUBLISHED_STATE_UNSPECIFIED(0),
    PUBLISHED_STATE_NOT_PUBLISHED(1),
    PUBLISHED_STATE_PUBLISHED(2);


    /* JADX INFO: renamed from: a */
    public final int f88553a;

    h7t0(int i) {
        this.f88553a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f88553a;
    }
}
