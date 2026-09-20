package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class h6s implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final e940 f88232a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f88233b;

    /* JADX INFO: renamed from: c */
    public final c9k f88234c;

    /* JADX INFO: renamed from: d */
    public final zv41 f88235d = jag1.m52819d(nau.f152117a);

    /* JADX INFO: renamed from: e */
    public final lsi0 f88236e = msi0.m62770a();

    /* JADX INFO: renamed from: f */
    public final hb11 f88237f = j0g1.m52092t(0, 1, 0, 5);

    public h6s(e940 e940Var, i4t0 i4t0Var, luk lukVar) {
        this.f88232a = e940Var;
        this.f88233b = i4t0Var;
        this.f88234c = p3n0.m69075f(lukVar);
    }

    /* JADX INFO: renamed from: a */
    public static final l6s m46738a(h6s h6sVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (wj50.m88271j(((pqm0) obj).f180351b, p6s.f174459a)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return k6s.f119835a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((pqm0) obj2).f180351b instanceof o6s) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((pqm0) it.next()).f180350a);
            }
            return new i6s(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add((String) ((pqm0) it2.next()).f180350a);
        }
        return new j6s(arrayList4, ((o6s) ((pqm0) g6f.m43741q0(arrayList2)).f180351b).f162407a);
    }

    /* JADX INFO: renamed from: b */
    public static final String m46739b(h6s h6sVar, String str) {
        return bm51.m29801l0(wl51.m88486j1(wl51.m88484h1(str, "/"), "?"), ":", "_").concat(".jpg");
    }

    /* JADX INFO: renamed from: c */
    public final void m46740c(List list) {
        x0h1.m89578u(this.f88234c, null, 0, new w1m(list, this, (fbk) null, 1), 3);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f88234c, null);
        zv41 zv41Var = this.f88235d;
        zv41Var.getClass();
        zv41Var.m97091m(null, nau.f152117a);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
