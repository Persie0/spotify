package p204p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class erh implements a6a1 {

    /* JADX INFO: renamed from: a */
    public final List f62134a;

    public erh(List list) {
        this.f62134a = list;
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: b */
    public final Map mo24860b(Set set) throws DataSourceException.UnsupportedKeys {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k35 k35Var = (k35) it.next();
            Iterator it2 = this.f62134a.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((a6a1) next).mo24862e(k35Var));
            a6a1 a6a1Var = (a6a1) next;
            if (a6a1Var != null) {
                Object linkedHashSet2 = linkedHashMap.get(a6a1Var);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap.put(a6a1Var, linkedHashSet2);
                }
                ((Set) linkedHashSet2).add(k35Var);
            } else {
                linkedHashSet.add(k35Var);
            }
        }
        if (!linkedHashSet.isEmpty()) {
            throw new DataSourceException.UnsupportedKeys(linkedHashSet);
        }
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            j6f.m52564V(((a6a1) entry.getKey()).mo24860b((Set) entry.getValue()).entrySet(), arrayList);
        }
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L);
        for (Map.Entry entry2 : arrayList) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        return linkedHashMap2;
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: c */
    public final z5a1 mo24861c(gh00 gh00Var) {
        List<a6a1> list = this.f62134a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (a6a1 a6a1Var : list) {
            arrayList.add(pft0.m69840u(new vgf(a6a1Var, 22), a6a1Var.mo24861c(gh00Var)));
        }
        return new drh(arrayList);
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: e */
    public final boolean mo24862e(k35 k35Var) {
        List list = this.f62134a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((a6a1) it.next()).mo24862e(k35Var)) {
                return true;
            }
        }
        return false;
    }

    public erh(rio... rioVarArr) {
        List listM46715L = h6f.m46715L(Arrays.copyOf(rioVarArr, rioVarArr.length));
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM46715L, 10));
        Iterator it = listM46715L.iterator();
        while (it.hasNext()) {
            arrayList.add(((rio) it.next()).mo24859a());
        }
        this(arrayList);
    }
}
