package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class l49 implements lho {

    /* JADX INFO: renamed from: a */
    public final ArrayList f129594a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f129595b;

    public l49(ArrayList arrayList) {
        this.f129594a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((lho) it.next()).getItems(), arrayList2);
        }
        this.f129595b = arrayList2;
    }

    @Override // p204p.lho
    /* JADX INFO: renamed from: a */
    public final qho mo25349a(Map map) {
        ArrayList arrayList = this.f129594a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lho) it.next()).mo25349a(map));
        }
        return new oho(arrayList2, null);
    }

    @Override // p204p.lho
    public final List getItems() {
        return this.f129595b;
    }
}
