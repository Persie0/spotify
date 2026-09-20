package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class bm11 extends i500 implements e600, toc1, ofm0 {

    /* JADX INFO: renamed from: A1 */
    public final pvw0 f28349A1;

    /* JADX INFO: renamed from: B1 */
    public t4q0 f28350B1;

    /* JADX INFO: renamed from: C1 */
    public dm11 f28351C1;

    /* JADX INFO: renamed from: D1 */
    public k5m0 f28352D1;

    /* JADX INFO: renamed from: E1 */
    public r8a0 f28353E1;

    /* JADX INFO: renamed from: F1 */
    public flw0 f28354F1;

    /* JADX INFO: renamed from: G1 */
    public w4q0 f28355G1;

    /* JADX INFO: renamed from: H1 */
    public final amq f28356H1 = new amq();

    public bm11(pvw0 pvw0Var) {
        this.f28349A1 = pvw0Var;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f28349A1.mo24367f(this);
        super.mo875E0(context);
        c700 c700VarM49716o0 = m49716o0();
        dm11 dm11Var = this.f28351C1;
        if (dm11Var == null) {
            wj50.m88260d0("fragmentFactory");
            throw null;
        }
        c700VarM49716o0.f34649B = dm11Var;
        t4q0 t4q0Var = this.f28350B1;
        if (t4q0Var == null) {
            wj50.m88260d0("mPodcastShowPageLoaderWrapperProvider");
            throw null;
        }
        r8a0 r8a0Var = this.f28353E1;
        if (r8a0Var == null) {
            wj50.m88260d0("loadingPageIdentifierProvider");
            throw null;
        }
        w4q0 w4q0VarMo80072a = t4q0Var.mo80072a(this, r8a0Var);
        this.f28355G1 = w4q0VarMo80072a;
        this.f28356H1.m26446b(w4q0VarMo80072a);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.f98701f;
        if (bundle2 != null) {
            bundle2.putBoolean("isNewFragmentInstance", bundle == null);
        }
        w4q0 w4q0Var = this.f28355G1;
        if (w4q0Var == null) {
            wj50.m88260d0("mPodcastShowPageLoaderWrapper");
            throw null;
        }
        Context contextM49702X0 = m49702X0();
        hc80 hc80VarM49724w0 = m49724w0();
        mwx0 mwx0Var = w4q0Var.f247868a.get();
        mwx0Var.f147895b.m33099f(hc80VarM49724w0, new ccf0(w4q0Var, 6));
        zwp zwpVarM92299a = w4q0Var.f247869b.m92299a(contextM49702X0);
        zwpVarM92299a.m97153F(hc80VarM49724w0, mwx0Var);
        return zwpVarM92299a;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public final void mo3093H0() {
        this.f98702f1 = true;
        r8a0 r8a0Var = this.f28353E1;
        if (r8a0Var != null) {
            r8a0Var.m74976b();
        } else {
            wj50.m88260d0("loadingPageIdentifierProvider");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        m29791h1().m42031p(bundle, m49715n0());
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public final void mo3104P0() {
        this.f98702f1 = true;
        m29791h1().m42032q(this);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public final void mo3105Q0() {
        this.f98702f1 = true;
        m29791h1().m42033r();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        m29791h1().m42034s(this, view, bundle);
        if (bundle == null) {
            np11.m65281b(this.f98701f, new o611(this, 5));
        }
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a */
    public final voc1 getF6520f1() {
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        return mug1.m62869n(m49701W0().getString("uri", ""));
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        return m29791h1().m42024g();
    }

    /* JADX INFO: renamed from: h1 */
    public final flw0 m29791h1() {
        flw0 flw0Var = this.f28354F1;
        if (flw0Var != null) {
            return flw0Var;
        }
        wj50.m88260d0("showUbiLogger");
        throw null;
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: j */
    public final String mo24331j() {
        return "show";
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        return this.f28356H1.mo15684j0(cls);
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: k */
    public final String mo24332k(Context context) {
        return "";
    }

    @Override // p204p.zfy
    /* JADX INFO: renamed from: l */
    public final agy getF221679F1() {
        return k0e1.f118034h0;
    }
}
