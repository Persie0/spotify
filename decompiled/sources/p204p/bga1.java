package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum bga1 implements od50 {
    UPLOAD_SOURCE_UNSPECIFIED(0),
    UPLOAD_SOURCE_CAMERA(1),
    UPLOAD_SOURCE_LIBRARY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f26902a;

    bga1(int i) {
        this.f26902a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f26902a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
