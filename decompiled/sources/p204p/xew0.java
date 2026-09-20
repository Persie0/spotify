package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xew0 extends g7u {

    /* JADX INFO: renamed from: c */
    public final int f260780c;

    /* JADX INFO: renamed from: d */
    public qe10 f260781d;

    public xew0(int i) {
        super(i, 2);
        this.f260780c = i;
        this.f260781d = oe10.f164317a;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        xew0 xew0Var = new xew0(this.f260780c);
        xew0Var.f260781d = this.f260781d;
        ArrayList arrayList = this.f77354b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w6u) it.next()).mo24995a());
        }
        xew0Var.f77354b.addAll(arrayList2);
        return xew0Var;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f260781d;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f260781d = qe10Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f260781d + ", children=[\n" + m43928d() + "\n])";
    }
}
