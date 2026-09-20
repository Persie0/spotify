package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class cig1 extends bwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f38343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i8v f38344c;

    public cig1(i8v i8vVar, IBinder iBinder) {
        this.f38343b = iBinder;
        this.f38344c = i8vVar;
    }

    @Override // p204p.bwf1
    /* JADX INFO: renamed from: a */
    public final void mo30688a() {
        gu30 eu30Var;
        dsg1 dsg1Var = (dsg1) this.f38344c.f99849b;
        int i = fu30.f73393l;
        IBinder iBinder = this.f38343b;
        if (iBinder == null) {
            eu30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.engage.protocol.IAppEngageService");
            eu30Var = iInterfaceQueryLocalInterface instanceof gu30 ? (gu30) iInterfaceQueryLocalInterface : new eu30(iBinder);
        }
        dsg1Var.f52581m = eu30Var;
        C2617yl c2617yl = dsg1Var.f52570b;
        c2617yl.m94136g("linkToDeath", new Object[0]);
        try {
            dsg1Var.f52581m.asBinder().linkToDeath(dsg1Var.f52578j, 0);
        } catch (RemoteException e) {
            c2617yl.m94135f(e, "linkToDeath failed", new Object[0]);
        }
        dsg1Var.f52575g = false;
        Iterator it = dsg1Var.f52572d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        dsg1Var.f52572d.clear();
    }
}
