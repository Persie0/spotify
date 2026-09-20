package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b280 implements u9m0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22519a;

    /* JADX INFO: renamed from: b */
    public final Object f22520b;

    /* JADX INFO: renamed from: c */
    public final Object f22521c;

    /* JADX INFO: renamed from: d */
    public final Object f22522d;

    /* JADX INFO: renamed from: e */
    public Object f22523e;

    /* JADX INFO: renamed from: f */
    public Object f22524f;

    public b280(e3n e3nVar, f3n f3nVar, List list) {
        this.f22519a = 0;
        this.f22520b = e3nVar;
        this.f22521c = f3nVar;
        this.f22522d = list;
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        p2m p2mVar;
        d280 d280Var;
        int i;
        b250 b250Var;
        int i2 = this.f22519a;
        Object obj = this.f22521c;
        Object obj2 = this.f22522d;
        Object obj3 = this.f22520b;
        switch (i2) {
            case 0:
                f3n f3nVar = (f3n) obj;
                switch (f3nVar.f65534a) {
                    case 0:
                        p2mVar = new p2m(new vg70((c2n) ((ik40) ((c2n) f3nVar.f65535b).f33427c).f103009e), layoutInflater, viewGroup);
                        break;
                    default:
                        p2mVar = new p2m(new vg70((c2n) ((obf0) ((c2n) f3nVar.f65535b).f33427c).f163638e), layoutInflater, viewGroup);
                        break;
                }
                p2m p2mVar2 = p2mVar;
                this.f22523e = p2mVar2;
                e3n e3nVar = (e3n) obj3;
                List list = (List) obj2;
                int i3 = e3nVar.f55827a;
                int i4 = 13;
                m761 m761Var = m761.SEE_ALL;
                switch (i3) {
                    case 0:
                        ik40 ik40Var = (ik40) ((c2n) e3nVar.f55828b).f33427c;
                        v180 v180Var = (v180) ik40Var.f103006b;
                        om0 om0Var = (om0) v180Var.f236281c.get();
                        jg31.m53271i(om0Var);
                        xm0 xm0Var = (xm0) v180Var.f236280b.get();
                        jg31.m53271i(xm0Var);
                        z9j0 z9j0Var = (z9j0) v180Var.f236287i.get();
                        jg31.m53271i(z9j0Var);
                        m500 m500Var = (m500) v180Var.f236279a.get();
                        jg31.m53271i(m500Var);
                        kv91 kv91Var = (kv91) v180Var.f236290l.get();
                        jg31.m53271i(kv91Var);
                        oyp0 oyp0Var = new oyp0(om0Var, xm0Var, z9j0Var, m500Var, new d2j0(kv91Var, m761Var));
                        v180 v180Var2 = (v180) ik40Var.f103006b;
                        rm0 rm0Var = (rm0) v180Var2.f236284f.get();
                        jg31.m53271i(rm0Var);
                        mzl mzlVar = (mzl) v180Var2.f236286h.get();
                        jg31.m53271i(mzlVar);
                        Scheduler scheduler = (Scheduler) v180Var2.f236292n.get();
                        jg31.m53271i(scheduler);
                        hun0 hun0Var = new hun0(rm0Var, mzlVar, scheduler, i4);
                        kv91 kv91Var2 = (kv91) v180Var2.f236290l.get();
                        jg31.m53271i(kv91Var2);
                        d2j0 d2j0Var = new d2j0(kv91Var2, m761Var);
                        qre0 qre0Var = (qre0) v180Var2.f236283e.get();
                        jg31.m53271i(qre0Var);
                        qp0 qp0Var = new qp0(qre0Var);
                        u180 u180Var = (u180) ik40Var.f103007c;
                        d280Var = new d280(oyp0Var, hun0Var, d2j0Var, qp0Var, pd70.m69667s(u180Var), (m761) u180Var.m49701W0().getSerializable("see_all_surface_key"), p2mVar2, list);
                        break;
                    default:
                        obf0 obf0Var = (obf0) ((c2n) e3nVar.f55828b).f33427c;
                        x180 x180Var = (x180) obf0Var.f163635b;
                        om0 om0Var2 = (om0) x180Var.f257093c.get();
                        jg31.m53271i(om0Var2);
                        xm0 xm0Var2 = (xm0) x180Var.f257092b.get();
                        jg31.m53271i(xm0Var2);
                        z9j0 z9j0Var2 = (z9j0) x180Var.f257099i.get();
                        jg31.m53271i(z9j0Var2);
                        m500 m500Var2 = (m500) x180Var.f257091a.get();
                        jg31.m53271i(m500Var2);
                        kv91 kv91Var3 = (kv91) x180Var.f257102l.get();
                        jg31.m53271i(kv91Var3);
                        oyp0 oyp0Var2 = new oyp0(om0Var2, xm0Var2, z9j0Var2, m500Var2, new d2j0(kv91Var3, m761Var));
                        x180 x180Var2 = (x180) obf0Var.f163635b;
                        rm0 rm0Var2 = (rm0) x180Var2.f257096f.get();
                        jg31.m53271i(rm0Var2);
                        mzl mzlVar2 = (mzl) x180Var2.f257098h.get();
                        jg31.m53271i(mzlVar2);
                        Scheduler scheduler2 = (Scheduler) x180Var2.f257104n.get();
                        jg31.m53271i(scheduler2);
                        hun0 hun0Var2 = new hun0(rm0Var2, mzlVar2, scheduler2, i4);
                        kv91 kv91Var4 = (kv91) x180Var2.f257102l.get();
                        jg31.m53271i(kv91Var4);
                        d2j0 d2j0Var2 = new d2j0(kv91Var4, m761Var);
                        qre0 qre0Var2 = (qre0) x180Var2.f257095e.get();
                        jg31.m53271i(qre0Var2);
                        qp0 qp0Var2 = new qp0(qre0Var2);
                        w180 w180Var = (w180) obf0Var.f163636c;
                        d280Var = new d280(oyp0Var2, hun0Var2, d2j0Var2, qp0Var2, pd70.m69667s(w180Var), (m761) w180Var.m49701W0().getSerializable("see_all_surface_key"), p2mVar2, list);
                        break;
                }
                this.f22524f = d280Var;
                break;
            default:
                up60 up60Var = hxt.f96286w;
                int i5 = 3;
                rxt rxtVarM87517y = w9h1.m87517y(((dyk0) obj3).mo37345a(new rkk0(0, (vwp) obj2, vwp.class, "retry", "retry()V", 0, 0, 23)), null, null, 3);
                int iOrdinal = ((xgj0) obj).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 4;
                        }
                    }
                } else {
                    i = 3;
                }
                hxt hxtVarM50020m = ia7.m50020m(context, viewGroup, rxtVarM87517y, new eyk0(i), null, ContentType.LONG_FORM_ON_DEMAND);
                View view = hxtVarM50020m.f96307t;
                x150 x150Var = new x150(new ird(i5, viewGroup));
                BehaviorProcessor behaviorProcessor = (BehaviorProcessor) this.f22524f;
                behaviorProcessor.getClass();
                sam0 sam0Var = new sam0(new FlowableOnBackpressureLatest(behaviorProcessor.m23356t(Functions.f7225a)));
                b250 lbfVar = fau.f67640b;
                if (x150Var.equals(lbfVar) && sam0Var.equals(lbfVar)) {
                    b250Var = lbfVar;
                } else if (x150Var.equals(lbfVar)) {
                    b250Var = sam0Var;
                } else if (!sam0Var.equals(lbfVar)) {
                    b250Var = x150Var;
                    lbfVar = new lbf(x150Var, sam0Var);
                    b250Var = lbfVar;
                }
                b250Var = x150Var;
                joc1.m53876c(view, b250Var);
                this.f22523e = hxtVarM50020m;
                break;
        }
    }

    @Override // p204p.u9m0
    public final View getView() {
        switch (this.f22519a) {
            case 0:
                p2m p2mVar = (p2m) this.f22523e;
                if (p2mVar != null) {
                    return (View) p2mVar.f173370c;
                }
                return null;
            default:
                hxt hxtVar = (hxt) this.f22523e;
                if (hxtVar != null) {
                    return hxtVar.f96307t;
                }
                return null;
        }
    }

    @Override // p204p.u9m0
    public final void start() {
        switch (this.f22519a) {
            case 0:
                d280 d280Var = (d280) this.f22524f;
                if (d280Var != null) {
                    d280Var.start();
                    return;
                } else {
                    wj50.m88260d0("presenter");
                    throw null;
                }
            default:
                ((BehaviorProcessor) this.f22524f).onNext(Boolean.TRUE);
                return;
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        switch (this.f22519a) {
            case 0:
                d280 d280Var = (d280) this.f22524f;
                if (d280Var != null) {
                    d280Var.stop();
                    return;
                } else {
                    wj50.m88260d0("presenter");
                    throw null;
                }
            default:
                ((BehaviorProcessor) this.f22524f).onNext(Boolean.FALSE);
                return;
        }
    }

    public b280(dyk0 dyk0Var, xgj0 xgj0Var, vwp vwpVar) {
        this.f22519a = 1;
        this.f22520b = dyk0Var;
        this.f22521c = xgj0Var;
        this.f22522d = vwpVar;
        this.f22524f = new BehaviorProcessor();
    }
}
