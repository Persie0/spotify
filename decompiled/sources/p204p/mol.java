package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class mol implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final g6a0 f145696a;

    /* JADX INFO: renamed from: b */
    public final vml f145697b;

    /* JADX INFO: renamed from: c */
    public final ool f145698c;

    /* JADX INFO: renamed from: d */
    public final fc41 f145699d;

    /* JADX INFO: renamed from: e */
    public final pe50 f145700e;

    /* JADX INFO: renamed from: f */
    public final acm0 f145701f;

    /* JADX INFO: renamed from: g */
    public final bf0 f145702g;

    /* JADX INFO: renamed from: h */
    public final tqm f145703h;

    /* JADX INFO: renamed from: i */
    public final wpi0 f145704i;

    /* JADX INFO: renamed from: j */
    public final pfm0 f145705j;

    public mol(g6a0 g6a0Var, vml vmlVar, ool oolVar, fc41 fc41Var, pe50 pe50Var, acm0 acm0Var, bf0 bf0Var, ka70 ka70Var, tqm tqmVar) {
        cbm0 cbm0VarM90716V;
        this.f145696a = g6a0Var;
        this.f145697b = vmlVar;
        this.f145698c = oolVar;
        this.f145699d = fc41Var;
        this.f145700e = pe50Var;
        this.f145701f = acm0Var;
        this.f145702g = bf0Var;
        this.f145703h = tqmVar;
        wpi0 wpi0Var = new wpi0(null);
        this.f145704i = wpi0Var;
        int iM38547C = edb.m38547C(vmlVar.m86018c());
        if (iM38547C == 0) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            cbm0VarM90716V = xgg1.m90716V();
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
            cbm0VarM90716V = xgg1.m90793g0();
        }
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f145705j = new pfm0(new qfm0[]{new q040(cbm0VarM90716V, mug1.m62869n(vmlVar.getUri()), null), new sfj0(wpi0Var), new e6m0(true), new sw91(14, true, false, false), ka70Var}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m62408c(mol molVar, kvf kvfVar, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(2068882578);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(kvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(molVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            dcm0 dcm0VarMo29876h = ((rmm0) xq00Var.m91774k(q6m0.f185862a)).mo29876h();
            boolean zM91766g = xq00Var.m91766g(dcm0VarMo29876h);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = new vlq(dcm0VarMo29876h);
                xq00Var.m91793t0(objM91750T);
            }
            mam0 mam0VarM32981v = cjf1.m32981v((vlq) objM91750T, molVar.f145701f, molVar.f145702g, molVar.f145703h, xq00Var);
            rfm0 rfm0VarM57461a = kvfVar.m57461a();
            Parcelable parcelableM57462b = kvfVar.m57462b();
            tgm0 tgm0VarM61319e = mam0VarM32981v.m61319e((lyi0) xq00Var.m91774k(oyi0.f171778a));
            etz etzVarM61318d = mam0VarM32981v.m61318d();
            yab yabVarM61317c = mam0VarM32981v.m61317c();
            eh00 eh00VarM61316b = mam0VarM32981v.m61316b();
            boolean zM91770i = xq00Var.m91770i(molVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new e9l(molVar, 6);
                xq00Var.m91793t0(objM91750T2);
            }
            xq00Var2 = xq00Var;
            epv0.m39684d(rfm0VarM57461a, parcelableM57462b, tgm0VarM61319e, etzVarM61318d, yabVarM61317c, eh00VarM61316b, null, (th00) objM91750T2, xq00Var2, 1572864);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(molVar, kvfVar, i, 8);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f145705j;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return g6a0.m43685a(this.f145696a, this.f145698c, new adk(this, 20));
    }
}
