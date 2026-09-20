package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes10.dex */
public final class iee extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f101387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f101388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f101389c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f101390d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f101391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iee(float f, long j, int i, int i2, long j2) {
        super(1);
        this.f101387a = f;
        this.f101388b = j;
        this.f101389c = i;
        this.f101390d = i2;
        this.f101391e = j2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fMo35989Z0 = drawScope.mo35989Z0(this.f101387a);
        em51 em51Var = new em51(fMo35989Z0, 0.0f, 1, 0, null, 26);
        float f = fMo35989Z0 / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - fMo35989Z0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) - fMo35989Z0)) & 4294967295L);
        DrawScope.m269A(drawScope, this.f101388b, 0.0f, 360.0f, jFloatToRawIntBits, jFloatToRawIntBits2, em51Var, 832);
        int i = this.f101389c;
        if (i > 0) {
            DrawScope.m269A(drawScope, this.f101391e, -90.0f, (this.f101390d / i) * 360.0f, jFloatToRawIntBits, jFloatToRawIntBits2, em51Var, 832);
        }
        return w2a1.f247311a;
    }
}
