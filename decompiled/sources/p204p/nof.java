package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum nof implements od50 {
    PICK_AND_SHUFFLE(0),
    AUDIOBOOKS(1),
    LYRICS(2),
    BLUEJAY(3),
    KALLAX(4),
    /* JADX INFO: Fake field, exist only in values array */
    SUPER_CONNECT(5),
    PROMPT_PLAYLIST(6),
    RUNNING_MODE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f156693a;

    nof(int i) {
        this.f156693a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f156693a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
