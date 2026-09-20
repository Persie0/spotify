package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dv80 extends iv80 {

    /* JADX INFO: renamed from: c */
    public static final Class f53392c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m37048d(long j, Object obj, int i) {
        List list = (List) c5a1.f34125d.m92806i(j, obj);
        if (list.isEmpty()) {
            List wy70Var = list instanceof az70 ? new wy70(i) : new ArrayList(i);
            c5a1.m31479o(obj, j, wy70Var);
            return wy70Var;
        }
        if (f53392c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            c5a1.m31479o(obj, j, arrayList);
            return arrayList;
        }
        if (!(list instanceof t3a1)) {
            return list;
        }
        wy70 wy70Var2 = new wy70(list.size() + i);
        wy70Var2.addAll((t3a1) list);
        c5a1.m31479o(obj, j, wy70Var2);
        return wy70Var2;
    }

    @Override // p204p.iv80
    /* JADX INFO: renamed from: a */
    public final void mo37049a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) c5a1.f34125d.m92806i(j, obj);
        if (list instanceof az70) {
            objUnmodifiableList = ((az70) list).mo27582g();
        } else if (f53392c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        c5a1.m31479o(obj, j, objUnmodifiableList);
    }

    @Override // p204p.iv80
    /* JADX INFO: renamed from: b */
    public final void mo37050b(Object obj, long j, Object obj2) {
        List list = (List) c5a1.f34125d.m92806i(j, obj2);
        List listM37048d = m37048d(j, obj, list.size());
        int size = listM37048d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM37048d.addAll(list);
        }
        if (size > 0) {
            list = listM37048d;
        }
        c5a1.m31479o(obj, j, list);
    }

    @Override // p204p.iv80
    /* JADX INFO: renamed from: c */
    public final List mo37051c(long j, Object obj) {
        return m37048d(j, obj, 10);
    }
}
