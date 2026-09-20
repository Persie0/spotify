package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum cl31 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    SONG_CREDITS_ISSUE_UNSPECIFIED(0),
    SONG_CREDITS_ISSUE_MISSING_CREDIT(1),
    SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE(2),
    SONG_CREDITS_ISSUE_INCORRECT_ROLE(3),
    SONG_CREDITS_ISSUE_MISSPELT(4),
    SONG_CREDITS_ISSUE_OTHER(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f39183a;

    cl31(int i) {
        this.f39183a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39183a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
