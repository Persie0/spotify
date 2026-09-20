package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum cms0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_SOURCE_UNSPECIFIED(0),
    PROMPT_SOURCE_SUGGESTED(1),
    PROMPT_SOURCE_FREEFORM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f39789a;

    cms0(int i) {
        this.f39789a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39789a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
