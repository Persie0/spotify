package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qt50 implements mko {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f192296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f192297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vco f192298c;

    public qt50(st50 st50Var, List list, ArrayList arrayList, vco vcoVar) {
        this.f192296a = list;
        this.f192297b = arrayList;
        this.f192298c = vcoVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection] */
    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        ArrayList arrayList = this.f192297b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gue.m45745g(((izd1) it.next()).getData().mo28634a(this.f192298c)));
        }
        return new abf(g6f.m43700N0(arrayList2, this.f192296a));
    }
}
