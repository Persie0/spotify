package p204p;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class w9y extends exh0 implements nfs {

    /* JADX INFO: renamed from: M0 */
    public qly0 f249285M0;

    /* JADX INFO: renamed from: N0 */
    public float f249286N0;

    /* JADX INFO: renamed from: O0 */
    public long f249287O0;

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        vum0 vum0Var;
        long j;
        char c;
        Float fValueOf = Float.valueOf(0.83f);
        Float fValueOf2 = Float.valueOf(0.55f);
        Float fValueOf3 = Float.valueOf(0.45f);
        Float fValueOf4 = Float.valueOf(0.17f);
        Float fValueOf5 = Float.valueOf(0.0f);
        Float fValueOf6 = Float.valueOf(1.0f);
        tgjVar.mo50174s1();
        long jM261b = Size.m261b(tgjVar.mo35989Z0(this.f249286N0), 0.0f, tgjVar.mo295n(), 2);
        int iOrdinal = tgjVar.getLayoutDirection().ordinal();
        if (iOrdinal == 0) {
            qly0 qly0Var = this.f249285M0;
            long j2 = this.f249287O0;
            boolean zMo28417d = qly0Var.mo28417d();
            vum0 vum0Var2 = qly0Var.f189941a;
            if (zMo28417d) {
                int i = (int) (jM261b >> 32);
                float fIntBitsToFloat = ((Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) - qly0Var.f189945e.m86437v()) - Float.intBitsToFloat(i)) + vum0Var2.m86437v();
                vum0Var = vum0Var2;
                DrawScope.m273U0(tgjVar, tm4.m81093q(new pqm0[]{new pqm0(fValueOf5, new n6f(n6f.m63765b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf2, new n6f(n6f.m63765b(j2, 0.9f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf, new n6f(j2)), new pqm0(fValueOf6, new n6f(j2))}, fIntBitsToFloat, Float.intBitsToFloat(i) + fIntBitsToFloat, 8), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM261b, 0.0f, null, null, 0, 120);
            } else {
                vum0Var = vum0Var2;
            }
            if (qly0Var.mo28416c()) {
                float fM86437v = vum0Var.m86437v();
                DrawScope.m273U0(tgjVar, tm4.m81093q(new pqm0[]{new pqm0(fValueOf5, new n6f(j2)), new pqm0(fValueOf4, new n6f(j2)), new pqm0(fValueOf3, new n6f(n6f.m63765b(j2, 0.9f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf6, new n6f(n6f.m63765b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, fM86437v, Float.intBitsToFloat((int) (jM261b >> 32)) + fM86437v, 8), (((long) Float.floatToRawIntBits(fM86437v)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM261b, 0.0f, null, null, 0, 120);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        qly0 qly0Var2 = this.f249285M0;
        long j3 = this.f249287O0;
        boolean zMo28417d2 = qly0Var2.mo28417d();
        vum0 vum0Var3 = qly0Var2.f189941a;
        if (zMo28417d2) {
            c = ' ';
            float fM86437v2 = qly0Var2.f189945e.m86437v() - vum0Var3.m86437v();
            j = j3;
            DrawScope.m273U0(tgjVar, tm4.m81093q(new pqm0[]{new pqm0(fValueOf5, new n6f(j3)), new pqm0(fValueOf4, new n6f(j3)), new pqm0(fValueOf3, new n6f(n6f.m63765b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf6, new n6f(n6f.m63765b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, fM86437v2, Float.intBitsToFloat((int) (jM261b >> 32)) + fM86437v2, 8), (((long) Float.floatToRawIntBits(fM86437v2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM261b, 0.0f, null, null, 0, 120);
        } else {
            j = j3;
            c = ' ';
        }
        if (qly0Var2.mo28416c()) {
            int i2 = (int) (jM261b >> c);
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (tgjVar.mo295n() >> c)) - vum0Var3.m86437v()) - Float.intBitsToFloat(i2);
            long j4 = j;
            DrawScope.m273U0(tgjVar, tm4.m81093q(new pqm0[]{new pqm0(fValueOf5, new n6f(n6f.m63765b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf2, new n6f(n6f.m63765b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(fValueOf, new n6f(j4)), new pqm0(fValueOf6, new n6f(j4))}, fIntBitsToFloat2, Float.intBitsToFloat(i2) + fIntBitsToFloat2, 8), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jM261b, 0.0f, null, null, 0, 120);
        }
    }
}
