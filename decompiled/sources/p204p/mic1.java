package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class mic1 {

    /* JADX INFO: renamed from: a */
    public final nic1 f143998a = new nic1();

    /* JADX INFO: renamed from: a */
    public final void m61847a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        nic1 nic1Var = this.f143998a;
        if (nic1Var != null) {
            if (nic1Var.f154226d) {
                nic1.m64575a(autoCloseable);
                return;
            }
            synchronized (nic1Var.f154223a) {
                autoCloseable2 = (AutoCloseable) nic1Var.f154224b.put(str, autoCloseable);
            }
            nic1.m64575a(autoCloseable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m61848b() {
        nic1 nic1Var = this.f143998a;
        if (nic1Var != null && !nic1Var.f154226d) {
            nic1Var.f154226d = true;
            synchronized (nic1Var.f154223a) {
                try {
                    Iterator it = nic1Var.f154224b.values().iterator();
                    while (it.hasNext()) {
                        nic1.m64575a((AutoCloseable) it.next());
                    }
                    Iterator it2 = nic1Var.f154225c.iterator();
                    while (it2.hasNext()) {
                        nic1.m64575a((AutoCloseable) it2.next());
                    }
                    nic1Var.f154225c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo15620d();
    }

    /* JADX INFO: renamed from: c */
    public final AutoCloseable m61849c(String str) {
        AutoCloseable autoCloseable;
        nic1 nic1Var = this.f143998a;
        if (nic1Var == null) {
            return null;
        }
        synchronized (nic1Var.f154223a) {
            autoCloseable = (AutoCloseable) nic1Var.f154224b.get(str);
        }
        return autoCloseable;
    }

    /* JADX INFO: renamed from: d */
    public void mo15620d() {
    }
}
