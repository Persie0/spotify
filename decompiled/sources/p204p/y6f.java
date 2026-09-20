package p204p;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes10.dex */
public final class y6f extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f269770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f269771c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f269772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6f(float f, long j, long j2) {
        super(1);
        this.f269769a = 3;
        this.f269770b = j;
        this.f269772d = f;
        this.f269771c = j2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f269769a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float f = 2;
                DrawScope.m275e0(drawScope, this.f269770b, Size.m264e(drawScope.mo295n()) / f, 0L, 0.0f, null, 124);
                DrawScope.m275e0(drawScope, this.f269771c, Size.m264e(drawScope.mo295n()) / f, 0L, 0.0f, new em51(this.f269772d, 0.0f, 0, 0, null, 30), 108);
                return w2a1.f247311a;
            case 1:
                return z3p0.m95286b((z3p0) obj, this.f269770b, Long.valueOf(this.f269771c), null, false, this.f269772d, false, null, null, null, null, 0, false, false, 32729);
            case 2:
                DrawScope drawScope2 = (DrawScope) obj;
                long jMo295n = drawScope2.mo295n();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L));
                float f2 = 2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L)) / f2;
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat / f2);
                DrawScope.m274Y(drawScope2, this.f269770b, 0L, jMo295n, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32), null, 0.0f, 242);
                DrawScope.m274Y(drawScope2, this.f269771c, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo295n() >> 32)) * this.f269772d)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L)) / f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L)) / f2)) & 4294967295L), null, 0.0f, 242);
                return w2a1.f247311a;
            default:
                DrawScope drawScope3 = (DrawScope) obj;
                float fM264e = Size.m264e(drawScope3.mo295n()) / 2;
                long j = this.f269770b;
                qxy qxyVar = qxy.f193763a;
                DrawScope.m275e0(drawScope3, j, fM264e, 0L, 0.0f, qxyVar, 108);
                DrawScope.m275e0(drawScope3, this.f269771c, drawScope3.mo35989Z0(this.f269772d), 0L, 0.0f, qxyVar, 108);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6f(int i, long j, float f, long j2) {
        super(1);
        this.f269769a = i;
        this.f269770b = j;
        this.f269771c = j2;
        this.f269772d = f;
    }
}
