package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wcp {

    /* JADX INFO: renamed from: a */
    public final BehaviorSubject f250083a = BehaviorSubject.m23796g(lau.f131415a);

    /* JADX INFO: renamed from: a */
    public final synchronized void m87750a(String str) {
        try {
            List list = (List) this.f250083a.m23798h();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!wj50.m88271j(((ntt0) obj).m65639a().f283727a.name(), str)) {
                        arrayList.add(obj);
                    }
                }
                this.f250083a.onNext(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m87751b(zke0 zke0Var, gh00 gh00Var) {
        try {
            List list = (List) this.f250083a.m23798h();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ntt0) obj).m65639a().f283727a != zke0Var.f283727a) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(new ntt0(zke0Var, gh00Var));
                this.f250083a.onNext(arrayList2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zke0Var.f283727a.name();
    }
}
