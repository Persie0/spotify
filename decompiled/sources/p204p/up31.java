package p204p;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class up31 implements vp31 {

    /* JADX INFO: renamed from: a */
    public final float[] f232568a;

    /* JADX INFO: renamed from: b */
    public float[] f232569b;

    /* JADX INFO: renamed from: c */
    public float[] f232570c;

    /* JADX INFO: renamed from: d */
    public float[] f232571d;

    /* JADX INFO: renamed from: e */
    public double f232572e;

    /* JADX INFO: renamed from: f */
    public double f232573f;

    /* JADX INFO: renamed from: g */
    public double f232574g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ wp31 f232575h;

    public up31(wp31 wp31Var) {
        this.f232575h = wp31Var;
        int i = wp31Var.f253656h;
        this.f232568a = new float[i];
        int i2 = i * wp31Var.f253650b;
        this.f232569b = new float[i2];
        this.f232570c = new float[i2];
        this.f232571d = new float[i2];
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: a */
    public final void mo69611a(int i, int i2) {
        for (int i3 = 0; i3 < this.f232575h.f253650b * i2; i3++) {
            this.f232569b[i + i3] = 0.0f;
        }
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: b */
    public final void mo69612b(int i, int i2) {
        wp31 wp31Var = this.f232575h;
        int i3 = wp31Var.f253656h / i2;
        int i4 = wp31Var.f253650b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += (double) this.f232569b[klh.m56829a(i7, i5, i6, i8)];
            }
            this.f232568a[i7] = (float) (d / ((double) i5));
        }
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: c */
    public final int mo69613c(int i, int i2, int i3) {
        return m83646s(i, i2, i3, this.f232569b);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: d */
    public final Object mo69614d() {
        return this.f232569b;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: e */
    public final void mo69615e(int i) {
        this.f232570c = m83645r(this.f232575h.f253659k, i, this.f232570c);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: f */
    public final boolean mo69616f() {
        double d = this.f232572e;
        return d != 0.0d && this.f232575h.f253664p != 0 && this.f232573f <= d * 3.0d && d * 2.0d > this.f232574g * 3.0d;
    }

    @Override // p204p.vp31
    public final void flush() {
        this.f232574g = 0.0d;
        this.f232572e = 0.0d;
        this.f232573f = 0.0d;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: g */
    public final void mo69617g(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.f232570c;
        float[] fArr2 = this.f232569b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: h */
    public final void mo69618h(int i) {
        this.f232569b = m83645r(this.f232575h.f253658j, i, this.f232569b);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: i */
    public final int mo69619i(int i, int i2) {
        return m83646s(0, i, i2, this.f232568a);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: j */
    public final void mo69620j(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            wp31 wp31Var = this.f232575h;
            int i3 = wp31Var.f253650b;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.f232570c;
            int i4 = (wp31Var.f253659k * i3) + i2;
            float[] fArr2 = this.f232571d;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = ((long) wp31Var.f253662n) * j;
            int i6 = wp31Var.f253661m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            fArr[i4] = (((j6 - j5) * f2) + (j5 * f)) / j6;
            i2++;
        }
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: k */
    public final void mo69621k() {
        this.f232574g = this.f232572e;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: l */
    public final Object mo69622l() {
        return this.f232570c;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: m */
    public final Object mo69623m() {
        return this.f232571d;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: n */
    public final void mo69624n(ByteBuffer byteBuffer, int i) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f232569b;
        wp31 wp31Var = this.f232575h;
        floatBufferAsFloatBuffer.get(fArr, wp31Var.f253658j * wp31Var.f253650b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: o */
    public final void mo69625o(int i) {
        this.f232571d = m83645r(this.f232575h.f253660l, i, this.f232571d);
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: p */
    public final int mo69626p() {
        return 4;
    }

    @Override // p204p.vp31
    /* JADX INFO: renamed from: q */
    public final void mo69627q(ByteBuffer byteBuffer, int i) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f232570c;
        wp31 wp31Var = this.f232575h;
        floatBufferAsFloatBuffer.put(fArr, 0, wp31Var.f253650b * i);
        byteBuffer.position((i * 4 * wp31Var.f253650b) + byteBuffer.position());
    }

    /* JADX INFO: renamed from: r */
    public final float[] m83645r(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.f232575h.f253650b;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: s */
    public final int m83646s(int i, int i2, int i3, float[] fArr) {
        int i4 = this.f232575h.f253650b * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double dAbs = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                dAbs += (double) Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d3 = i7;
            if (((double) i5) * dAbs < d * d3) {
                i5 = i7;
                d = dAbs;
            }
            if (((double) i6) * dAbs > d3 * d2) {
                i6 = i7;
                d2 = dAbs;
            }
            i7++;
            i4 = i9;
        }
        this.f232572e = d / ((double) i5);
        this.f232573f = d2 / ((double) i6);
        return i5;
    }
}
