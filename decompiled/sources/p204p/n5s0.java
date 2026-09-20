package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n5s0 {

    /* JADX INFO: renamed from: a */
    public static final float f150608a = hee.f90415c;

    /* JADX INFO: renamed from: b */
    public static final int f150609b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f150610c = 1;

    /* JADX INFO: renamed from: d */
    public static final float f150611d = hl80.f92641b;

    /* JADX INFO: renamed from: e */
    public static final float f150612e = hl80.f92642c;

    /* JADX INFO: renamed from: f */
    public static final float f150613f = hee.f90414b;

    /* JADX INFO: renamed from: a */
    public static final void m63751a(DrawScope drawScope, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) / 2.0f;
            DrawScope.m275e0(drawScope, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 0.0f, null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) - f) / 2.0f;
        DrawScope.m277h0(drawScope, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, null, null, 120);
    }
}
