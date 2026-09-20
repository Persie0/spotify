package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface m6d0 {
    /* JADX INFO: renamed from: a */
    n6d0 mo24627a(o6d0 o6d0Var, List list, long j);

    /* JADX INFO: renamed from: b */
    default int mo24772b(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new rlp((h6d0) list.get(i2), 2, 1));
        }
        return mo24627a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList, e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }

    /* JADX INFO: renamed from: c */
    default int mo24773c(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new rlp((h6d0) list.get(i2), 1, 2));
        }
        return mo24627a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList, e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    /* JADX INFO: renamed from: d */
    default int mo24774d(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new rlp((h6d0) list.get(i2), 2, 2));
        }
        return mo24627a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList, e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    /* JADX INFO: renamed from: e */
    default int mo24775e(rj50 rj50Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new rlp((h6d0) list.get(i2), 1, 1));
        }
        return mo24627a(new ek50(rj50Var, rj50Var.getLayoutDirection()), arrayList, e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }
}
