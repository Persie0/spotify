package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class wrf0 {

    /* JADX INFO: renamed from: a */
    public final fjf0 f254352a;

    public wrf0(fjf0 fjf0Var) {
        this.f254352a = fjf0Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88857a(Map map) {
        return m88858b(map) || wj50.m88271j(map.get("mix-type"), "only-auto");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m88858b(Map map) {
        return Boolean.parseBoolean((String) map.get("mix"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m88859c(List list) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (wj50.m88271j(((q121) it.next()).f184163a, "set-transition")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final egf0 m88860d(Map map, Map map2) {
        Object next;
        boolean z = Boolean.parseBoolean((String) map.get("not-mixable"));
        String str = (String) map.get("not-mixable.reason");
        Iterator it = eqj0.f61912e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((eqj0) next).f61913a.equals(str));
        eqj0 eqj0Var = (eqj0) next;
        if (z) {
            return new dgf0(eqj0Var);
        }
        return new cgf0(this.f254352a.f70258j || Boolean.parseBoolean((String) map2.get("can-view-transition")));
    }
}
