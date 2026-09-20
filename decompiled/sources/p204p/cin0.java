package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum cin0 implements od50 {
    NO_ERROR(0),
    NO_OWER_PROVIDER(1),
    SERIALIZATION_ERROR(2),
    DECRYPTION_ERROR(3),
    EVENT_SENDER_ERROR(4),
    FAILED_OPENING_DB(5),
    FAILED_GETTING_EVENT_FROM_DB(6),
    FAILED_ADDING_EVENT_TO_DB(7),
    FAILED_OVERWRITING_EVENT_IN_DB(8),
    FAILED_REMOVING_EVENT_FROM_DB(9),
    FAILED_WRITING_TO_DB(10),
    FAILED_ALLOCATING_SEQUENCE_NUMBER(11),
    BAD_INPUT_PENDING_EVENTS_TOKEN(12),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f38406a;

    cin0(int i) {
        this.f38406a = i;
    }

    /* JADX INFO: renamed from: a */
    public static cin0 m32900a(int i) {
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return NO_OWER_PROVIDER;
            case 2:
                return SERIALIZATION_ERROR;
            case 3:
                return DECRYPTION_ERROR;
            case 4:
                return EVENT_SENDER_ERROR;
            case 5:
                return FAILED_OPENING_DB;
            case 6:
                return FAILED_GETTING_EVENT_FROM_DB;
            case 7:
                return FAILED_ADDING_EVENT_TO_DB;
            case 8:
                return FAILED_OVERWRITING_EVENT_IN_DB;
            case 9:
                return FAILED_REMOVING_EVENT_FROM_DB;
            case 10:
                return FAILED_WRITING_TO_DB;
            case 11:
                return FAILED_ALLOCATING_SEQUENCE_NUMBER;
            case 12:
                return BAD_INPUT_PENDING_EVENTS_TOKEN;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38406a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
