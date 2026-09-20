package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes9.dex */
public final class omk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167047a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f167048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f167049c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f167050d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f167051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(float f, long j, float f2, long j2) {
        super(1);
        this.f167050d = f;
        this.f167048b = j;
        this.f167051e = f2;
        this.f167049c = j2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f167047a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fMo35989Z0 = drawScope.mo35989Z0(this.f167050d) / 2;
                DrawScope.m275e0(drawScope, n6f.m63765b(this.f167048b, this.f167051e, 0.0f, 0.0f, 0.0f, 14), fMo35989Z0, 0L, 0.0f, null, 124);
                DrawScope.m275e0(drawScope, n6f.m63765b(this.f167049c, this.f167051e, 0.0f, 0.0f, 0.0f, 14), fMo35989Z0, 0L, 0.0f, new em51(drawScope.mo35989Z0(2.0f), 0.0f, 0, 0, null, 30), 108);
                break;
            case 1:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                tgjVar.mo24619j();
                float fMo35989Z1 = tgjVar.mo35989Z0(this.f167050d);
                tgjVar.mo24619j();
                float fMo35989Z2 = tgjVar.mo35989Z0(this.f167051e) + fMo35989Z1;
                float fIntBitsToFloat = tgjVar.getLayoutDirection() == ko70.f124557b ? fMo35989Z1 : Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) - fMo35989Z1;
                DrawScope.m275e0(tgjVar, this.f167048b, fMo35989Z2, (((long) Float.floatToRawIntBits(fMo35989Z1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), 0.0f, null, 120);
                DrawScope.m275e0(tgjVar, this.f167049c, fMo35989Z1, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fMo35989Z1)) & 4294967295L), 0.0f, null, 120);
                break;
            default:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                Float fValueOf = Float.valueOf(0.0f);
                long j = this.f167048b;
                pqm0 pqm0Var = new pqm0(fValueOf, new n6f(j));
                pqm0 pqm0Var2 = new pqm0(Float.valueOf(this.f167050d), new n6f(j));
                Float fValueOf2 = Float.valueOf(this.f167051e);
                long j2 = this.f167049c;
                DrawScope.m273U0(tgjVar2, tm4.m81087E(new pqm0[]{pqm0Var, pqm0Var2, new pqm0(fValueOf2, new n6f(j2)), new pqm0(Float.valueOf(1.0f), new n6f(j2))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 6, 62);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(long j, float f, float f2, long j2) {
        super(1);
        this.f167048b = j;
        this.f167050d = f;
        this.f167051e = f2;
        this.f167049c = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(long j, long j2, float f, float f2) {
        super(1);
        this.f167048b = j;
        this.f167049c = j2;
        this.f167050d = f;
        this.f167051e = f2;
    }
}
