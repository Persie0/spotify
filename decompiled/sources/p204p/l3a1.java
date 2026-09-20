package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l3a1 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f129253a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final void m57993a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fh0 fh0Var = (fh0) it.next();
            int i = fh0Var.f69507a1;
            String str = fh0Var.f69506a;
            if (i != 2) {
                throw new IllegalArgumentException(s571.m77251j("Ad ", str, " is a managed ad and cannot be added to the registry").toString());
            }
            this.f129253a.put(str, fh0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57994b(fh0 fh0Var) {
        m57993a(geg1.m44518y(fh0Var));
    }
}
