package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum z8x implements slk0 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: a */
    public final int f280583a;

    z8x(int i) {
        this.f280583a = i;
    }

    @Override // p204p.slk0
    public final int getNumber() {
        return this.f280583a;
    }
}
