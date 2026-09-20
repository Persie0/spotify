package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tfi0 extends wgm0 implements e600, t250 {

    /* JADX INFO: renamed from: R1 */
    public final nqc1 f219989R1;

    /* JADX INFO: renamed from: S1 */
    public final acm0 f219990S1;

    /* JADX INFO: renamed from: T1 */
    public final i4t0 f219991T1;

    /* JADX INFO: renamed from: U1 */
    public final b600 f219992U1;

    /* JADX INFO: renamed from: V1 */
    public xxi0 f219993V1;

    /* JADX INFO: renamed from: W1 */
    public final sfi0 f219994W1;

    /* JADX INFO: renamed from: X1 */
    public final wg61 f219995X1;

    /* JADX INFO: renamed from: Y1 */
    public final wg61 f219996Y1;

    /* JADX INFO: renamed from: Z1 */
    public final mxk f219997Z1;

    public tfi0(Map map, kgm0 kgm0Var, jgm0 jgm0Var, hgm0 hgm0Var, ggm0 ggm0Var, b8x0 b8x0Var, nqc1 nqc1Var, acm0 acm0Var, i4t0 i4t0Var, b600 b600Var, z9j0 z9j0Var, boolean z) {
        super(map, kgm0Var, jgm0Var, hgm0Var, ggm0Var, b8x0Var, z);
        this.f219989R1 = nqc1Var;
        this.f219990S1 = acm0Var;
        this.f219991T1 = i4t0Var;
        this.f219992U1 = b600Var;
        this.f219994W1 = new sfi0(this);
        this.f219995X1 = new wg61(new w0i0(this, 7));
        this.f219996Y1 = new wg61(new ye90(this, 13));
        this.f219997Z1 = lig1.m59074y(z9j0Var);
    }

    @Override // p204p.wgm0, p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        ((g480) m88059n1().mo24326a().mo15684j0(ayd1.class)).mo31540d(new ccf0(this, 1));
    }

    @Override // p204p.wgm0, p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f219993V1 = viewGroup != null ? ndg1.m64219p(viewGroup) : null;
        View viewMo877G0 = super.mo877G0(layoutInflater, viewGroup, bundle);
        if (viewMo877G0 == null) {
            return null;
        }
        kpg1.m57049v(viewMo877G0, rkk.m75763o(new w7i0(this, 4), true, -895268449));
        return viewMo877G0;
    }

    @Override // p204p.wgm0, p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        super.mo878I0();
        this.f219993V1 = null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        ((g480) m88059n1().mo24326a().mo15684j0(kyw0.class)).mo31540d(new jc5(8, view, this));
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        r4m0 r4m0VarM88059n1 = m88059n1();
        sgm0 sgm0Var = this.f251100J1;
        return new cnm0(r4m0VarM88059n1, sgm0Var != null ? sgm0Var.m78106b() : null, (Observable) this.f219996Y1.getValue()).mo2758g();
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: h1 */
    public final z5m0 mo80677h1() {
        return (nfi0) this.f219991T1.get();
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: i1 */
    public final obm0 mo80678i1(hc80 hc80Var, ofm0 ofm0Var, eh00 eh00Var) {
        Intent intent;
        m500 m500VarM49715n0 = m49715n0();
        return zdg1.m95935p(this.f219990S1, this, hc80Var, ofm0Var, eh00Var, this.f219989R1, (m500VarM49715n0 == null || (intent = m500VarM49715n0.getIntent()) == null) ? null : AbstractC2254pf.m69762e(intent), this.f219994W1);
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: j */
    public final String mo24331j() {
        cs61 cs61Var = (cs61) ((g480) m88059n1().mo24326a().mo15684j0(cs61.class)).mo31538a();
        if (cs61Var != null) {
            return cs61Var.f41480a;
        }
        return null;
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: j1 */
    public final yab mo80679j1() {
        return k0e1.m54985d((Observable) this.f219996Y1.getValue());
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: k */
    public final String mo24332k(Context context) {
        return "";
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: k1 */
    public final fiz mo80680k1() {
        return k0e1.m54985d((Observable) this.f219995X1.getValue());
    }

    @Override // p204p.zfy
    /* JADX INFO: renamed from: l */
    public final agy getF18210S1() {
        agy agyVar;
        h380 h380Var = (h380) ((g480) m88059n1().mo24326a().mo15684j0(h380.class)).mo31538a();
        return (h380Var == null || (agyVar = h380Var.f87160a) == null) ? k0e1.f118054r0 : agyVar;
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: l1 */
    public final String mo80681l1() {
        return p711.m69237p(this).f220333a.getName();
    }

    @Override // p204p.yam0
    /* JADX INFO: renamed from: m1 */
    public final mxk mo80682m1() {
        return this.f219997Z1;
    }

    @Override // p204p.t250
    /* JADX INFO: renamed from: s */
    public final void mo69809s() {
        sgm0 sgm0Var = this.f251100J1;
        obm0 obm0VarM78106b = sgm0Var != null ? sgm0Var.m78106b() : null;
        t250 t250Var = obm0VarM78106b instanceof t250 ? (t250) obm0VarM78106b : null;
        if (t250Var != null) {
            t250Var.mo69809s();
        }
    }
}
