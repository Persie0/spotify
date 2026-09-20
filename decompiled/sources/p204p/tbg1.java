package p204p;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class tbg1 extends fwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f218852b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f218853c;

    public tbg1(i8v i8vVar) {
        this.f218853c = i8vVar;
    }

    @Override // p204p.fwf1
    /* JADX INFO: renamed from: a */
    public final void mo42966a() {
        switch (this.f218852b) {
            case 0:
                qrg1 qrg1Var = (qrg1) this.f218853c;
                synchronized (qrg1Var.f191842f) {
                    try {
                        if (qrg1Var.f191847k.get() > 0 && qrg1Var.f191847k.decrementAndGet() > 0) {
                            qrg1Var.f191838b.m26899h("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (qrg1Var.f191849m != null) {
                            qrg1Var.f191838b.m26899h("Unbind from service.", new Object[0]);
                            qrg1Var.f191837a.unbindService(qrg1Var.f191848l);
                            qrg1Var.f191843g = false;
                            qrg1Var.f191849m = null;
                            qrg1Var.f191848l = null;
                        }
                        HashSet hashSet = qrg1Var.f191841e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((ev61) it.next()).m40098c(new RemoteException(String.valueOf(qrg1Var.f191839c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                qrg1 qrg1Var2 = (qrg1) ((i8v) this.f218853c).f99849b;
                qrg1Var2.f191838b.m26899h("unlinkToDeath", new Object[0]);
                qrg1Var2.f191849m.asBinder().unlinkToDeath(qrg1Var2.f191846j, 0);
                qrg1Var2.f191849m = null;
                qrg1Var2.f191843g = false;
                return;
        }
    }

    public tbg1(qrg1 qrg1Var) {
        Objects.requireNonNull(qrg1Var);
        this.f218853c = qrg1Var;
    }
}
