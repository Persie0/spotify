package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum p850 implements od50 {
    INTERACTION_TYPE_UNSPECIFIED(0),
    ANSWER_BUTTON_ENTRY(1),
    TIMER_ENTRY(2),
    BUTTON_TAP(3),
    CORRECT_ANSWER(4),
    INCORRECT_ANSWER(5),
    NEXT_BUTTON(6),
    QUIZ_COMPLETE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f174876a;

    p850(int i) {
        this.f174876a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f174876a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
