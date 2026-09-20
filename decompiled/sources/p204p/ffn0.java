package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ffn0 implements od50 {
    LEGAL_TERM_TYPE_UNKNOWN(0),
    LEGAL_TERM_TYPE_TEXT(1),
    LEGAL_TERM_TYPE_CONSPICUOUS_TEXT(2),
    LEGAL_TERM_TYPE_CHECKBOX(3),
    LEGAL_TERM_TYPE_CONSPICUOUS_CHECKBOX(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f69054a;

    ffn0(int i) {
        this.f69054a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69054a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
