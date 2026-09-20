package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class dh00 {

    /* JADX INFO: renamed from: a */
    public final Executor f48933a;

    /* JADX INFO: renamed from: c */
    public boolean f48935c;

    /* JADX INFO: renamed from: b */
    public final Object f48934b = new Object();

    /* JADX INFO: renamed from: d */
    public final ArrayList f48936d = new ArrayList();

    public dh00(Executor executor, awf awfVar) {
        this.f48933a = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m35955a() {
        synchronized (this.f48934b) {
            try {
                this.f48935c = true;
                Iterator it = this.f48936d.iterator();
                while (it.hasNext()) {
                    ((eh00) it.next()).invoke();
                }
                this.f48936d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35956b() {
        boolean z;
        synchronized (this.f48934b) {
            z = this.f48935c;
        }
        return z;
    }
}
