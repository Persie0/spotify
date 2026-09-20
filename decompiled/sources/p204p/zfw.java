package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum zfw implements od50 {
    ERROR_REASON_UNSPECIFIED(0),
    ERROR_REASON_PROMPT_REJECTED(1),
    ERROR_REASON_ATTACHMENT_REJECTED(2),
    ERROR_REASON_ATTACHMENT_NOT_VALIDATED(3),
    ERROR_REASON_NO_CREDITS(4),
    ERROR_REASON_GENERATION_NOT_FOUND(5),
    ERROR_REASON_INVALID_VOICE(6),
    ERROR_REASON_INVALID_SCHEDULE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f282436a;

    zfw(int i) {
        this.f282436a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f282436a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
