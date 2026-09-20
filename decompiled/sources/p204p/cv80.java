package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cv80 extends gv80 {

    /* JADX INFO: renamed from: c */
    public static final Class f42334c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m33979d(long j, Object obj, int i) {
        List listMo46604h;
        List list = (List) a5a1.f12473d.m87173i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof xy70) {
                listMo46604h = new ty70(i);
            } else {
                listMo46604h = ((list instanceof ber0) && (list instanceof zd50)) ? ((zd50) list).mo46604h(i) : new ArrayList(i);
            }
            a5a1.m24792o(obj, j, listMo46604h);
            return listMo46604h;
        }
        if (f42334c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            a5a1.m24792o(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof q3a1) {
            ty70 ty70Var = new ty70(list.size() + i);
            ty70Var.addAll((q3a1) list);
            a5a1.m24792o(obj, j, ty70Var);
            return ty70Var;
        }
        if ((list instanceof ber0) && (list instanceof zd50)) {
            zd50 zd50Var = (zd50) list;
            if (!((AbstractC1696b9) zd50Var).f24728a) {
                zd50 zd50VarMo46604h = zd50Var.mo46604h(list.size() + i);
                a5a1.m24792o(obj, j, zd50VarMo46604h);
                return zd50VarMo46604h;
            }
        }
        return list;
    }

    @Override // p204p.gv80
    /* JADX INFO: renamed from: a */
    public final void mo33980a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) a5a1.f12473d.m87173i(j, obj);
        if (list instanceof xy70) {
            objUnmodifiableList = ((xy70) list).mo72067g();
        } else {
            if (f42334c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ber0) && (list instanceof zd50)) {
                AbstractC1696b9 abstractC1696b9 = (AbstractC1696b9) ((zd50) list);
                if (abstractC1696b9.f24728a) {
                    abstractC1696b9.f24728a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        a5a1.m24792o(obj, j, objUnmodifiableList);
    }

    @Override // p204p.gv80
    /* JADX INFO: renamed from: b */
    public final void mo33981b(Object obj, long j, Object obj2) {
        List list = (List) a5a1.f12473d.m87173i(j, obj2);
        List listM33979d = m33979d(j, obj, list.size());
        int size = listM33979d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM33979d.addAll(list);
        }
        if (size > 0) {
            list = listM33979d;
        }
        a5a1.m24792o(obj, j, list);
    }

    @Override // p204p.gv80
    /* JADX INFO: renamed from: c */
    public final List mo33982c(long j, Object obj) {
        return m33979d(j, obj, 10);
    }
}
