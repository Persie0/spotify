package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cdp implements ssi {

    /* JADX INFO: renamed from: a */
    public final i4t0 f36924a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f36925b;

    /* JADX INFO: renamed from: c */
    public final ddp f36926c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f36927d;

    /* JADX INFO: renamed from: e */
    public final lwr f36928e = new lwr();

    public cdp(i4t0 i4t0Var, i4t0 i4t0Var2, ddp ddpVar, wy3 wy3Var, Scheduler scheduler) {
        this.f36924a = i4t0Var;
        this.f36925b = i4t0Var2;
        this.f36926c = ddpVar;
        this.f36927d = scheduler;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f36928e.m60129c();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap m32457c() {
        List<z6r> list = (List) nsf1.m65528n(((a7r) this.f36925b.get()).f13126a, true, false, new mgi(11));
        int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (z6r z6rVar : list) {
            pqm0 pqm0VarM69840u = pft0.m69840u(z6rVar.f279974a, Long.valueOf(z6rVar.f279975b));
            linkedHashMap.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final Observable m32458d() {
        return q0f1.m71846z(((a7r) this.f36925b.get()).f13126a, new String[]{"DeviceLastConnection"}, new mgi(10)).subscribeOn(this.f36927d).map(nwh0.f159165T0);
    }

    /* JADX INFO: renamed from: g */
    public final void m32459g(String str, eh00 eh00Var) {
        z6r z6rVar = new z6r(this.f36926c.m35754a(str), System.currentTimeMillis());
        a7r a7rVar = (a7r) this.f36925b.get();
        this.f36928e.m60127a(q0f1.m71844v(a7rVar.f13126a, new szp(15, a7rVar, z6rVar)).m23295g(new ah4(z6rVar, 26)).m23303t(this.f36927d).subscribe(new bdp(0, eh00Var)));
    }
}
