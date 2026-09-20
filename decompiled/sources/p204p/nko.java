package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nko implements mko {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154902a = 0;

    /* JADX INFO: renamed from: b */
    public final mko f154903b;

    /* JADX INFO: renamed from: c */
    public final gh00 f154904c;

    public nko(gh00 gh00Var, mko mkoVar) {
        this.f154904c = gh00Var;
        this.f154903b = mkoVar;
    }

    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        List listSingletonList;
        switch (this.f154902a) {
            case 0:
                Iterable iterable = (Iterable) this.f154904c.invoke(obj);
                ArrayList<lho> arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f154903b.mo28634a(it.next()));
                }
                if (arrayList.isEmpty()) {
                    return new eau();
                }
                if (arrayList.size() == 1) {
                    return (lho) g6f.m43706T0(arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (lho lhoVar : arrayList) {
                    abf abfVar = lhoVar instanceof abf ? (abf) lhoVar : null;
                    if (abfVar == null || (listSingletonList = abfVar.f14103a) == null) {
                        listSingletonList = Collections.singletonList(lhoVar);
                    }
                    j6f.m52564V(listSingletonList, arrayList2);
                }
                return new abf(arrayList2);
            default:
                return this.f154903b.mo28634a(this.f154904c.invoke(obj));
        }
    }

    public nko(mko mkoVar, gh00 gh00Var) {
        this.f154903b = mkoVar;
        this.f154904c = gh00Var;
    }
}
