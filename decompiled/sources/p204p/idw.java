package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum idw implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_LOAD_FAILURE(1),
    /* JADX INFO: Fake field, exist only in values array */
    QAX_PARSE_FAILURE(2),
    /* JADX INFO: Fake field, exist only in values array */
    OS_NOTIFICATIONS_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION_CHANNEL_DISABLED(4),
    /* JADX INFO: Fake field, exist only in values array */
    METADATA_PARSE_FAILURE(5),
    /* JADX INFO: Fake field, exist only in values array */
    SALES_NOTIFICATION_FAILURE(6),
    OTHER(7),
    /* JADX INFO: Fake field, exist only in values array */
    JAM_NOTIFICATION_SUPPRESSED(8),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT_NOTIFICATION_SUPPRESSED(9),
    /* JADX INFO: Fake field, exist only in values array */
    CMP_QA_NOTIFICATION_SUPPRESSED(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f101254a;

    idw(int i) {
        this.f101254a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f101254a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
