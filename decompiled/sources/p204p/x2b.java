package p204p;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class x2b implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final wqr f257410a;

    public x2b(File file, long j) {
        hp60 hp60Var = ywy.f277076a;
        String str = tbn0.f218907b;
        this.f257410a = new wqr(hp60Var, qbn0.m72504e(file), j, lv61.f137239l);
    }

    /* JADX INFO: renamed from: a */
    public final void m89729a() {
        wqr wqrVar = this.f257410a;
        synchronized (wqrVar) {
            try {
                wqrVar.m88779g();
                for (pqr pqrVar : (pqr[]) wqrVar.f254154i.values().toArray(new pqr[0])) {
                    wj50.m88279p(pqrVar);
                    wqrVar.m88785p(pqrVar);
                }
                wqrVar.f254138M0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89730c(auw0 auw0Var) throws NoSuchAlgorithmException {
        wqr wqrVar = this.f257410a;
        String strM83663G = upf.m83663G(auw0Var.f20037a);
        synchronized (wqrVar) {
            wqrVar.m88779g();
            wqrVar.m88775a();
            wqr.m88774s(strM83663G);
            pqr pqrVar = (pqr) wqrVar.f254154i.get(strM83663G);
            if (pqrVar == null) {
                return;
            }
            wqrVar.m88785p(pqrVar);
            if (wqrVar.f254152g <= wqrVar.f254148c) {
                wqrVar.f254138M0 = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f257410a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f257410a.flush();
    }
}
