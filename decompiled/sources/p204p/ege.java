package p204p;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ege implements iuz0, wtm0 {

    /* JADX INFO: renamed from: a */
    public final fge f59323a = new fge();

    /* JADX INFO: renamed from: b */
    public final ai00 f59324b;

    public ege(gh00 gh00Var) {
        this.f59324b = gh00Var;
    }

    @Override // p204p.iuz0
    /* JADX INFO: renamed from: b */
    public rr60 mo38852b(up60 up60Var) {
        jqi0 jqi0Var = (jqi0) this.f59323a.get(((ife) up60Var).mo28587A());
        Object o3bVar = jqi0Var.f114918a.get();
        if (o3bVar == null) {
            synchronized (jqi0Var) {
                o3bVar = jqi0Var.f114918a.get();
                if (o3bVar == null) {
                    o3bVar = new o3b((rr60) ((gh00) this.f59324b).invoke(up60Var));
                    jqi0Var.f114918a = new SoftReference(o3bVar);
                }
            }
        }
        return ((o3b) o3bVar).f161333a;
    }

    @Override // p204p.wtm0
    /* JADX INFO: renamed from: c */
    public Object mo38853c(up60 up60Var, ArrayList arrayList) {
        Object c6x0Var;
        jqi0 jqi0Var = (jqi0) this.f59323a.get(((ife) up60Var).mo28587A());
        Object vtm0Var = jqi0Var.f114918a.get();
        if (vtm0Var == null) {
            synchronized (jqi0Var) {
                vtm0Var = jqi0Var.f114918a.get();
                if (vtm0Var == null) {
                    vtm0Var = new vtm0();
                    jqi0Var.f114918a = new SoftReference(vtm0Var);
                }
            }
        }
        vtm0 vtm0Var2 = (vtm0) vtm0Var;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new as60((sr60) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = vtm0Var2.f244732a;
        Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                c6x0Var = (rr60) ((th00) this.f59324b).invoke(up60Var, arrayList);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            s6x0 s6x0Var = new s6x0(c6x0Var);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, s6x0Var);
            obj = objPutIfAbsent == null ? s6x0Var : objPutIfAbsent;
        }
        return ((s6x0) obj).f206218a;
    }

    public ege(th00 th00Var) {
        this.f59324b = th00Var;
    }
}
