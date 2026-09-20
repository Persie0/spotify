package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum byd0 implements od50 {
    MEDIA_TYPE_UNSPECIFIED(0),
    MEDIA_TYPE_IMAGE(1),
    MEDIA_TYPE_VIDEO(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f32162a;

    byd0(int i) {
        this.f32162a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f32162a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
