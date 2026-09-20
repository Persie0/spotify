package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum ht40 implements od50 {
    UNKNOWN(0),
    MESSAGING_AUDIOBOOK_SUBFEED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f94924a;

    ht40(int i) {
        this.f94924a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f94924a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
