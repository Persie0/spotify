package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public abstract class b5x {

    /* JADX INFO: renamed from: a */
    public final HashMap f23778a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f23779b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public abstract void mo28213a(Object obj, Object obj2, Object... objArr);

    /* JADX INFO: renamed from: b */
    public final synchronized void m28214b(Object[] objArr, Object obj) {
        try {
            Iterator it = new ArrayList(this.f23779b).iterator();
            while (it.hasNext()) {
                mo28213a(it.next(), obj, objArr);
            }
            Iterator it2 = new HashMap(this.f23778a).entrySet().iterator();
            while (it2.hasNext()) {
                ((a5x) ((Map.Entry) it2.next()).getValue()).m24820a(objArr, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m28215c(Object obj) {
        this.f23779b.remove(obj);
        this.f23778a.remove(obj);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m28216d(Object obj) {
        if (!this.f23779b.contains(obj)) {
            this.f23779b.add(obj);
        }
    }
}
