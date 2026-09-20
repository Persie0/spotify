package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum pvl0 implements od50 {
    ORCHESTRATION_STACK_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    ORCHESTRATION_STACK_LIST_PLAYER(1),
    ORCHESTRATION_STACK_CONTEXT_PLAYER(2),
    ORCHESTRATION_STACK_MULTIPLAYER(3),
    ORCHESTRATION_STACK_STANDALONE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f181798a;

    pvl0(int i) {
        this.f181798a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f181798a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
