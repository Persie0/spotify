package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes9.dex */
public final class qhd1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f188744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f188745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sb91 f188746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f188747d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f188748e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f188749f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f188750g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ wum0 f188751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhd1(boolean z, int i, sb91 sb91Var, int i2, float f, long j, float f2, wum0 wum0Var) {
        super(1);
        this.f188744a = z;
        this.f188745b = i;
        this.f188746c = sb91Var;
        this.f188747d = i2;
        this.f188748e = f;
        this.f188749f = j;
        this.f188750g = f2;
        this.f188751h = wum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        if (!this.f188744a) {
            long jM89067v = this.f188751h.m89067v() - ((long) this.f188745b);
            sb91 sb91Var = this.f188746c;
            float f = (jM89067v * (sb91Var.f207394g / this.f188747d)) + sb91Var.f207396i;
            if (f >= 0.0f && f < this.f188748e) {
                DrawScope.m277h0(drawScope, this.f188749f, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(this.f188750g * 3.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)))) & 4294967295L), 0.0f, null, null, 120);
            }
        }
        return w2a1.f247311a;
    }
}
