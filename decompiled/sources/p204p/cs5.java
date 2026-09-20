package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes10.dex */
public final class cs5 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f41469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f41470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f41471c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f41472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs5(boolean z, float f, float f2, float f3) {
        super(1);
        this.f41469a = z;
        this.f41470b = f;
        this.f41471c = f2;
        this.f41472d = f3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        tgj tgjVar = (tgj) obj;
        tgjVar.mo50174s1();
        if (this.f41469a) {
            float fMo35989Z0 = tgjVar.mo35989Z0(this.f41470b) / 2.0f;
            float fMo35989Z1 = tgjVar.mo35989Z0(this.f41471c) + fMo35989Z0;
            float fMo35989Z2 = tgjVar.mo35989Z0(this.f41472d) - fMo35989Z0;
            DrawScope.m275e0(tgjVar, n6f.f150870j, fMo35989Z1, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMo35989Z2) << 32), 0.0f, null, 56);
        }
        return w2a1.f247311a;
    }
}
