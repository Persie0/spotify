package p204p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vp21 implements r4m0 {

    /* JADX INFO: renamed from: i */
    public static final voc1 f243572i;

    /* JADX INFO: renamed from: a */
    public final Activity f243573a;

    /* JADX INFO: renamed from: b */
    public final doh f243574b;

    /* JADX INFO: renamed from: c */
    public final n6q f243575c;

    /* JADX INFO: renamed from: d */
    public final q831 f243576d;

    /* JADX INFO: renamed from: e */
    public final xp21 f243577e;

    /* JADX INFO: renamed from: f */
    public final k5m0 f243578f;

    /* JADX INFO: renamed from: g */
    public final tp21 f243579g;

    /* JADX INFO: renamed from: h */
    public final pfm0 f243580h;

    static {
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        f243572i = mug1.m62869n("spotify:internal:sleep-timer");
    }

    public vp21(Activity activity, doh dohVar, n6q n6qVar, q831 q831Var, xp21 xp21Var, k5m0 k5m0Var, tp21 tp21Var) {
        this.f243573a = activity;
        this.f243574b = dohVar;
        this.f243575c = n6qVar;
        this.f243576d = q831Var;
        this.f243577e = xp21Var;
        this.f243578f = k5m0Var;
        this.f243579g = tp21Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f243580h = new pfm0(new qfm0[]{new q040(xgg1.m90808i1(), f243572i, null), new fda(null, bda.f26062b, null, 0, null, n6qVar, false, false, true, 1757), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m86112c(vp21 vp21Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xp21 xp21Var = vp21Var.f243577e;
        xq00Var.m91775k0(-338548515);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(vp21Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            tp21 tp21Var = vp21Var.f243579g;
            String strM91577o = xp21Var.m91577o();
            zo21 zo21VarM91576c = xp21Var.m91576c();
            boolean zM91770i = xq00Var.m91770i(vp21Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new lp21(vp21Var, 2);
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            mif1.m61869b(tp21Var, new rp21(strM91577o, zo21VarM91576c, (gh00) objM91750T), null, null, xq00Var2, 0, 12);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lvs0(vp21Var, i, 15);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f243580h;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f243574b.m36532a(rkk.m75763o(new g511(this, 23), true, -484562737));
    }
}
