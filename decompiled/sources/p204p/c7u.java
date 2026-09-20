package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c7u extends g7u {

    /* JADX INFO: renamed from: c */
    public qe10 f35022c;

    /* JADX INFO: renamed from: d */
    public int f35023d;

    /* JADX INFO: renamed from: e */
    public int f35024e;

    public c7u() {
        super(0, 3);
        this.f35022c = oe10.f164317a;
        this.f35023d = 0;
        this.f35024e = 0;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        c7u c7uVar = new c7u();
        c7uVar.f35022c = this.f35022c;
        c7uVar.f35023d = this.f35023d;
        c7uVar.f35024e = this.f35024e;
        ArrayList arrayList = this.f77354b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w6u) it.next()).mo24995a());
        }
        c7uVar.f77354b.addAll(arrayList2);
        return c7uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f35022c;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f35022c = qe10Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m31763f() {
        return this.f35024e;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f35022c + ", horizontalAlignment=" + ((Object) ib3.m50115c(this.f35023d)) + ", verticalAlignment=" + ((Object) kb3.m55925c(this.f35024e)) + ", children=[\n" + m43928d() + "\n])";
    }
}
