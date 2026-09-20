package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bbf implements mko {

    /* JADX INFO: renamed from: a */
    public final ArrayList f25548a;

    public bbf(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mko mkoVar = (mko) it.next();
            j6f.m52564V(mkoVar instanceof bbf ? ((bbf) mkoVar).f25548a : geg1.m44518y(mkoVar), arrayList2);
        }
        this.f25548a = arrayList2;
    }

    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        ArrayList arrayList = this.f25548a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mko) it.next()).mo28634a(obj));
        }
        return new abf(arrayList2);
    }
}
