package p204p;

import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class c9s0 extends rml implements w3x0 {

    /* JADX INFO: renamed from: L0 */
    public final d16 f35629L0;

    /* JADX INFO: renamed from: M0 */
    public final LinkedHashSet f35630M0;

    /* JADX INFO: renamed from: N0 */
    public rhm0 f35631N0;

    /* JADX INFO: renamed from: O0 */
    public final zv41 f35632O0;

    /* JADX INFO: renamed from: P0 */
    public final c9k f35633P0;

    /* JADX INFO: renamed from: Q0 */
    public di41 f35634Q0;

    /* JADX INFO: renamed from: R0 */
    public di41 f35635R0;

    /* JADX INFO: renamed from: S0 */
    public di41 f35636S0;

    /* JADX INFO: renamed from: T0 */
    public final zv41 f35637T0;

    /* JADX INFO: renamed from: U0 */
    public final zv41 f35638U0;

    /* JADX INFO: renamed from: V0 */
    public final zv41 f35639V0;

    /* JADX INFO: renamed from: W0 */
    public final zv41 f35640W0;

    /* JADX INFO: renamed from: X */
    public final z9q0 f35641X;

    /* JADX INFO: renamed from: X0 */
    public final lb5 f35642X0;

    /* JADX INFO: renamed from: Y */
    public final w9q0 f35643Y;

    /* JADX INFO: renamed from: Y0 */
    public final x8s0 f35644Y0;

    /* JADX INFO: renamed from: Z */
    public final ago f35645Z;

    /* JADX INFO: renamed from: d */
    public final wt80 f35646d;

    /* JADX INFO: renamed from: e */
    public final String f35647e;

    /* JADX INFO: renamed from: f */
    public final fiz f35648f;

    /* JADX INFO: renamed from: g */
    public final vml f35649g;

    /* JADX INFO: renamed from: h */
    public final qhm0 f35650h;

    /* JADX INFO: renamed from: i */
    public final Set f35651i;

    /* JADX INFO: renamed from: t */
    public final xr9 f35652t;

    public c9s0(wt80 wt80Var, String str, fiz fizVar, vml vmlVar, qhm0 qhm0Var, hg40 hg40Var, xr9 xr9Var, luk lukVar, z9q0 z9q0Var, w9q0 w9q0Var, ago agoVar, d16 d16Var, LinkedHashSet linkedHashSet) {
        this.f35646d = wt80Var;
        this.f35647e = str;
        this.f35648f = fizVar;
        this.f35649g = vmlVar;
        this.f35650h = qhm0Var;
        this.f35651i = hg40Var;
        this.f35652t = xr9Var;
        this.f35641X = z9q0Var;
        this.f35643Y = w9q0Var;
        this.f35645Z = agoVar;
        this.f35629L0 = d16Var;
        this.f35630M0 = linkedHashSet;
        zv41 zv41VarM52819d = jag1.m52819d(Boolean.FALSE);
        this.f35632O0 = zv41VarM52819d;
        this.f35633P0 = kk40.m56661c(lukVar);
        zv41 zv41VarM52819d2 = jag1.m52819d(new w8s0(this, 0));
        this.f35637T0 = zv41VarM52819d2;
        this.f35638U0 = jag1.m52819d(new ebf0());
        this.f35639V0 = zv41VarM52819d2;
        this.f35640W0 = zv41VarM52819d;
        this.f35642X0 = new lb5(7);
        this.f35644Y0 = new x8s0(this);
        m35107j();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final Object m31962n(c9s0 c9s0Var, xuk xukVar, d7m0 d7m0Var, ibk ibkVar) {
        y8s0 y8s0Var;
        ogo ogoVarMo25867c;
        ogo ogoVarMo25867c2;
        ogo ogoVar;
        List list;
        List listSingletonList;
        Iterator it;
        Object next;
        s6x0 s6x0Var;
        int i;
        d7m0 d7m0Var2 = d7m0Var;
        ago agoVar = c9s0Var.f35645Z;
        qhm0 qhm0Var = c9s0Var.f35650h;
        vml vmlVar = c9s0Var.f35649g;
        d16 d16Var = c9s0Var.f35629L0;
        if (ibkVar instanceof y8s0) {
            y8s0Var = (y8s0) ibkVar;
            int i2 = y8s0Var.f270372f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y8s0Var.f270372f = i2 - Integer.MIN_VALUE;
            } else {
                y8s0Var = new y8s0(c9s0Var, ibkVar);
            }
        } else {
            y8s0Var = new y8s0(c9s0Var, ibkVar);
        }
        Object obj = y8s0Var.f270370d;
        int i3 = y8s0Var.f270372f;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                Set setMo69906d = qhm0Var.mo69906d(d7m0Var2);
                List list2 = d7m0Var2.f46241b;
                LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(setMo69906d, c9s0Var.f35630M0);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : linkedHashSetM77309l0) {
                    if (((gww0) obj2) instanceof fww0) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (wj50.m88271j(((gww0) obj3).getKey(), e681.class)) {
                        arrayList3.add(obj3);
                    } else {
                        arrayList4.add(obj3);
                    }
                }
                ogoVarMo25867c = agoVar.mo25867c(chg1.m32789u(ehg1.m38975o(qag1.m72445i(arrayList), qag1.m72445i(arrayList3)).mo28634a(vmlVar), pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(v140.class)), 1, a3s0.f12046U0, new pko(a3s0.f12044S0), a3s0.f12047V0), a3s0.f12045T0).mo28634a(vmlVar)));
                ogoVarMo25867c2 = agoVar.mo25867c(qag1.m72445i(arrayList4).mo28634a(vmlVar));
                d16Var.mo34591j();
                d16Var.mo34589h();
                if (vmlVar.f242869b != 1 || list2.isEmpty() || ((list = ((c7m0) g6f.m43741q0(list2)).f34949b) != null && list.isEmpty())) {
                    d16Var.mo34592k();
                    break;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        d16Var.mo34592k();
                        break;
                    }
                    if (((a7m0) it2.next()).f13102a == b7m0.f24332Z) {
                        c9s0Var.f35635R0 = x0h1.m89578u(c9s0Var.f35633P0, null, 0, new a9s0(c9s0Var, null), 3);
                        break;
                    }
                }
                fbk fbkVar = null;
                try {
                    ojq[] ojqVarArr = {x0h1.m89574q(xukVar, null, 0, new mep0((vfo) ogoVarMo25867c, c9s0Var, fbkVar, 26), 3), x0h1.m89574q(xukVar, null, 0, new mep0(c9s0Var, d7m0Var2, fbkVar, 25), 3)};
                    y8s0Var.f270367a = d7m0Var2;
                    y8s0Var.f270368b = (vfo) ogoVarMo25867c;
                    y8s0Var.f270369c = (vfo) ogoVarMo25867c2;
                    y8s0Var.f270372f = 1;
                    Object objM78217n = sig1.m78217n(ojqVarArr, y8s0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM78217n == yukVar) {
                        return yukVar;
                    }
                    ogoVar = ogoVarMo25867c;
                    obj = objM78217n;
                    listSingletonList = (List) obj;
                } catch (Exception e) {
                    e = e;
                    ogoVar = ogoVarMo25867c;
                    listSingletonList = Collections.singletonList(new s6x0(new c6x0(new IOException("Exception during data load", e))));
                    it = listSingletonList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((s6x0) next).f206218a instanceof c6x0));
                    s6x0Var = (s6x0) next;
                    if (s6x0Var != null) {
                        d16Var.mo34585d(false);
                        c9s0Var.f35641X.mo33361a();
                        c9s0Var.f35643Y.mo29818a();
                        Throwable thM77348a = s6x0.m77348a(s6x0Var.f206218a);
                        wj50.m88279p(thM77348a);
                        c9s0Var.m35105h(thM77348a);
                        i = 1;
                    } else {
                        i = 1;
                        d16Var.mo34585d(true);
                        d16Var.mo34588g();
                        rhm0 rhm0VarMo69905b = qhm0Var.mo69905b(c9s0Var.f35638U0, d7m0Var2);
                        rhm0VarMo69905b.start();
                        c9s0Var.f35631N0 = rhm0VarMo69905b;
                        zv41 zv41Var = c9s0Var.f35637T0;
                        w8s0 w8s0Var = new w8s0(c9s0Var, i);
                        zv41Var.getClass();
                        zv41Var.m97091m(null, w8s0Var);
                        d16Var.mo34584c();
                        c9s0Var.m35106i();
                    }
                    ogo[] ogoVarArr = new ogo[2];
                    ogoVarArr[0] = ogoVar;
                    ogoVarArr[i] = ogoVarMo25867c2;
                    return h6f.m46715L(ogoVarArr);
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vfo vfoVar = y8s0Var.f270369c;
                vfo vfoVar2 = y8s0Var.f270368b;
                d7m0 d7m0Var3 = y8s0Var.f270367a;
                try {
                    bga.m29073P(obj);
                    ogoVarMo25867c2 = vfoVar;
                    d7m0Var2 = d7m0Var3;
                    ogoVar = vfoVar2;
                    try {
                        listSingletonList = (List) obj;
                    } catch (Exception e2) {
                        e = e2;
                        ogoVarMo25867c = ogoVar;
                        ogoVar = ogoVarMo25867c;
                        listSingletonList = Collections.singletonList(new s6x0(new c6x0(new IOException("Exception during data load", e))));
                    }
                } catch (Exception e3) {
                    e = e3;
                    ogoVarMo25867c = vfoVar2;
                    ogoVarMo25867c2 = vfoVar;
                    d7m0Var2 = d7m0Var3;
                    ogoVar = ogoVarMo25867c;
                    listSingletonList = Collections.singletonList(new s6x0(new c6x0(new IOException("Exception during data load", e))));
                    it = listSingletonList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((s6x0) next).f206218a instanceof c6x0));
                    s6x0Var = (s6x0) next;
                    if (s6x0Var != null) {
                        d16Var.mo34585d(false);
                        c9s0Var.f35641X.mo33361a();
                        c9s0Var.f35643Y.mo29818a();
                        Throwable thM77348a2 = s6x0.m77348a(s6x0Var.f206218a);
                        wj50.m88279p(thM77348a2);
                        c9s0Var.m35105h(thM77348a2);
                        i = 1;
                    } else {
                        i = 1;
                        d16Var.mo34585d(true);
                        d16Var.mo34588g();
                        rhm0 rhm0VarMo69905b2 = qhm0Var.mo69905b(c9s0Var.f35638U0, d7m0Var2);
                        rhm0VarMo69905b2.start();
                        c9s0Var.f35631N0 = rhm0VarMo69905b2;
                        zv41 zv41Var2 = c9s0Var.f35637T0;
                        w8s0 w8s0Var2 = new w8s0(c9s0Var, i);
                        zv41Var2.getClass();
                        zv41Var2.m97091m(null, w8s0Var2);
                        d16Var.mo34584c();
                        c9s0Var.m35106i();
                    }
                    ogo[] ogoVarArr2 = new ogo[2];
                    ogoVarArr2[0] = ogoVar;
                    ogoVarArr2[i] = ogoVarMo25867c2;
                    return h6f.m46715L(ogoVarArr2);
                }
            }
            it = listSingletonList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((s6x0) next).f206218a instanceof c6x0));
            s6x0Var = (s6x0) next;
            if (s6x0Var != null) {
                d16Var.mo34585d(false);
                c9s0Var.f35641X.mo33361a();
                c9s0Var.f35643Y.mo29818a();
                Throwable thM77348a3 = s6x0.m77348a(s6x0Var.f206218a);
                wj50.m88279p(thM77348a3);
                c9s0Var.m35105h(thM77348a3);
                i = 1;
            } else {
                i = 1;
                d16Var.mo34585d(true);
                d16Var.mo34588g();
                rhm0 rhm0VarMo69905b3 = qhm0Var.mo69905b(c9s0Var.f35638U0, d7m0Var2);
                rhm0VarMo69905b3.start();
                c9s0Var.f35631N0 = rhm0VarMo69905b3;
                zv41 zv41Var3 = c9s0Var.f35637T0;
                w8s0 w8s0Var3 = new w8s0(c9s0Var, i);
                zv41Var3.getClass();
                zv41Var3.m97091m(null, w8s0Var3);
                d16Var.mo34584c();
                c9s0Var.m35106i();
            }
            ogo[] ogoVarArr3 = new ogo[2];
            ogoVarArr3[0] = ogoVar;
            ogoVarArr3[i] = ogoVarMo25867c2;
            return h6f.m46715L(ogoVarArr3);
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        Iterator it = this.f35651i.iterator();
        while (it.hasNext()) {
            ((w3x0) it.next()).mo31963a(bundle);
        }
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        this.f35645Z.m25870g(this.f35644Y0);
        this.f35641X.mo33362b();
        this.f35643Y.mo29819b();
        this.f35629L0.mo34582a();
        this.f35634Q0 = x0h1.m89578u(this.f35633P0, null, 0, new iso0(this, null, 22), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f35634Q0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        di41 di41Var2 = this.f35635R0;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        di41 di41Var3 = this.f35636S0;
        if (di41Var3 != null) {
            di41Var3.mo26601e(null);
        }
        rhm0 rhm0Var = this.f35631N0;
        if (rhm0Var != null) {
            rhm0Var.stop();
        }
        this.f35641X.mo33363c();
        this.f35643Y.mo29820c();
        this.f35629L0.mo34586e();
        this.f35645Z.m25876m(this.f35644Y0);
    }

    @Override // p204p.rml
    /* JADX INFO: renamed from: k */
    public final zv41 mo31964k() {
        return this.f35640W0;
    }

    @Override // p204p.rml
    /* JADX INFO: renamed from: l */
    public final xv41 mo31965l() {
        return this.f35638U0;
    }

    @Override // p204p.rml
    /* JADX INFO: renamed from: m */
    public final zv41 mo31966m() {
        return this.f35639V0;
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Iterator it = this.f35651i.iterator();
        while (it.hasNext()) {
            bundle.putAll(((w3x0) it.next()).serialize());
        }
        return bundle;
    }
}
