package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum ycg1 implements taf1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: a */
    public final int f271494a;

    ycg1(int i) {
        this.f271494a = i;
    }

    @Override // p204p.taf1
    public final int zza() {
        return this.f271494a;
    }
}
