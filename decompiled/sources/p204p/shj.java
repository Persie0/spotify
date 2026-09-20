package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum shj implements od50 {
    CONTENT_EXPERIENCE_UNSPECIFIED(0),
    CONTENT_EXPERIENCE_MUSIC(1),
    CONTENT_EXPERIENCE_TALK(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f209227a;

    shj(int i) {
        this.f209227a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f209227a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
