package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum ozp0 implements od50 {
    CHAPTER_TYPE_UNKNOWN(0),
    CHAPTER_TYPE_TALK(1),
    CHAPTER_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f172342a;

    ozp0(int i) {
        this.f172342a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f172342a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
