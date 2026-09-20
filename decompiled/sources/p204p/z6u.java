package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z6u extends g7u {

    /* JADX INFO: renamed from: c */
    public qe10 f279991c;

    /* JADX INFO: renamed from: d */
    public int f279992d;

    /* JADX INFO: renamed from: e */
    public int f279993e;

    public z6u() {
        super(0, 3);
        this.f279991c = oe10.f164317a;
        this.f279992d = 0;
        this.f279993e = 0;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        z6u z6uVar = new z6u();
        z6uVar.f279991c = this.f279991c;
        z6uVar.f279992d = this.f279992d;
        z6uVar.f279993e = this.f279993e;
        ArrayList arrayList = this.f77354b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w6u) it.next()).mo24995a());
        }
        z6uVar.f77354b.addAll(arrayList2);
        return z6uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f279991c;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f279991c = qe10Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m95515f() {
        return this.f279993e;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f279991c + ", verticalAlignment=" + ((Object) kb3.m55925c(this.f279992d)) + ", horizontalAlignment=" + ((Object) ib3.m50115c(this.f279993e)) + ", children=[\n" + m43928d() + "\n])";
    }
}
