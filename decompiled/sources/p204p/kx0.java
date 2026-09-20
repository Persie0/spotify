package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class kx0 {

    /* JADX INFO: renamed from: b */
    public static final Set f127282b = bk5.m29624m1(new String[]{"video/webm", "video/mp4", "video/3gpp"});

    /* JADX INFO: renamed from: a */
    public final oe50 f127283a;

    public kx0(oe50 oe50Var) {
        this.f127283a = oe50Var;
    }

    /* JADX INFO: renamed from: a */
    public final jx0 m57577a(List list) {
        Object next;
        Object next2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((jhb1) next).f112383e instanceof oa6));
        jhb1 jhb1Var = (jhb1) next;
        if (jhb1Var != null) {
            String str = ((oa6) jhb1Var.f112383e).f163242a;
            this.f127283a.getClass();
            return new jx0(jhb1Var.f112384f, yif1.m93802o(str), str);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((jhb1) obj).f112383e instanceof pa6) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            jhb1 jhb1Var2 = (jhb1) obj2;
            if (f127282b.contains(jhb1Var2.f112379a) && jhb1Var2.f112382d > 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int iAbs = Math.abs(640000 - ((jhb1) next2).f112382d);
                do {
                    Object next3 = it2.next();
                    int iAbs2 = Math.abs(640000 - ((jhb1) next3).f112382d);
                    if (iAbs > iAbs2) {
                        next2 = next3;
                        iAbs = iAbs2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        jhb1 jhb1Var3 = (jhb1) next2;
        if (jhb1Var3 == null) {
            jhb1Var3 = (jhb1) g6f.m43745s0(arrayList);
        }
        if (jhb1Var3 == null) {
            return null;
        }
        return new jx0(jhb1Var3.f112384f, ((pa6) jhb1Var3.f112383e).f175403a, null);
    }
}
