package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum efn0 implements od50 {
    INPUT_FIELD_TYPE_UNKNOWN(0),
    INPUT_FIELD_TYPE_TEXT(1),
    INPUT_FIELD_TYPE_NUMBER(2),
    INPUT_FIELD_TYPE_PHONE(3),
    INPUT_FIELD_TYPE_EMAIL(4),
    INPUT_FIELD_TYPE_HIDDEN(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f59081a;

    efn0(int i) {
        this.f59081a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f59081a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
