package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes6.dex */
public final class vyc1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f246057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f246058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv41 f246059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rv41 f246060d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f246061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyc1(long j, long j2, rv41 rv41Var, rv41 rv41Var2, uum0 uum0Var) {
        super(1);
        this.f246057a = j;
        this.f246058b = j2;
        this.f246059c = rv41Var;
        this.f246060d = rv41Var2;
        this.f246061e = uum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fMo35989Z0 = drawScope.mo35989Z0(((ybs) this.f246059c.getValue()).f271238a);
        DrawScope.m274Y(drawScope, this.f246057a, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L) | (Float.floatToRawIntBits(fMo35989Z0) << 32), null, 0.0f, 240);
        float fMo35989Z1 = drawScope.mo35989Z0(((ybs) this.f246060d.getValue()).f271238a) + fMo35989Z0;
        float fM84031v = this.f246061e.m84031v() / 100.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * fM84031v;
        DrawScope.m274Y(drawScope, this.f246058b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * fM84031v)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L) | (Float.floatToRawIntBits(fMo35989Z0) << 32), null, 0.0f, 240);
        if (fIntBitsToFloat > fMo35989Z1) {
            DrawScope.m277h0(drawScope, this.f246058b, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fMo35989Z0) << 32), (((long) Float.floatToRawIntBits(fMo35989Z0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)))) & 4294967295L), 0.0f, null, null, 120);
        }
        return w2a1.f247311a;
    }
}
