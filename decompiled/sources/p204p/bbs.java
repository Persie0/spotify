package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bbs implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f25645a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f25646b;

    /* JADX INFO: renamed from: c */
    public final c9k f25647c;

    /* JADX INFO: renamed from: d */
    public final zv41 f25648d = jag1.m52819d(nau.f152117a);

    /* JADX INFO: renamed from: e */
    public final lsi0 f25649e = msi0.m62770a();

    /* JADX INFO: renamed from: f */
    public final hb11 f25650f = j0g1.m52092t(0, 1, 0, 5);

    public bbs(i4t0 i4t0Var, i4t0 i4t0Var2, luk lukVar) {
        this.f25645a = i4t0Var;
        this.f25646b = i4t0Var2;
        this.f25647c = p3n0.m69075f(lukVar);
    }

    /* JADX INFO: renamed from: a */
    public static final fbs m28644a(bbs bbsVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (wj50.m88271j(((pqm0) obj).f180351b, jbs.f110872a)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return ebs.f58124a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((pqm0) obj2).f180351b instanceof ibs) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((pqm0) it.next()).f180350a);
            }
            return new cbs(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add((String) ((pqm0) it2.next()).f180350a);
        }
        return new dbs(arrayList4, ((ibs) ((pqm0) g6f.m43741q0(arrayList2)).f180351b).f100658a);
    }

    /* JADX INFO: renamed from: b */
    public static final String m28645b(bbs bbsVar, String str) {
        return bm51.m29801l0(wl51.m88486j1(wl51.m88484h1(str, "/"), "?"), ":", "_").concat(".mp4");
    }

    /* JADX INFO: renamed from: c */
    public final void m28646c(List list) {
        x0h1.m89578u(this.f25647c, null, 0, new w1m(list, this, (fbk) null, 2), 3);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f25647c, null);
        zv41 zv41Var = this.f25648d;
        zv41Var.getClass();
        zv41Var.m97091m(null, nau.f152117a);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
