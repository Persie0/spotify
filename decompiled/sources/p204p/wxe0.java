package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum wxe0 implements h2t0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: a */
    public final int f256019a;

    wxe0(int i) {
        this.f256019a = i;
    }

    @Override // p204p.h2t0
    public final int getNumber() {
        return this.f256019a;
    }
}
