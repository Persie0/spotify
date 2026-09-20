package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface f5i0 {
    /* JADX INFO: renamed from: a */
    n6d0 mo40761a(o6d0 o6d0Var, List list, long j);

    /* JADX INFO: renamed from: b */
    default int mo40762b(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new rlp((h6d0) list2.get(i3), 2, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo40761a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList2, e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }

    /* JADX INFO: renamed from: c */
    default int mo40763c(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new rlp((h6d0) list2.get(i3), 1, 2));
            }
            arrayList2.add(arrayList3);
        }
        return mo40761a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList2, e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    /* JADX INFO: renamed from: d */
    default int mo40764d(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new rlp((h6d0) list2.get(i3), 2, 2));
            }
            arrayList2.add(arrayList3);
        }
        return mo40761a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList2, e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    /* JADX INFO: renamed from: e */
    default int mo40765e(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new rlp((h6d0) list2.get(i3), 1, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo40761a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList2, e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }
}
