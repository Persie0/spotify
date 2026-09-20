package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class jj8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112945a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f112946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f112947c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f112948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj8(float f, int i, long j) {
        super(1);
        this.f112946b = f;
        this.f112947c = i;
        this.f112948d = j;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        switch (this.f112945a) {
            case 0:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                int iM38547C = edb.m38547C(this.f112947c);
                if (iM38547C == 0) {
                    fIntBitsToFloat = 0.0f;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fIntBitsToFloat = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L));
                }
                tgjVar.mo293g1(this.f112948d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32))) << 32), (496 & 8) != 0 ? 0.0f : this.f112946b, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                return w2a1.f247311a;
            default:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                float f = 1.0f - this.f112946b;
                if (f > 0.0f) {
                    float f2 = this.f112947c;
                    float f3 = 0.5f * f2;
                    float f4 = f2 - f3;
                    DrawScope.m273U0(tgjVar2, tm4.m81086D(h6f.m46715L(new n6f(n6f.m63765b(this.f112948d, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new n6f(n6f.m63765b(this.f112948d, f * 0.9f, 0.0f, 0.0f, 0.0f, 14))), f4, f2, 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar2.mo295n() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, null, null, 0, 120);
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj8(int i, long j, float f) {
        super(1);
        this.f112947c = i;
        this.f112948d = j;
        this.f112946b = f;
    }
}
