package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum axt0 implements od50 {
    QUIZ_CONTENT_VARIANT_UNSPECIFIED(0),
    QUIZ_CONTENT_VARIANT_PLAY_QUIZ(1),
    QUIZ_CONTENT_VARIANT_SCORE_SHARE(2),
    QUIZ_CONTENT_VARIANT_CHALLENGE_FRIEND(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f20998a;

    axt0(int i) {
        this.f20998a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f20998a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
