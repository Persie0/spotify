package p204p;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes11.dex */
public final class zaa extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xk80 f281009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f281010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zaa(xk80 xk80Var, float f, int i) {
        super(1);
        this.f281008a = i;
        this.f281009b = xk80Var;
        this.f281010c = f;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f281008a) {
            case 0:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L));
                float f = this.f281010c;
                DrawScope.m273U0(tgjVar, this.f281009b, (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat - f))) | (Float.floatToRawIntBits(0.0f) << 32), Size.m261b(0.0f, f, tgjVar.mo295n(), 1), 0.0f, null, null, 8, 56);
                break;
            case 1:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tgjVar2.mo295n() & 4294967295L));
                float f2 = this.f281010c;
                DrawScope.m273U0(tgjVar2, this.f281009b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar2.mo295n() >> 32))) << 32), 0.0f, null, null, 0, 120);
                break;
            default:
                DrawScope drawScope = (DrawScope) obj;
                float f3 = this.f281010c;
                DrawScope.m276f0(drawScope, this.f281009b, 0L, 0L, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, null, 246);
                break;
        }
        return w2a1.f247311a;
    }
}
