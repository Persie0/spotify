package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum yls0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_INPUT_TYPE_UNSPECIFIED(0),
    PROMPT_INPUT_TYPE_VOICE(1),
    PROMPT_INPUT_TYPE_TEXT(2),
    PROMPT_INPUT_TYPE_SUGGESTED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f274099a;

    yls0(int i) {
        this.f274099a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f274099a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
