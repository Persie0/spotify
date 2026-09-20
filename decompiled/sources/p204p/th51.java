package p204p;

import android.app.Activity;
import android.widget.LinearLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class th51 implements flc1 {

    /* JADX INFO: renamed from: a */
    public final la80 f220334a;

    /* JADX INFO: renamed from: b */
    public final kq80 f220335b;

    /* JADX INFO: renamed from: c */
    public final vg70 f220336c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f220337d;

    /* JADX INFO: renamed from: e */
    public final u6u f220338e;

    /* JADX INFO: renamed from: f */
    public final a34 f220339f;

    /* JADX INFO: renamed from: g */
    public final luk f220340g;

    /* JADX INFO: renamed from: h */
    public wh51 f220341h;

    /* JADX INFO: renamed from: i */
    public final ykn f220342i;

    /* JADX INFO: renamed from: j */
    public final iwr f220343j;

    /* JADX INFO: renamed from: k */
    public final zv41 f220344k;

    /* JADX INFO: renamed from: l */
    public r9g1 f220345l;

    /* JADX INFO: renamed from: m */
    public c9k f220346m;

    /* JADX INFO: renamed from: n */
    public final zv41 f220347n;

    /* JADX INFO: renamed from: o */
    public boolean f220348o;

    /* JADX INFO: renamed from: p */
    public final zux f220349p;

    /* JADX INFO: renamed from: q */
    public final by31 f220350q;

    public th51(Activity activity, la80 la80Var, kq80 kq80Var, a9o a9oVar, vg70 vg70Var, Scheduler scheduler, u6u u6uVar, a34 a34Var, luk lukVar) {
        this.f220334a = la80Var;
        this.f220335b = kq80Var;
        this.f220336c = vg70Var;
        this.f220337d = scheduler;
        this.f220338e = u6uVar;
        this.f220339f = a34Var;
        this.f220340g = lukVar;
        z4n z4nVar = (z4n) a9oVar.f13609a.f175012b;
        men menVar = (men) z4nVar.f279302b;
        son sonVar = menVar.f142767a;
        om0 om0Var = (om0) sonVar.f212079fl.get();
        jg31.m53271i(om0Var);
        a531 a531VarM95358V0 = z4nVar.m95358V0();
        xm0 xm0Var = (xm0) sonVar.f211919a.f18279A1.get();
        jg31.m53271i(xm0Var);
        otn otnVar = menVar.f142768b;
        Activity activity2 = (Activity) otnVar.f169701f.f246642a;
        jg31.m53271i(activity2);
        z9j0 z9j0Var = (z9j0) otnVar.f169565X.get();
        jg31.m53271i(z9j0Var);
        dc31 dc31Var = new dc31(om0Var, a531VarM95358V0, xm0Var, activity2, z9j0Var);
        men menVar2 = (men) z4nVar.f279302b;
        son sonVar2 = menVar2.f142767a;
        l35 l35Var = (l35) sonVar2.f211919a.f18423Q1.get();
        jg31.m53271i(l35Var);
        bji bjiVar = (bji) sonVar2.f212567y1.get();
        jg31.m53271i(bjiVar);
        po10 po10Var = new po10(24, l35Var, new sc4(bjiVar));
        qre0 qre0Var = (qre0) menVar2.f142767a.f212305o2.get();
        jg31.m53271i(qre0Var);
        m600 m600Var = new m600(29, po10Var, new mzl(qre0Var));
        a531 a531VarM95358V1 = z4nVar.m95358V0();
        son sonVar3 = menVar2.f142767a;
        qre0 qre0Var2 = (qre0) sonVar3.f212305o2.get();
        jg31.m53271i(qre0Var2);
        qp0 qp0Var = new qp0(qre0Var2);
        Flowable flowable = (Flowable) sonVar3.f211306D4.get();
        jg31.m53271i(flowable);
        Scheduler scheduler2 = (Scheduler) sonVar3.f212489v1.get();
        jg31.m53271i(scheduler2);
        xre xreVar = (xre) sonVar3.f211251B1.get();
        jg31.m53271i(xreVar);
        FlowableMap flowableMapM23331J = flowable.m23348j(new idp0(32L, scheduler2, xreVar)).m23360y(axq0.f20955R0).m23331J(bxq0.f31946Q0);
        Scheduler scheduler3 = (Scheduler) sonVar3.f212489v1.get();
        jg31.m53271i(scheduler3);
        this.f220342i = new ykn(this, dc31Var, m600Var, a531VarM95358V1, qp0Var, flowableMapM23331J, scheduler3);
        this.f220343j = new iwr();
        zv41 zv41VarM52819d = jag1.m52819d(Boolean.FALSE);
        this.f220344k = zv41VarM52819d;
        zv41 zv41VarM52819d2 = jag1.m52819d(t6u.f217606a);
        this.f220347n = zv41VarM52819d2;
        this.f220349p = new zux(zv41VarM52819d, zv41VarM52819d2, new w30(this, (fbk) null, 12), 1);
        this.f220350q = new by31(19, this, activity);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        c9k c9kVar = this.f220346m;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f220346m = null;
        this.f220348o = false;
        ((lwr) this.f220342i.f273763i).m60129c();
        this.f220343j.m51847a();
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: b */
    public final void mo26657b() {
        this.f220336c.f241177g = this;
        c9k c9kVarM56661c = kk40.m56661c(this.f220340g);
        this.f220346m = c9kVarM56661c;
        fbk fbkVar = null;
        if (!this.f220348o) {
            this.f220348o = true;
            x0h1.m89578u(c9kVarM56661c, null, 0, new rh51(this, fbkVar, 1), 3);
        }
        x0h1.m89578u(c9kVarM56661c, null, 0, new rh51(this, fbkVar, 2), 3);
    }

    /* JADX INFO: renamed from: d */
    public final void m80828d(r9g1 r9g1Var) {
        if (r9g1Var instanceof uh51) {
            wh51 wh51Var = this.f220341h;
            if (wh51Var == null) {
                wj50.m88260d0("binding");
                throw null;
            }
            ((LinearLayout) wh51Var.f251262b).setVisibility(8);
            Boolean bool = Boolean.TRUE;
            zv41 zv41Var = this.f220344k;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
            return;
        }
        if (!(r9g1Var instanceof vh51)) {
            throw new NoWhenBranchMatchedException();
        }
        wh51 wh51Var2 = this.f220341h;
        if (wh51Var2 == null) {
            wj50.m88260d0("binding");
            throw null;
        }
        ((LinearLayout) wh51Var2.f251262b).setVisibility(0);
        this.f220336c.mo45325C(((vh51) r9g1Var).f241415d);
    }

    @Override // p204p.flc1
    public final fiz getShow() {
        return this.f220349p;
    }

    @Override // p204p.flc1
    /* JADX INFO: renamed from: l */
    public final gh00 mo41993l() {
        return this.f220350q;
    }
}
