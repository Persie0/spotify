package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ct60 implements od50 {
    ENABLED(0),
    DISABLED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f41788a;

    ct60(int i) {
        this.f41788a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f41788a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
