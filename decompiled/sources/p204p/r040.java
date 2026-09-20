package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r040 {

    /* JADX INFO: renamed from: b */
    public static final r040 f194380b;

    /* JADX INFO: renamed from: a */
    public final List f194381a;

    static {
        new t46(13);
        f194380b = new r040(lau.f131415a);
    }

    public r040(List list) {
        this.f194381a = list;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74361c(r040 r040Var, r040 r040Var2) {
        r040Var.getClass();
        List list = r040Var2.f194381a;
        List<xe21> list2 = r040Var.f194381a;
        if (list2.isEmpty() && list.isEmpty()) {
            return true;
        }
        if (list.isEmpty() || list2.isEmpty()) {
            return false;
        }
        if (list2.equals(list)) {
            return true;
        }
        if (list2.isEmpty()) {
            return false;
        }
        for (xe21 xe21Var : list2) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (wj50.m88271j(xe21Var.f260620b, ((xe21) it.next()).f260620b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m74362a() {
        Object next;
        Iterator it = g6f.m43711Y0(this.f194381a, new kxy(7)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!bk5.m29621l0(new EnumC2166nj[]{EnumC2166nj.f154400a, EnumC2166nj.f154401b, EnumC2166nj.f154402c, EnumC2166nj.f154403d}, ((xe21) next).f260619a));
        xe21 xe21Var = (xe21) next;
        if (xe21Var != null) {
            return xe21Var.f260620b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74363b(EnumC2166nj enumC2166nj) {
        List list = this.f194381a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((xe21) it.next()).f260619a == enumC2166nj) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r040) {
            return m74361c(this, (r040) obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.f194381a.getClass().hashCode();
    }
}
