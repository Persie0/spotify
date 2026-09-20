package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dm91 {

    /* JADX INFO: renamed from: a */
    public static final fv31 f50478a = fv31.f73628b.m78183U("tv_adoption_last_shown_ts");

    /* JADX INFO: renamed from: b */
    public static final void m36403b(List list, Map map, Map map2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            api apiVar = (api) it.next();
            qi9 qi9Var = (qi9) map.get(apiVar.mo26689e());
            if (qi9Var != null) {
                yc8 yc8Var = qi9Var.f188963a;
            }
        }
    }
}
