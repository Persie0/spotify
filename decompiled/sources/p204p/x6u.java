package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x6u extends g7u {

    /* JADX INFO: renamed from: c */
    public qe10 f258749c;

    /* JADX INFO: renamed from: d */
    public lb3 f258750d;

    public x6u() {
        super(0, 3);
        this.f258749c = oe10.f164317a;
        this.f258750d = lb3.f131528c;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        x6u x6uVar = new x6u();
        x6uVar.f258749c = this.f258749c;
        x6uVar.f258750d = this.f258750d;
        ArrayList arrayList = this.f77354b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w6u) it.next()).mo24995a());
        }
        x6uVar.f77354b.addAll(arrayList2);
        return x6uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f258749c;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f258749c = qe10Var;
    }

    /* JADX INFO: renamed from: f */
    public final lb3 m90103f() {
        return this.f258750d;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f258749c + ", contentAlignment=" + this.f258750d + "children=[\n" + m43928d() + "\n])";
    }
}
