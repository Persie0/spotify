package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class fqq0 extends exh0 implements nfs, osh {
    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        wy41 wy41Var = qiu.f189069a;
        long j = ((jiu) oqg1.m67639h(this, wy41Var)).f112825c.f221220c;
        long j2 = ((jiu) oqg1.m67639h(this, wy41Var)).f112825c.f221218a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L));
        double d = 2.0943952f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) Math.sin(d))) << 32) | (((long) Float.floatToRawIntBits(-((float) Math.cos(d)))) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 / 2.0f)) & 4294967295L);
        float fHypot = ((float) Math.hypot(fIntBitsToFloat, fIntBitsToFloat2)) / 2.0f;
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        for (int i2 = 5; i < i2; i2 = 5) {
            pqm0 pqm0Var = pvf1.f181744a[i];
            arrayList.add(new pqm0(Float.valueOf(((Number) pqm0Var.f180350a).floatValue()), new n6f(rfg1.m75456z(((Number) pqm0Var.f180351b).floatValue(), j, j2))));
            i++;
            jFloatToRawIntBits2 = jFloatToRawIntBits2;
        }
        long j3 = jFloatToRawIntBits2;
        pqm0[] pqm0VarArr = (pqm0[]) arrayList.toArray(new pqm0[0]);
        pqm0[] pqm0VarArr2 = (pqm0[]) Arrays.copyOf(pqm0VarArr, pqm0VarArr.length);
        long jM256f = Offset.m256f(j3, Offset.m258h(jFloatToRawIntBits, fHypot));
        long jM257g = Offset.m257g(j3, Offset.m258h(jFloatToRawIntBits, fHypot));
        ArrayList arrayList2 = new ArrayList(pqm0VarArr2.length);
        for (pqm0 pqm0Var2 : pqm0VarArr2) {
            arrayList2.add(new n6f(((n6f) pqm0Var2.f180351b).f150873a));
        }
        ArrayList arrayList3 = new ArrayList(pqm0VarArr2.length);
        for (pqm0 pqm0Var3 : pqm0VarArr2) {
            arrayList3.add(Float.valueOf(((Number) pqm0Var3.f180350a).floatValue()));
        }
        xk80 xk80Var = new xk80(0, jM256f, jM257g, arrayList2, arrayList3);
        wqb wqbVarM31107v = tgjVar.mo291d1().m31107v();
        wqbVarM31107v.mo25280i(q0f1.m71836j(0L, tgjVar.mo295n()), s800.m77438l());
        tgjVar.mo50174s1();
        DrawScope.m273U0(tgjVar, xk80Var, 0L, 0L, 0.0f, null, null, 5, 62);
        wqbVarM31107v.mo25279h();
    }
}
