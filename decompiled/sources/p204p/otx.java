package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class otx {

    /* JADX INFO: renamed from: a */
    public final bqx f170112a;

    public otx(bqx bqxVar) {
        this.f170112a = bqxVar;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m68068a(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ife) ((up60) it.next())).mo28587A());
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = setM43736n1.iterator();
        while (it2.hasNext()) {
            aqx aqxVarM30280a = this.f170112a.m30280a((Class) it2.next());
            Integer numValueOf = aqxVarM30280a != null ? Integer.valueOf(aqxVarM30280a.mo26904b()) : null;
            if (numValueOf != null) {
                arrayList2.add(numValueOf);
            }
        }
        return arrayList2;
    }
}
