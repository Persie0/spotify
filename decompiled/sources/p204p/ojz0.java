package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ojz0 implements yob, pjz0, d7d1 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f166188f = AtomicReferenceFieldUpdater.newUpdater(ojz0.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a */
    public final juk f166189a;

    /* JADX INFO: renamed from: c */
    public Object f166191c;
    private volatile /* synthetic */ Object state$volatile = rjz0.f199926a;

    /* JADX INFO: renamed from: b */
    public ArrayList f166190b = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public int f166192d = -1;

    /* JADX INFO: renamed from: e */
    public Object f166193e = rjz0.f199929d;

    public ojz0(juk jukVar) {
        this.f166189a = jukVar;
    }

    @Override // p204p.yob
    /* JADX INFO: renamed from: a */
    public final void mo28626a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166188f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == rjz0.f199927b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rjz0.f199928c)) {
                    ArrayList arrayList = this.f166190b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((mjz0) it.next()).m62050a();
                    }
                    this.f166193e = rjz0.f199929d;
                    this.f166190b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p204p.d7d1
    /* JADX INFO: renamed from: b */
    public final void mo35195b(ffz0 ffz0Var, int i) {
        this.f166191c = ffz0Var;
        this.f166192d = i;
    }

    /* JADX INFO: renamed from: c */
    public final Object m67121c(ibk ibkVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166188f;
        mjz0 mjz0Var = (mjz0) atomicReferenceFieldUpdater.get(this);
        Object obj = this.f166193e;
        ArrayList<mjz0> arrayList = this.f166190b;
        if (arrayList != null) {
            for (mjz0 mjz0Var2 : arrayList) {
                if (mjz0Var2 != mjz0Var) {
                    mjz0Var2.m62050a();
                }
            }
            atomicReferenceFieldUpdater.set(this, rjz0.f199927b);
            this.f166193e = rjz0.f199929d;
            this.f166190b = null;
        }
        vh00 vh00Var = mjz0Var.f144434c;
        Object obj2 = mjz0Var.f144435d;
        Object objMo24510D0 = vh00Var.mo24510D0(mjz0Var.f144432a, obj2, obj);
        fbk fbkVar = mjz0Var.f144436e;
        return obj2 == rjz0.f199930e ? ((gh00) fbkVar).invoke(ibkVar) : ((th00) fbkVar).invoke(objMo24510D0, ibkVar);
    }

    /* JADX INFO: renamed from: d */
    public final Object m67122d(mb61 mb61Var) {
        return f166188f.get(this) instanceof mjz0 ? m67121c(mb61Var) : m67123e(mb61Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m67123e(ibk ibkVar) {
        njz0 njz0Var;
        Object obj;
        if (ibkVar instanceof njz0) {
            njz0Var = (njz0) ibkVar;
            int i = njz0Var.f154710c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njz0Var.f154710c = i - Integer.MIN_VALUE;
            } else {
                njz0Var = new njz0(this, ibkVar);
            }
        } else {
            njz0Var = new njz0(this, ibkVar);
        }
        Object obj2 = njz0Var.f154708a;
        int i2 = njz0Var.f154710c;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            njz0Var.f154710c = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(njz0Var));
            hqbVar.m48222q();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166188f;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                C2617yl c2617yl = rjz0.f199926a;
                obj = w2a1.f247311a;
                if (obj4 != c2617yl) {
                    if (!(obj4 instanceof List)) {
                        if (!(obj4 instanceof mjz0)) {
                            throw new IllegalStateException(s571.m77249h(obj4, "unexpected state: "));
                        }
                        mjz0 mjz0Var = (mjz0) obj4;
                        Object obj5 = this.f166193e;
                        vh00 vh00Var = mjz0Var.f144437f;
                        hqbVar.mo42414g(obj, vh00Var != null ? (vh00) vh00Var.mo24510D0(this, mjz0Var.f144435d, obj5) : null);
                        break;
                    }
                    if (mrx0.m62662p(atomicReferenceFieldUpdater, this, (List) obj4)) {
                        Iterator it = ((Iterable) obj4).iterator();
                        while (it.hasNext()) {
                            mjz0 mjz0VarM67124f = m67124f(it.next());
                            wj50.m88279p(mjz0VarM67124f);
                            mjz0VarM67124f.f144438g = null;
                            mjz0VarM67124f.f144439h = -1;
                            m67126h(mjz0VarM67124f, true);
                        }
                    }
                } else if (mrx0.m62661o(atomicReferenceFieldUpdater, this, obj4, hqbVar)) {
                    gga.m44674m(hqbVar, this);
                    break;
                }
            }
            Object objM48221p = hqbVar.m48221p();
            if (objM48221p == obj3) {
                obj = objM48221p;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return obj2;
        }
        bga.m29073P(obj2);
        njz0Var.f154710c = 2;
        Object objM67121c = m67121c(njz0Var);
        return objM67121c == obj3 ? obj3 : objM67121c;
    }

    /* JADX INFO: renamed from: f */
    public final mjz0 m67124f(Object obj) {
        ArrayList arrayList = this.f166190b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((mjz0) obj3).f144432a == obj) {
                obj2 = obj3;
                break;
            }
        }
        mjz0 mjz0Var = (mjz0) obj2;
        if (mjz0Var != null) {
            return mjz0Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m67125g(x4b x4bVar, th00 th00Var) {
        m67126h(new mjz0(this, x4bVar.f258037b, (vh00) x4bVar.f258038c, (vh00) x4bVar.f258039d, null, (mb61) th00Var, (vh00) x4bVar.f258040e), false);
    }

    /* JADX INFO: renamed from: h */
    public final void m67126h(mjz0 mjz0Var, boolean z) {
        Object obj = mjz0Var.f144432a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166188f;
        if (atomicReferenceFieldUpdater.get(this) instanceof mjz0) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f166190b;
            wj50.m88279p(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((mjz0) it.next()).f144432a == obj) {
                        throw new IllegalStateException(klh.m56833e(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        mjz0Var.f144433b.mo24510D0(obj, this, mjz0Var.f144435d);
        if (this.f166193e != rjz0.f199929d) {
            atomicReferenceFieldUpdater.set(this, mjz0Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f166190b;
            wj50.m88279p(arrayList2);
            arrayList2.add(mjz0Var);
        }
        mjz0Var.f144438g = this.f166191c;
        mjz0Var.f144439h = this.f166192d;
        this.f166191c = null;
        this.f166192d = -1;
    }

    /* JADX INFO: renamed from: i */
    public final int m67127i(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166188f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof fqb) {
                mjz0 mjz0VarM67124f = m67124f(obj);
                if (mjz0VarM67124f != null) {
                    vh00 vh00Var = mjz0VarM67124f.f144437f;
                    vh00 vh00Var2 = vh00Var != null ? (vh00) vh00Var.mo24510D0(this, mjz0VarM67124f.f144435d, obj2) : null;
                    fqb fqbVar = (fqb) obj3;
                    if (mrx0.m62664r(atomicReferenceFieldUpdater, this, fqbVar, mjz0VarM67124f)) {
                        this.f166193e = obj2;
                        C2617yl c2617ylMo42412C = fqbVar.mo42412C(w2a1.f247311a, vh00Var2);
                        if (c2617ylMo42412C == null) {
                            this.f166193e = rjz0.f199929d;
                            return 2;
                        }
                        fqbVar.mo42413F(c2617ylMo42412C);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (wj50.m88271j(obj3, rjz0.f199927b) || (obj3 instanceof mjz0)) {
                    return 3;
                }
                if (wj50.m88271j(obj3, rjz0.f199928c)) {
                    return 2;
                }
                if (wj50.m88271j(obj3, rjz0.f199926a)) {
                    if (mrx0.m62660n(atomicReferenceFieldUpdater, this, obj3, geg1.m44518y(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(s571.m77249h(obj3, "Unexpected state: "));
                    }
                    if (mrx0.m62663q(atomicReferenceFieldUpdater, this, (List) obj3, g6f.m43701O0(obj, (Collection) obj3))) {
                        return 1;
                    }
                }
            }
        }
    }
}
