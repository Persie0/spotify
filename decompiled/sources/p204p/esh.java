package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class esh extends cfe1 {

    /* JADX INFO: renamed from: g */
    public final gph f62395g;

    /* JADX INFO: renamed from: h */
    public final bxb f62396h = new bxb(this);

    /* JADX INFO: renamed from: i */
    public wce f62397i;

    /* JADX INFO: renamed from: j */
    public Object f62398j;

    /* JADX INFO: renamed from: k */
    public int f62399k;

    /* JADX INFO: renamed from: l */
    public final zv41 f62400l;

    /* JADX INFO: renamed from: m */
    public final zv41 f62401m;

    /* JADX INFO: renamed from: n */
    public final zv41 f62402n;

    /* JADX INFO: renamed from: o */
    public final zv41 f62403o;

    /* JADX INFO: renamed from: p */
    public final zv41 f62404p;

    public esh(gph gphVar) {
        this.f62395g = gphVar;
        lau lauVar = lau.f131415a;
        this.f62397i = new wce(lauVar);
        this.f62398j = lauVar;
        gbu gbuVar = gbu.f78413a;
        this.f62400l = jag1.m52819d(gbuVar);
        this.f62401m = jag1.m52819d(gbuVar);
        this.f62402n = jag1.m52819d(lauVar);
        this.f62403o = jag1.m52819d(gbuVar);
        this.f62404p = jag1.m52819d(0);
        gphVar.m45373e(this);
    }

    /* JADX INFO: renamed from: A */
    public final void m39910A() {
        Set setM45370b = this.f62395g.m45370b();
        boolean zIsEmpty = setM45370b.isEmpty();
        gbu gbuVar = gbu.f78413a;
        zv41 zv41Var = this.f62401m;
        if (zIsEmpty) {
            zv41Var.getClass();
            zv41Var.m97091m(null, gbuVar);
            return;
        }
        if (!lqg1.m59751q(m32632n(), n0e1.m63417Y(0, Math.max(this.f62397i.m87725c(), 1)))) {
            setM45370b = gbuVar;
        }
        zv41Var.getClass();
        zv41Var.m97091m(null, setM45370b);
    }

    @Override // p204p.ar91
    /* JADX INFO: renamed from: c */
    public final xv41 mo26922c() {
        return this.f62403o;
    }

    @Override // p204p.er91
    /* JADX INFO: renamed from: d */
    public final void mo30845d(ar91 ar91Var) {
        m32634r();
        m32635s();
    }

    @Override // p204p.nwr
    public final void dispose() {
        this.f62395g.m45373e(null);
        this.f62396h.m30799m();
    }

    @Override // p204p.ar91
    /* JADX INFO: renamed from: f */
    public final void mo26924f(int i) {
        if (i == this.f62399k) {
            return;
        }
        this.f62399k = i;
        m39913z();
    }

    @Override // p204p.ar91
    /* JADX INFO: renamed from: g */
    public final int mo26925g() {
        return this.f62395g.m45372d();
    }

    @Override // p204p.ar91
    /* JADX INFO: renamed from: h */
    public final void mo26926h() {
        m32634r();
        Iterator it = this.f62396h.m30810y().iterator();
        while (it.hasNext()) {
            ((ar91) it.next()).mo26926h();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    @Override // p204p.cfe1
    /* JADX INFO: renamed from: m */
    public final void mo30846m() {
        lho lhoVarM48173b;
        b450 b450VarM32632n = m32632n();
        Iterator it = this.f62397i.m87724b().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            uce uceVarM75295a = ((rce) it.next()).m75295a();
            if (uceVarM75295a instanceof sce) {
                ((ar91) this.f62398j.get(((sce) uceVarM75295a).m77766a())).mo26929k(this.f62397i.m87723a(i, b450VarM32632n));
            }
            i = i2;
        }
        m39913z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i3 = 0;
        for (rce rceVar : this.f62397i.m87724b()) {
            int i4 = i3 + 1;
            uce uceVarM75295a2 = rceVar.m75295a();
            if (uceVarM75295a2 instanceof tce) {
                b450 b450VarM87723a = this.f62397i.m87723a(i3, m32632n());
                int iMax = Math.max(b450VarM87723a.f278778a, 0);
                int iMin = Math.min(b450VarM87723a.f278779b, rceVar.m75296b() - 1);
                if (iMax <= iMin) {
                    while (true) {
                        iph iphVar = (iph) ((ArrayList) this.f62395g.mo45369a()).get(((tce) uceVarM75295a2).m80458a().f278778a + iMax);
                        if ((iphVar instanceof hph) && (lhoVarM48173b = ((hph) iphVar).m48173b()) != null) {
                            linkedHashSet.add(lhoVarM48173b);
                        }
                        if (iMax != iMin) {
                            iMax++;
                        }
                    }
                }
            }
            i3 = i4;
        }
        zv41 zv41Var = this.f62400l;
        zv41Var.getClass();
        zv41Var.m97091m(null, linkedHashSet);
        m39910A();
    }

    @Override // p204p.cfe1
    /* JADX INFO: renamed from: p */
    public final int mo30847p() {
        return this.f62397i.m87725c();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    @Override // p204p.cfe1
    /* JADX INFO: renamed from: q */
    public final has0 mo30848q() {
        ArrayList arrayList = new ArrayList();
        gph gphVar = this.f62395g;
        int i = 0;
        for (iph iphVar : (ArrayList) gphVar.mo45369a()) {
            if (iphVar instanceof gph) {
                arrayList.add(Integer.valueOf(((gph) iphVar).m45371c()));
                arrayList.add(Integer.valueOf(i < this.f62398j.size() ? ((ar91) this.f62398j.get(i)).mo26930l() : -1));
                i++;
            }
        }
        return new has0(0, gphVar.m45372d(), 29, arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    @Override // p204p.cfe1
    /* JADX INFO: renamed from: t */
    public final dr91 mo30849t(int i) {
        vce vceVarM87726d = this.f62397i.m87726d(i);
        if (vceVarM87726d == null) {
            throw new IllegalStateException(("Index " + i + " out of bounds (size: " + this.f62397i.m87725c() + ")").toString());
        }
        uce uceVarM75295a = ((rce) this.f62397i.m87724b().get(vceVarM87726d.m85183a())).m75295a();
        if (!(uceVarM75295a instanceof tce)) {
            if (uceVarM75295a instanceof sce) {
                return ((ar91) this.f62398j.get(((sce) uceVarM75295a).m77766a())).mo26923e(vceVarM87726d.m85184b());
            }
            throw new NoWhenBranchMatchedException();
        }
        iph iphVar = (iph) ((ArrayList) this.f62395g.mo45369a()).get(vceVarM87726d.m85184b() + ((tce) uceVarM75295a).m80458a().f278778a);
        if (!(iphVar instanceof hph)) {
            throw new IllegalStateException("Invalid chunk state: expected Item");
        }
        hph hphVar = (hph) iphVar;
        Object id = hphVar.m48174c().getId();
        xmj xmjVarM48174c = hphVar.m48174c();
        hphVar.m48175d();
        n95 n95Var = new n95();
        n95Var.f151717a = id;
        n95Var.f151718b = xmjVarM48174c;
        int iM85183a = vceVarM87726d.m85183a();
        int iM39911x = this.f62399k;
        for (int i2 = 0; i2 < iM85183a; i2++) {
            iM39911x += m39911x(i2);
        }
        return new dr91(n95Var, new eij(vceVarM87726d.m85184b() + iM39911x), null);
    }

    @Override // p204p.cfe1
    /* JADX INFO: renamed from: u */
    public final void mo32636u() {
        if (m32633o()) {
            mo30846m();
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // p204p.cfe1
    /* JADX INFO: renamed from: v */
    public final boolean mo30850v() {
        gph gphVar = this.f62395g;
        List listMo45369a = gphVar.mo45369a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listMo45369a) {
            if (obj instanceof gph) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListM30780K = this.f62396h.m30780K(arrayList);
        this.f62398j = arrayListM30780K;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM30780K, 10));
        Iterator it = arrayListM30780K.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ar91) it.next()).mo26922c());
        }
        zv41 zv41Var = this.f62402n;
        zv41Var.getClass();
        zv41Var.m97091m(null, arrayList2);
        zv41 zv41Var2 = this.f62404p;
        zv41Var2.m97091m(null, Integer.valueOf(((Number) zv41Var2.getValue()).intValue() + 1));
        ArrayList arrayList3 = new ArrayList();
        Integer numValueOf = null;
        int i = 0;
        int i2 = 0;
        for (iph iphVar : (ArrayList) gphVar.mo45369a()) {
            int i3 = i + 1;
            if (!(iphVar instanceof hph)) {
                if (!(iphVar instanceof gph)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    arrayList3.add(new rce(new tce(n0e1.m63417Y(iIntValue, i)), i - iIntValue));
                    numValueOf = null;
                }
                arrayList3.add(new rce(new sce(i2), ((ar91) this.f62398j.get(i2)).mo26920a()));
                i2++;
            } else if (numValueOf == null) {
                numValueOf = Integer.valueOf(i);
            }
            i = i3;
        }
        int size = ((ArrayList) gphVar.mo45369a()).size();
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            arrayList3.add(new rce(new tce(n0e1.m63417Y(iIntValue2, size)), size - iIntValue2));
        }
        wce wceVar = new wce(arrayList3);
        if (wceVar.equals(this.f62397i)) {
            return false;
        }
        this.f62397i = wceVar;
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: x */
    public final int m39911x(int i) {
        rce rceVar = (rce) this.f62397i.m87724b().get(i);
        uce uceVarM75295a = rceVar.m75295a();
        if (uceVarM75295a instanceof tce) {
            return rceVar.m75296b();
        }
        if (uceVarM75295a instanceof sce) {
            return ((ar91) this.f62398j.get(((sce) uceVarM75295a).m77766a())).mo26928j();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final void m39912y(ibk ibkVar) {
        zrh zrhVar;
        if (ibkVar instanceof zrh) {
            zrhVar = (zrh) ibkVar;
            int i = zrhVar.f285688c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrhVar.f285688c = i - Integer.MIN_VALUE;
            } else {
                zrhVar = new zrh(this, ibkVar);
            }
        } else {
            zrhVar = new zrh(this, ibkVar);
        }
        Object obj = zrhVar.f285686a;
        int i2 = zrhVar.f285688c;
        if (i2 == 0) {
            bga.m29073P(obj);
            wbe wbeVar = new wbe(this, null, 21);
            zrhVar.f285688c = 1;
            if (kk40.m56684z(wbeVar, zrhVar) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: z */
    public final void m39913z() {
        int i = this.f62399k;
        b450 b450VarM46713J = h6f.m46713J(this.f62397i.m87724b());
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450VarM46713J, 10));
        Iterator it = b450VarM46713J.iterator();
        while (((a450) it).f12141c) {
            arrayList.add(Integer.valueOf(m39911x(((t350) it).nextInt())));
        }
        ArrayList arrayListM41831u = fjf1.m41831u(i, arrayList);
        Iterator it2 = this.f62397i.m87724b().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            uce uceVarM75295a = ((rce) it2.next()).m75295a();
            if (uceVarM75295a instanceof sce) {
                ((ar91) this.f62398j.get(((sce) uceVarM75295a).m77766a())).mo26924f(((Number) arrayListM41831u.get(i2)).intValue());
            }
            i2 = i3;
        }
    }
}
