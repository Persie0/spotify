package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class daz implements cm8 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f47161a = new AtomicReference();

    @Override // p204p.cm8
    /* JADX INFO: renamed from: a */
    public final void mo33367a(boolean z) {
        synchronized (faz.f67663k) {
            try {
                for (faz fazVar : new ArrayList(faz.f67664l.values())) {
                    if (fazVar.f67669e.get()) {
                        Iterator it = fazVar.f67673i.iterator();
                        while (it.hasNext()) {
                            faz fazVar2 = ((caz) it.next()).f35958a;
                            if (!z) {
                                ((fjp) fazVar2.f67672h.get()).m41855b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
