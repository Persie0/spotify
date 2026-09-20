package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes11.dex */
public final class tqs extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222876a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f222877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f222878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqs(float f, boolean z) {
        super(1);
        this.f222878c = f;
        this.f222877b = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f222876a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = ((Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) * Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L))) + (Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)))) / (Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * 4.0f);
                float f = this.f222878c;
                if (f > 0.0f) {
                    long jM63765b = n6f.m63765b(n6f.f150866f, f, 0.0f, 0.0f, 0.0f, 14);
                    float fIntBitsToFloat2 = this.f222877b ? Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - fIntBitsToFloat : fIntBitsToFloat;
                    DrawScope.m275e0(drawScope, jM63765b, fIntBitsToFloat, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32), 0.0f, null, 120);
                }
                break;
            default:
                fdx0 fdx0Var = (fdx0) obj;
                if (!this.f222877b) {
                    fdx0Var.m41380b(this.f222878c);
                }
                fdx0Var.m41384f(false);
                fdx0Var.m41385g(2);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqs(boolean z, float f) {
        super(1);
        this.f222877b = z;
        this.f222878c = f;
    }
}
