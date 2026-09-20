package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class viz {

    /* JADX INFO: renamed from: a */
    public final scm f241826a;

    /* JADX INFO: renamed from: b */
    public final jsa f241827b;

    /* JADX INFO: renamed from: c */
    public final v50 f241828c;

    /* JADX INFO: renamed from: d */
    public final xuk f241829d;

    /* JADX INFO: renamed from: e */
    public final zv41 f241830e;

    /* JADX INFO: renamed from: f */
    public final nuu0 f241831f;

    /* JADX INFO: renamed from: g */
    public final zv41 f241832g;

    /* JADX INFO: renamed from: h */
    public final nuu0 f241833h;

    /* JADX INFO: renamed from: i */
    public final zv41 f241834i;

    /* JADX INFO: renamed from: j */
    public final nuu0 f241835j;

    /* JADX INFO: renamed from: k */
    public di41 f241836k;

    /* JADX INFO: renamed from: l */
    public jcm f241837l;

    public viz(scm scmVar, jsa jsaVar, v50 v50Var, xuk xukVar) {
        this.f241826a = scmVar;
        this.f241827b = jsaVar;
        this.f241828c = v50Var;
        this.f241829d = xukVar;
        zv41 zv41VarM52819d = jag1.m52819d(new anz(lau.f131415a, nau.f152117a, false));
        this.f241830e = zv41VarM52819d;
        this.f241831f = bzf1.m31021m(zv41VarM52819d);
        zv41 zv41VarM52819d2 = jag1.m52819d(null);
        this.f241832g = zv41VarM52819d2;
        this.f241833h = bzf1.m31021m(zv41VarM52819d2);
        zv41 zv41VarM52819d3 = jag1.m52819d(null);
        this.f241834i = zv41VarM52819d3;
        this.f241835j = bzf1.m31021m(zv41VarM52819d3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m85671a(viz vizVar, siz sizVar) {
        anz anzVarM26539a;
        zv41 zv41Var = vizVar.f241830e;
        anz anzVar = (anz) zv41Var.getValue();
        boolean z = sizVar instanceof riz;
        if (z) {
            anzVarM26539a = anz.m26539a(anzVar, null, g6f.m43701O0(((riz) sizVar).f199654a, anzVar.f17526b), false, 1);
        } else {
            if (!(sizVar instanceof qiz) && !(sizVar instanceof piz)) {
                throw new NoWhenBranchMatchedException();
            }
            anzVarM26539a = anz.m26539a(anzVar, null, null, false, 3);
        }
        zv41Var.m97091m(null, anzVarM26539a);
        if (z) {
            return;
        }
        if (sizVar instanceof qiz) {
            vizVar.f241832g.m97090l(((qiz) sizVar).f189098a);
        } else {
            if (!(sizVar instanceof piz)) {
                throw new NoWhenBranchMatchedException();
            }
            zv41 zv41Var2 = vizVar.f241834i;
            fjz fjzVar = ((piz) sizVar).f178085a;
            zv41Var2.getClass();
            zv41Var2.m97091m(null, fjzVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r9 == r4) goto L33;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m85672b(viz vizVar, List list, Map map, xmz xmzVar, ibk ibkVar) {
        uiz uizVar;
        if (ibkVar instanceof uiz) {
            uizVar = (uiz) ibkVar;
            int i = uizVar.f230843f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uizVar.f230843f = i - Integer.MIN_VALUE;
            } else {
                uizVar = new uiz(vizVar, ibkVar);
            }
        } else {
            uizVar = new uiz(vizVar, ibkVar);
        }
        Object objM77805a = uizVar.f230841d;
        int i2 = uizVar.f230843f;
        Object obj = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    xmzVar = uizVar.f230840c;
                    map = uizVar.f230839b;
                    list = uizVar.f230838a;
                    bga.m29073P(objM77805a);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM77805a);
                }
                return (siz) objM77805a;
            }
            bga.m29073P(objM77805a);
            scm scmVar = vizVar.f241826a;
            uizVar.f230838a = list;
            uizVar.f230839b = map;
            uizVar.f230840c = xmzVar;
            uizVar.f230843f = 1;
            objM77805a = scmVar.m77805a(xmzVar);
            if (objM77805a == obj) {
            }
            return obj;
            w151 w151Var = (w151) objM77805a;
            if (w151Var instanceof v151) {
                return vizVar.m85676f(list, ((v151) w151Var).f236260a);
            }
            if (!wj50.m88271j(w151Var, u151.f225685a)) {
                throw new NoWhenBranchMatchedException();
            }
            uizVar.f230838a = null;
            uizVar.f230839b = null;
            uizVar.f230840c = null;
            uizVar.f230843f = 2;
            objM77805a = vizVar.m85674d(list, map, xmzVar, uizVar);
        } catch (Exception e) {
            qlg1.m73220y(uizVar.getContext());
            return new piz(new fjz(e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85673c() {
        zv41 zv41Var;
        Object value;
        di41 di41Var = this.f241836k;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f241836k = null;
        do {
            zv41Var = this.f241830e;
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, anz.m26539a((anz) value, null, null, false, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: d */
    public final Object m85674d(List list, Map map, xmz xmzVar, ibk ibkVar) {
        tiz tizVar;
        if (ibkVar instanceof tiz) {
            tizVar = (tiz) ibkVar;
            int i = tizVar.f220769c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tizVar.f220769c = i - Integer.MIN_VALUE;
            } else {
                tizVar = new tiz(this, ibkVar);
            }
        } else {
            tizVar = new tiz(this, ibkVar);
        }
        Object objM54214c = tizVar.f220767a;
        int i2 = tizVar.f220769c;
        if (i2 == 0) {
            bga.m29073P(objM54214c);
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new c251(((x151) it.next()).f257068a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!map.containsKey(new c251(((c251) obj).f33300a))) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException(edb.m38564m("Missing results for steps: ", g6f.m43753y0(arrayList2, null, null, null, tcz.f219170Q0, 31)).toString());
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = ((x151) it2.next()).f257068a;
                Object obj2 = map.get(new c251(str));
                if (obj2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList3.add(new suf(str, (f251) obj2));
            }
            jcm jcmVar = xmzVar.f263470a;
            tizVar.f220769c = 1;
            objM54214c = this.f241827b.m54214c(jcmVar, arrayList3, tizVar);
            yuk yukVar = yuk.f276404a;
            if (objM54214c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM54214c);
        }
        return new qiz((imz) objM54214c);
    }

    /* JADX INFO: renamed from: e */
    public final void m85675e() {
        di41 di41Var = this.f241836k;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f241834i.m97090l(null);
        zv41 zv41Var = this.f241830e;
        anz anzVar = (anz) zv41Var.getValue();
        jcm jcmVar = this.f241837l;
        if (jcmVar == null) {
            wj50.m88260d0("input");
            throw null;
        }
        List<x151> list = anzVar.f17526b;
        Map map = anzVar.f17525a;
        ArrayList arrayList = new ArrayList();
        for (x151 x151Var : list) {
            f251 f251Var = (f251) map.get(new c251(x151Var.f257068a));
            suf sufVar = f251Var != null ? new suf(x151Var.f257068a, f251Var) : null;
            if (sufVar != null) {
                arrayList.add(sufVar);
            }
        }
        xmz xmzVar = new xmz(jcmVar, arrayList);
        anz anzVarM26539a = anz.m26539a(anzVar, null, null, true, 3);
        zv41Var.getClass();
        zv41Var.m97091m(null, anzVarM26539a);
        di41 di41VarM89578u = x0h1.m89578u(this.f241829d, null, 2, new gnq(this, anzVar, xmzVar, fbkVar, 9), 1);
        this.f241836k = di41VarM89578u;
        di41VarM89578u.start();
    }

    /* JADX INFO: renamed from: f */
    public final riz m85676f(List list, x151 x151Var) {
        m85677g(x151Var);
        String str = x151Var.f257068a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (wj50.m88271j(((x151) it.next()).f257068a, str)) {
                    throw new IllegalStateException(edb.m38564m("Duplicate step key: ", str).toString());
                }
            }
        }
        return new riz(x151Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m85677g(x151 x151Var) {
        String str = x151Var.f257068a;
        d251 d251Var = x151Var.f257069b;
        if (wl51.m88460J0(str)) {
            throw new IllegalStateException("Step key must not be blank");
        }
        if (!this.f241828c.f237274a.containsKey(d251Var.getClass())) {
            throw new IllegalStateException("Unknown step parameters: ".concat(d251Var.getClass().getName()).toString());
        }
        f251 f251Var = x151Var.f257070c;
        if (f251Var != null && !d251Var.mo34688c1(f251Var)) {
            throw new IllegalStateException(edb.m38566o("Unexpected result ", f251Var.getClass().getName(), " for step ", x151Var.f257068a).toString());
        }
    }
}
