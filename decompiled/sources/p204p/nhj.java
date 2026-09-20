package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nhj implements k330, vze, l8j {

    /* JADX INFO: renamed from: a */
    public final String f154018a;

    /* JADX INFO: renamed from: b */
    public final String f154019b;

    /* JADX INFO: renamed from: c */
    public final un20 f154020c;

    /* JADX INFO: renamed from: d */
    public final t3x0 f154021d;

    /* JADX INFO: renamed from: e */
    public final ohj f154022e;

    public nhj(String str, String str2, un20 un20Var, t3x0 t3x0Var, ohj ohjVar) {
        this.f154018a = str;
        this.f154019b = str2;
        this.f154020c = un20Var;
        this.f154021d = t3x0Var;
        this.f154022e = ohjVar;
    }

    @Override // p204p.vze
    /* JADX INFO: renamed from: a */
    public final Set mo24932a() {
        return m64507c();
    }

    @Override // p204p.l8j
    /* JADX INFO: renamed from: b */
    public final Set mo47617b() {
        return m64507c();
    }

    /* JADX INFO: renamed from: c */
    public final Set m64507c() {
        ArrayList arrayList = this.f154022e.f165471a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ir50) it.next()).f104921a);
        }
        return g6f.m43736n1(arrayList2);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        ohj ohjVar = this.f154022e;
        ArrayList<ir50> arrayList = ohjVar.f165471a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (ir50 ir50Var : arrayList) {
            arrayList2.add(new v6w0(ir50Var.f104921a, ohjVar.f165472b ? lhg1.m58989p(ir50Var) : ir50Var.f104921a, null, null, null, null, 60));
        }
        qf40 qf40VarM67574x = opo.m67574x(arrayList2);
        String str = this.f154019b;
        un20 un20Var = this.f154020c;
        lhj lhjVar = new lhj(str, un20Var, qf40VarM67574x);
        String str2 = this.f154018a;
        return geg1.m44518y(un20Var != null ? new bhj(lhjVar, str2, b250Var) : new ahj(lhjVar, str2, b250Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhj)) {
            return false;
        }
        nhj nhjVar = (nhj) obj;
        return wj50.m88271j(this.f154018a, nhjVar.f154018a) && wj50.m88271j(this.f154019b, nhjVar.f154019b) && wj50.m88271j(this.f154020c, nhjVar.f154020c) && wj50.m88271j(this.f154021d, nhjVar.f154021d) && wj50.m88271j(this.f154022e, nhjVar.f154022e);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f154021d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f154018a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f154018a.hashCode() * 31, 31, this.f154019b);
        un20 un20Var = this.f154020c;
        return this.f154022e.hashCode() + j4x.m52406d(this.f154021d, (iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31);
    }
}
