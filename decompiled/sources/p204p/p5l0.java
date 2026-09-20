package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p5l0 extends z8f {

    /* JADX INFO: renamed from: d */
    public static final float[] f174186d;

    /* JADX INFO: renamed from: e */
    public static final float[] f174187e;

    /* JADX INFO: renamed from: f */
    public static final float[] f174188f;

    /* JADX INFO: renamed from: g */
    public static final float[] f174189g;

    static {
        float[] fArrM41608w = fgg1.m41608w(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, fgg1.m41601p((float[]) px0.f182168c.f182174b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f174186d = fArrM41608w;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f174187e = fArr;
        f174188f = fgg1.m41606u(fArrM41608w);
        f174189g = fgg1.m41606u(fArr);
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: a */
    public final float mo25696a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: b */
    public final float mo25697b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: d */
    public final long mo25698d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f174189g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f174188f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32);
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: e */
    public final float mo25699e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f174189g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f174188f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: f */
    public final long mo25700f(float f, float f2, float f3, float f4, z8f z8fVar) {
        float[] fArr = f174186d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM88247B = wj50.m88247B(f5);
        float fM88247B2 = wj50.m88247B(f6);
        float fM88247B3 = wj50.m88247B(f7);
        float[] fArr2 = f174187e;
        return rfg1.m75431a((fArr2[6] * fM88247B3) + (fArr2[3] * fM88247B2) + (fArr2[0] * fM88247B), (fArr2[7] * fM88247B3) + (fArr2[4] * fM88247B2) + (fArr2[1] * fM88247B), (fArr2[8] * fM88247B3) + (fArr2[5] * fM88247B2) + (fArr2[2] * fM88247B), f4, z8fVar);
    }
}
