package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum ppw implements od50 {
    HTTP_METHOD_UNSPECIFIED(0),
    HTTP_METHOD_GET(1),
    HTTP_METHOD_POST(2),
    HTTP_METHOD_PUT(3),
    HTTP_METHOD_PATCH(4),
    HTTP_METHOD_DELETE(5),
    HTTP_METHOD_HEAD(6),
    HTTP_METHOD_CONNECT(7),
    HTTP_METHOD_OPTIONS(8),
    HTTP_METHOD_TRACE(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f180124a;

    ppw(int i) {
        this.f180124a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f180124a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
