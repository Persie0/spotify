package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes10.dex */
public final class la8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f131296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f131297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f131298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la8(float f, float f2, boolean z) {
        super(1);
        this.f131296a = z;
        this.f131297b = f;
        this.f131298c = f2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        tgj tgjVar = (tgj) obj;
        tgjVar.mo50174s1();
        if (this.f131296a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) / 2.0f;
            float fMo35989Z0 = tgjVar.mo35989Z0(this.f131297b) + fIntBitsToFloat;
            float fMo35989Z1 = tgjVar.mo35989Z0(this.f131298c) - fIntBitsToFloat;
            long j = n6f.f150870j;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L)) / 2.0f;
            DrawScope.m275e0(tgjVar, j, fMo35989Z0, (((long) Float.floatToRawIntBits(fMo35989Z1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, 56);
        }
        return w2a1.f247311a;
    }
}
