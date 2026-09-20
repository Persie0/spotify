package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p204p.e3b1;
import p204p.g6f;
import p204p.i6f;
import p204p.ov50;
import p204p.rwb;
import p204p.s2b1;
import p204p.s601;
import p204p.swb;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes.dex */
public final class C2702t implements InterfaceC2669q {

    /* JADX INFO: renamed from: a */
    public static final C2702t f288203a = new C2702t();

    @Override // p000.InterfaceC2669q
    /* JADX INFO: renamed from: a */
    public final ov50 mo97345a(s2b1 s2b1Var) {
        Collection collection = s2b1Var.f204961b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((swb) obj).f214637d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((swb) it.next()).f214634a);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList2);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((swb) it2.next()).f214634a);
        }
        Set setM43736n2 = g6f.m43736n1(arrayList3);
        Collection collection2 = s2b1Var.f204962c;
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(collection2, 10));
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((rwb) it3.next()).f203314a);
        }
        Set setM43736n3 = g6f.m43736n1(arrayList4);
        Set setM77305h0 = s601.m77305h0(setM43736n1, setM43736n3);
        Set setM77305h1 = s601.m77305h0(setM43736n3, setM43736n2);
        if (setM77305h0.isEmpty() && setM77305h1.isEmpty()) {
            return null;
        }
        return new e3b1(setM77305h1, setM77305h0);
    }
}
