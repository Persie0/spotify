package p204p;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class isl0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f105266a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f105267b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f105268c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final void m51544a(k35 k35Var, Object obj) {
        this.f105267b.remove(k35Var, obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m51545b(k35 k35Var, Object obj, Object obj2) {
        this.f105266a.put(k35Var, new hsl0(obj, obj2));
        Iterator it = this.f105268c.iterator();
        while (it.hasNext()) {
            ((gh00) it.next()).invoke(k35Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m51546c(k35 k35Var) {
        hsl0 hsl0Var = (hsl0) this.f105266a.get(k35Var);
        if (hsl0Var != null) {
            return hsl0Var.m48533a();
        }
        return null;
    }
}
