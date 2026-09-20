package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class pgl implements yh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ovh0 f177360b;

    public /* synthetic */ pgl(ovh0 ovh0Var, int i) {
        this.f177359a = i;
        this.f177360b = ovh0Var;
    }

    @Override // p204p.yh00
    public final Object apply(Object obj) {
        switch (this.f177359a) {
            case 0:
                ArrayList arrayListM68132b = this.f177360b.m68132b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM68132b) {
                    if (obj2 instanceof nhj) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((nhj) it.next()).m64507c(), arrayList2);
                }
                return g6f.m43736n1(arrayList2);
            default:
                ArrayList arrayListM68132b2 = this.f177360b.m68132b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayListM68132b2) {
                    if (obj3 instanceof q8x0) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    j6f.m52564V(((q8x0) it2.next()).mo72177c(), arrayList4);
                }
                return g6f.m43736n1(arrayList4);
        }
    }
}
