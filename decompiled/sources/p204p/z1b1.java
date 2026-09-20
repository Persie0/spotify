package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z1b1 {

    /* JADX INFO: renamed from: b */
    public static final z1b1 f278274b = new z1b1(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278275a;

    public /* synthetic */ z1b1(int i) {
        this.f278275a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95103a(int i, float[] fArr) {
        switch (this.f278275a) {
            case 0:
                return Math.max(((float) ((i >> 16) & 255)) / 255.0f, Math.max(((float) ((i >> 8) & 255)) / 255.0f, ((float) (i & 255)) / 255.0f)) > 0.2f;
            default:
                float f = fArr[2];
                if (f >= 0.95f || f <= 0.05f) {
                    return false;
                }
                float f2 = fArr[0];
                return f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f;
        }
    }
}
