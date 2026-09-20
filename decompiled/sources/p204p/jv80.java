package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jv80 implements hv80 {

    /* JADX INFO: renamed from: a */
    public static final Class f116286a = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m54374d(long j, Object obj, int i) {
        List listMo25687h;
        List list = (List) b5a1.f23536c.m89844k(j, obj);
        if (list.isEmpty()) {
            if (list instanceof yy70) {
                listMo25687h = new uy70(i);
            } else {
                listMo25687h = ((list instanceof cer0) && (list instanceof ae50)) ? ((ae50) list).mo25687h(i) : new ArrayList(i);
            }
            b5a1.m28169p(obj, j, listMo25687h);
            return listMo25687h;
        }
        if (f116286a.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            b5a1.m28169p(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof r3a1) {
            uy70 uy70Var = new uy70(list.size() + i);
            uy70Var.addAll((r3a1) list);
            b5a1.m28169p(obj, j, uy70Var);
            return uy70Var;
        }
        if ((list instanceof cer0) && (list instanceof ae50)) {
            ae50 ae50Var = (ae50) list;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                ae50 ae50VarMo25687h = ae50Var.mo25687h(list.size() + i);
                b5a1.m28169p(obj, j, ae50VarMo25687h);
                return ae50VarMo25687h;
            }
        }
        return list;
    }

    @Override // p204p.hv80
    /* JADX INFO: renamed from: a */
    public final void mo48724a(Object obj, long j, Object obj2) {
        List list = (List) b5a1.f23536c.m89844k(j, obj2);
        List listM54374d = m54374d(j, obj, list.size());
        int size = listM54374d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM54374d.addAll(list);
        }
        if (size > 0) {
            list = listM54374d;
        }
        b5a1.m28169p(obj, j, list);
    }

    @Override // p204p.hv80
    /* JADX INFO: renamed from: b */
    public final List mo48725b(long j, Object obj) {
        return m54374d(j, obj, 10);
    }

    @Override // p204p.hv80
    /* JADX INFO: renamed from: c */
    public final void mo48726c(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) b5a1.f23536c.m89844k(j, obj);
        if (list instanceof yy70) {
            objUnmodifiableList = ((yy70) list).mo74624g();
        } else {
            if (f116286a.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof cer0) && (list instanceof ae50)) {
                AbstractC1733c9 abstractC1733c9 = (AbstractC1733c9) ((ae50) list);
                boolean z = abstractC1733c9.f35342a;
                if (z && z) {
                    abstractC1733c9.f35342a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        b5a1.m28169p(obj, j, objUnmodifiableList);
    }
}
