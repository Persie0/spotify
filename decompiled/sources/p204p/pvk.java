package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum pvk implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_UNDEFINED(0),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_IS_FOLLOWING(1),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_IS_FOLLOWED_BY(2),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_IS_BLOCKING(3),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_IS_BLOCKED_BY(4),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_FRIEND_REQUEST_SENT(5),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_COUNT_TYPE_FRIEND_REQUEST_RECEIVED(6),
    RELATION_COUNT_TYPE_IS_FRIEND(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f181786a;

    pvk(int i) {
        this.f181786a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f181786a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
