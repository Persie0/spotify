package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum vos0 implements od50 {
    NEVER(0),
    DAILY(1),
    WEEKLY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243531a;

    vos0(int i) {
        this.f243531a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243531a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
