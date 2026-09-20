package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum aga1 implements od50 {
    UPLOAD_SOURCE_UNSPECIFIED(0),
    UPLOAD_SOURCE_CAMERA(1),
    UPLOAD_SOURCE_LIBRARY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f15334a;

    aga1(int i) {
        this.f15334a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15334a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
