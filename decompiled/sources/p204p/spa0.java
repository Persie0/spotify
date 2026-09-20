package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum spa0 implements slk0 {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: a */
    public final int f212789a;

    spa0(int i) {
        this.f212789a = i;
    }

    @Override // p204p.slk0
    public final int getNumber() {
        return this.f212789a;
    }
}
