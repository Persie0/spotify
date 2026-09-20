package p204p;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e3f1 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55769b;

    public /* synthetic */ e3f1(Object obj, int i) {
        this.f55768a = i;
        this.f55769b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f55768a) {
            case 0:
                f0f1 f0f1Var = (f0f1) this.f55769b;
                f0f1Var.f64633b.m31382b("reportBinderDeath", new Object[0]);
                if (f0f1Var.f64641j.get() != null) {
                    throw new ClassCastException();
                }
                f0f1Var.f64633b.m31382b("%s : Binder has died.", f0f1Var.f64634c);
                Iterator it = f0f1Var.f64635d.iterator();
                while (it.hasNext()) {
                    ((d3f1) it.next()).mo31263a(new RemoteException(String.valueOf(f0f1Var.f64634c).concat(" : Binder has died.")));
                }
                f0f1Var.f64635d.clear();
                synchronized (f0f1Var.f64637f) {
                    f0f1Var.m40480d();
                    break;
                }
                return;
            case 1:
                qrg1 qrg1Var = (qrg1) this.f55769b;
                aqs aqsVar = qrg1Var.f191838b;
                aqsVar.m26899h("reportBinderDeath", new Object[0]);
                if (qrg1Var.f191845i.get() != null) {
                    throw new ClassCastException();
                }
                aqsVar.m26899h("%s : Binder has died.", qrg1Var.f191839c);
                ArrayList<fwf1> arrayList = qrg1Var.f191840d;
                for (fwf1 fwf1Var : arrayList) {
                    RemoteException remoteException = new RemoteException(String.valueOf(qrg1Var.f191839c).concat(" : Binder has died."));
                    ev61 ev61Var = fwf1Var.f74062a;
                    if (ev61Var != null) {
                        ev61Var.m40098c(remoteException);
                    }
                }
                arrayList.clear();
                synchronized (qrg1Var.f191842f) {
                    HashSet hashSet = qrg1Var.f191841e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((ev61) it2.next()).m40098c(new RemoteException(String.valueOf(qrg1Var.f191839c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            default:
                rrg1 rrg1Var = (rrg1) this.f55769b;
                vah1 vah1Var = rrg1Var.f202047b;
                vah1Var.m85082a("reportBinderDeath", new Object[0]);
                if (rrg1Var.f202054i.get() != null) {
                    throw new ClassCastException();
                }
                vah1Var.m85082a("%s : Binder has died.", rrg1Var.f202048c);
                ArrayList arrayList2 = rrg1Var.f202049d;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((gwf1) it3.next()).mo45926a(new RemoteException(String.valueOf(rrg1Var.f202048c).concat(" : Binder has died.")));
                }
                arrayList2.clear();
                synchronized (rrg1Var.f202051f) {
                    HashSet hashSet2 = rrg1Var.f202050e;
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        ((ev61) it4.next()).m40098c(new RemoteException(String.valueOf(rrg1Var.f202048c).concat(" : Binder has died.")));
                    }
                    hashSet2.clear();
                    break;
                }
                return;
        }
    }
}
