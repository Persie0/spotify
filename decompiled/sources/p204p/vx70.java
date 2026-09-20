package p204p;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vx70 implements j4t0 {

    /* JADX INFO: renamed from: a */
    public volatile Set f245635a;

    /* JADX INFO: renamed from: b */
    public volatile Set f245636b;

    @Override // p204p.j4t0
    public final Object get() {
        if (this.f245636b == null) {
            synchronized (this) {
                try {
                    if (this.f245636b == null) {
                        this.f245636b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f245635a.iterator();
                                while (it.hasNext()) {
                                    this.f245636b.add(((j4t0) it.next()).get());
                                }
                                this.f245635a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f245636b);
    }
}
