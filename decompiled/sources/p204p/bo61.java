package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bo61 implements tz60 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f29021a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final c9k f29022b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f29023c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ th00 f29024d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gh00 f29025e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ th00 f29026f;

    /* JADX WARN: Multi-variable type inference failed */
    public bo61(luk lukVar, gh00 gh00Var, th00 th00Var, gh00 gh00Var2, th00 th00Var2) {
        this.f29023c = (qe70) gh00Var;
        this.f29024d = th00Var;
        this.f29025e = gh00Var2;
        this.f29026f = th00Var2;
        x461 x461VarM64613f = njg1.m64613f();
        lukVar.getClass();
        this.f29022b = kk40.m56661c(cct.m32296A(lukVar, x461VarM64613f));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [p.gh00, p.qe70] */
    @Override // p204p.tz60
    /* JADX INFO: renamed from: a */
    public final Map mo30071a(Set set) {
        ConcurrentHashMap concurrentHashMap = this.f29021a;
        Iterator it = s601.m77305h0(concurrentHashMap.keySet(), set).iterator();
        while (it.hasNext()) {
            tf60 tf60Var = (tf60) concurrentHashMap.remove(it.next());
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
        }
        Set setM77305h0 = s601.m77305h0(set, concurrentHashMap.keySet());
        ArrayList arrayList = new ArrayList(i6f.m49804T(setM77305h0, 10));
        Iterator it2 = setM77305h0.iterator();
        while (it2.hasNext()) {
            arrayList.add(pft0.m69840u(it2.next(), njo.f154639a));
        }
        if (!arrayList.isEmpty()) {
            this.f29025e.invoke(arrayList);
        }
        for (Object obj : setM77305h0) {
            concurrentHashMap.put(obj, x0h1.m89578u(this.f29022b, null, 0, new ld01((gh00) this.f29023c, obj, this.f29024d, this.f29025e, (fbk) null), 3));
        }
        return nau.f152117a;
    }

    @Override // p204p.tz60
    /* JADX INFO: renamed from: c */
    public final Object mo30073c(pqm0 pqm0Var, fbk fbkVar) {
        Object objInvoke = this.f29026f.invoke(pqm0Var, fbkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }

    @Override // p204p.tz60
    public final void dispose() {
        kk40.m56680v(this.f29022b, null);
        this.f29021a.clear();
    }

    @Override // p204p.tz60
    /* JADX INFO: renamed from: b */
    public final void mo30072b(Set set) {
    }
}
