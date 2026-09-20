package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum uos0 implements od50 {
    BACKEND_ERROR(0),
    PROMPT_VALIDATOR_ERROR(1),
    TERMS_AND_SERVICES_CHECKER_ERROR(2),
    RATE_LIMIT_EXCEEDED_ERROR(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f232515a;

    uos0(int i) {
        this.f232515a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f232515a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
