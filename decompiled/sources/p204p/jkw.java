package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum jkw implements od50 {
    MEDIA_MANIFEST_SUCCESS(0),
    MEDIA_MANIFEST_INVALID_MANIFEST_ID(1),
    MEDIA_MANIFEST_CONNECTION_ERROR(2),
    MEDIA_MANIFEST_HTTP_ERROR(3),
    MEDIA_MANIFEST_CONNECTION_TIMEOUT(4),
    MEDIA_MANIFEST_HTTP_FORBIDDEN(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f113427a;

    jkw(int i) {
        this.f113427a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f113427a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
