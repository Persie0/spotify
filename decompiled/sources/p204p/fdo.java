package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum fdo implements slk0 {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: a */
    public final int f68534a;

    fdo(int i) {
        this.f68534a = i;
    }

    @Override // p204p.slk0
    public final int getNumber() {
        return this.f68534a;
    }
}
