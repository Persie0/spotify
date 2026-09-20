package p204p;

import android.graphics.Insets;
import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes3.dex */
public final class hdo0 implements edo0, hw11 {

    /* JADX INFO: renamed from: b */
    public static final hdo0 f90170b = new hdo0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90171a;

    public /* synthetic */ hdo0(int i) {
        this.f90171a = i;
    }

    @Override // p204p.hw11
    /* JADX INFO: renamed from: a */
    public float mo47252a(float f, float f2) {
        switch (this.f90171a) {
            case 1:
                return -f2;
            case 2:
                return f;
            case 3:
                return -f;
            default:
                return f2;
        }
    }

    @Override // p204p.hw11
    /* JADX INFO: renamed from: b */
    public Insets mo47253b(Insets insets, int i) {
        switch (this.f90171a) {
            case 1:
                return Insets.of(insets.left, insets.top, insets.right, i);
            case 2:
                return Insets.of(i, insets.top, insets.right, insets.bottom);
            case 3:
                return Insets.of(insets.left, insets.top, i, insets.bottom);
            default:
                return Insets.of(insets.left, i, insets.right, insets.bottom);
        }
    }

    @Override // p204p.hw11
    /* JADX INFO: renamed from: c */
    public int mo47254c(Insets insets) {
        switch (this.f90171a) {
            case 1:
                return insets.bottom;
            case 2:
                return insets.left;
            case 3:
                return insets.right;
            default:
                return insets.top;
        }
    }

    @Override // p204p.edo0
    /* JADX INFO: renamed from: d */
    public boolean mo36520d() {
        return true;
    }

    @Override // p204p.hw11
    /* JADX INFO: renamed from: e */
    public long mo47255e(long j) {
        switch (this.f90171a) {
            case 1:
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            case 2:
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            case 3:
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            default:
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
    }

    @Override // p204p.hw11
    /* JADX INFO: renamed from: f */
    public long mo47256f(long j, float f) {
        switch (this.f90171a) {
            case 1:
                return pp91.m70524e(0.0f, m5b1.m60855e(j) + f);
            case 2:
                return pp91.m70524e(m5b1.m60854d(j) - f, 0.0f);
            case 3:
                return pp91.m70524e(m5b1.m60854d(j) + f, 0.0f);
            default:
                return pp91.m70524e(0.0f, m5b1.m60855e(j) - f);
        }
    }

    @Override // p204p.edo0
    /* JADX INFO: renamed from: g */
    public ddo0 mo36522g(View view, boolean z, long j, float f, float f2, boolean z2, yqq yqqVar, float f3) {
        if (z) {
            return new gdo0(new Magnifier(view));
        }
        long jMo35991l1 = yqqVar.mo35991l1(j);
        float fMo35989Z0 = yqqVar.mo35989Z0(f);
        float fMo35989Z1 = yqqVar.mo35989Z0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo35991l1 != 9205357640488583168L) {
            builder.setSize(q3d0.m72083N(Float.intBitsToFloat((int) (jMo35991l1 >> 32))), q3d0.m72083N(Float.intBitsToFloat((int) (jMo35991l1 & 4294967295L))));
        }
        if (!Float.isNaN(fMo35989Z0)) {
            builder.setCornerRadius(fMo35989Z0);
        }
        if (!Float.isNaN(fMo35989Z1)) {
            builder.setElevation(fMo35989Z1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new gdo0(builder.build());
    }
}
