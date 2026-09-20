package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tmd0 extends wmd0 {

    /* JADX INFO: renamed from: w */
    public final ArrayList f221664w;

    /* JADX INFO: renamed from: x */
    public final uj5 f221665x;

    public tmd0(vmd0 vmd0Var, String str, String str2) {
        super(vmd0Var, str, str2, false);
        this.f221664w = new ArrayList();
        this.f221665x = new uj5(0);
    }

    /* JADX INFO: renamed from: m */
    public final int m81124m(wmd0 wmd0Var) {
        xld0 xld0Var = (xld0) this.f221665x.get(wmd0Var.f252812c);
        if (xld0Var != null) {
            return xld0Var.f263106b;
        }
        return 4;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m81125n() {
        zmd0.m96426b();
        return zmd0.m96427c().m61666e().contains(this);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m81126o(wmd0 wmd0Var) {
        xld0 xld0Var = (xld0) this.f221665x.get(wmd0Var.f252812c);
        return xld0Var != null && xld0Var.f263108d;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m81127p(wmd0 wmd0Var) {
        xld0 xld0Var = (xld0) this.f221665x.get(wmd0Var.f252812c);
        return xld0Var != null && xld0Var.f263107c;
    }

    /* JADX INFO: renamed from: q */
    public final void m81128q(Collection collection) {
        wmd0 wmd0Var;
        this.f252831v.clear();
        ArrayList arrayList = this.f221664w;
        arrayList.clear();
        uj5 uj5Var = this.f221665x;
        uj5Var.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xld0 xld0Var = (xld0) it.next();
            String strM81050g = xld0Var.f263105a.m81050g();
            Iterator it2 = this.f252810a.f242785b.iterator();
            do {
                if (!it2.hasNext()) {
                    wmd0Var = null;
                    break;
                }
                wmd0Var = (wmd0) it2.next();
            } while (!wmd0Var.f252811b.equals(strM81050g));
            if (wmd0Var != null) {
                arrayList.add(wmd0Var);
                uj5Var.put(wmd0Var.f252812c, xld0Var);
                int i = xld0Var.f263106b;
                if (i == 2 || i == 3) {
                    this.f252831v.add(wmd0Var);
                }
            }
        }
        zmd0.m96427c().f143259a.m38769b(259, this);
    }
}
