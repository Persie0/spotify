package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ckw implements od50 {
    VIDEO(0),
    AUDIO(1),
    /* JADX INFO: Fake field, exist only in values array */
    SUBTITLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f39101a;

    ckw(int i) {
        this.f39101a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39101a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
