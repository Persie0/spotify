package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum cv31 implements od50 {
    SOURCE_TOOL_UNSPECIFIED(0),
    SOURCE_TOOL_PROMPT(1),
    SOURCE_TOOL_STUDIO_AGENT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f42287a;

    cv31(int i) {
        this.f42287a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f42287a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
