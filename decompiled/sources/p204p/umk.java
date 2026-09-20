package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class umk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ uum0 f231887X;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g9t f231888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f231889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f231890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f231891d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nx4 f231892e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f231893f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ qf40 f231894g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ uum0 f231895h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ jc20 f231896i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ c9m f231897t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umk(g9t g9tVar, int i, float f, float f2, nx4 nx4Var, boolean z, qf40 qf40Var, uum0 uum0Var, jc20 jc20Var, c9m c9mVar, uum0 uum0Var2) {
        super(1);
        this.f231888a = g9tVar;
        this.f231889b = i;
        this.f231890c = f;
        this.f231891d = f2;
        this.f231892e = nx4Var;
        this.f231893f = z;
        this.f231894g = qf40Var;
        this.f231895h = uum0Var;
        this.f231896i = jc20Var;
        this.f231897t = c9mVar;
        this.f231887X = uum0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j = ((Offset) obj).f493a;
        float f = this.f231890c;
        float f2 = this.f231891d;
        g9t g9tVar = this.f231888a;
        int i = this.f231889b;
        g9t g9tVarM44134c = g9tVar.m44134c(f, f2, j, i);
        ArrayList arrayList = g9tVarM44134c.f77870a;
        this.f231892e.m65817c(g9tVarM44134c);
        jc20 jc20Var = this.f231896i;
        boolean z = this.f231893f;
        if (z) {
            Collection collection = this.f231894g;
            if (!collection.isEmpty()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((rp3) arrayList.get(i)).f201408a >> 32));
                uum0 uum0Var = this.f231895h;
                float fM84031v = uum0Var.m84031v();
                if (!Float.isNaN(fM84031v) && !((AbstractC2282q6) collection).isEmpty() && fM84031v != fIntBitsToFloat) {
                    float fMin = Math.min(fM84031v, fIntBitsToFloat);
                    float fMax = Math.max(fM84031v, fIntBitsToFloat);
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            float fFloatValue = ((Number) it.next()).floatValue();
                            if (fFloatValue > fMin && fFloatValue < fMax) {
                                ((ado0) jc20Var).m25615a(9);
                                break;
                            }
                        }
                    }
                }
                uum0Var.m84032w(fIntBitsToFloat);
            }
        }
        if (z && this.f231897t.m31961a()) {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((rp3) arrayList.get(i)).f201408a & 4294967295L));
            uum0 uum0Var2 = this.f231887X;
            float fM84031v2 = uum0Var2.m84031v();
            if (!Float.isNaN(fM84031v2) && fM84031v2 != fIntBitsToFloat2) {
                float fMin2 = Math.min(fM84031v2, fIntBitsToFloat2);
                float fMax2 = Math.max(fM84031v2, fIntBitsToFloat2);
                if (0.5f > fMin2 && 0.5f < fMax2) {
                    ((ado0) jc20Var).m25615a(9);
                }
            }
            uum0Var2.m84032w(fIntBitsToFloat2);
        }
        return w2a1.f247311a;
    }
}
