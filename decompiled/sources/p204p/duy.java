package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum duy implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_UNKNOWN(0),
    FIELD_EMAIL(1),
    FIELD_PASSWORD(2),
    FIELD_BIRTHDATE(3),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_DISPLAY_NAME(4),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_GENDER(5),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_EULA_AGREEMENT(6),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_PERSONAL_INFO_COLLECTION(7),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_RECAPTCHA(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f53324a;

    duy(int i) {
        this.f53324a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f53324a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
