package p204p;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kbg1 extends gwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f121202b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f121203c;

    public kbg1(i8v i8vVar) {
        this.f121203c = i8vVar;
    }

    @Override // p204p.gwf1
    /* JADX INFO: renamed from: b */
    public final void mo45927b() {
        switch (this.f121202b) {
            case 0:
                rrg1 rrg1Var = (rrg1) this.f121203c;
                synchronized (rrg1Var.f202051f) {
                    try {
                        if (rrg1Var.f202056k.get() > 0 && rrg1Var.f202056k.decrementAndGet() > 0) {
                            rrg1Var.f202047b.m85082a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (rrg1Var.f202058m != null) {
                            rrg1Var.f202047b.m85082a("Unbind from service.", new Object[0]);
                            rrg1Var.f202046a.unbindService(rrg1Var.f202057l);
                            rrg1Var.f202052g = false;
                            rrg1Var.f202058m = null;
                            rrg1Var.f202057l = null;
                        }
                        HashSet hashSet = rrg1Var.f202050e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((ev61) it.next()).m40098c(new RemoteException(String.valueOf(rrg1Var.f202048c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                rrg1 rrg1Var2 = (rrg1) ((i8v) this.f121203c).f99849b;
                rrg1Var2.f202047b.m85082a("unlinkToDeath", new Object[0]);
                rrg1Var2.f202058m.asBinder().unlinkToDeath(rrg1Var2.f202055j, 0);
                rrg1Var2.f202058m = null;
                rrg1Var2.f202052g = false;
                return;
        }
    }

    public kbg1(rrg1 rrg1Var) {
        Objects.requireNonNull(rrg1Var);
        this.f121203c = rrg1Var;
    }
}
