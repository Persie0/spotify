package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d4b0 {

    /* JADX INFO: renamed from: a */
    public final float[] f45127a;

    /* JADX INFO: renamed from: b */
    public final float[] f45128b;

    /* JADX INFO: renamed from: c */
    public final float[] f45129c;

    /* JADX INFO: renamed from: d */
    public final float f45130d;

    /* JADX INFO: renamed from: e */
    public final float f45131e;

    public d4b0(float[] fArr, float[] fArr2, float[] fArr3, float f, float f2) {
        this.f45127a = fArr;
        this.f45128b = fArr2;
        this.f45129c = fArr3;
        this.f45130d = f;
        this.f45131e = f2;
        if (fArr.length == 0) {
            throw new IllegalArgumentException("LoopTile arrays must not be empty");
        }
        if (fArr.length != fArr2.length || fArr2.length != fArr3.length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("bucketStride must be positive");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m34913a(float f) {
        float[] fArr = this.f45127a;
        if (fArr.length != 0) {
            float f2 = this.f45130d;
            if (f2 > 0.0f) {
                float f3 = this.f45131e;
                if (f3 > 0.0f) {
                    return Math.max(0, Math.min((int) ((f % f2) / f3), fArr.length - 1));
                }
            }
        }
        return 0;
    }
}
