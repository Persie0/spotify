package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class yhg1 extends gwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f272871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i8v f272872c;

    public yhg1(i8v i8vVar, IBinder iBinder) {
        this.f272871b = iBinder;
        this.f272872c = i8vVar;
    }

    @Override // p204p.gwf1
    /* JADX INFO: renamed from: b */
    public final void mo45927b() {
        bu30 zt30Var;
        int i = au30.f19830l;
        IBinder iBinder = this.f272871b;
        if (iBinder == null) {
            zt30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            zt30Var = iInterfaceQueryLocalInterface instanceof bu30 ? (bu30) iInterfaceQueryLocalInterface : new zt30(iBinder);
        }
        rrg1 rrg1Var = (rrg1) this.f272872c.f99849b;
        rrg1Var.f202058m = zt30Var;
        ArrayList arrayList = rrg1Var.f202049d;
        vah1 vah1Var = rrg1Var.f202047b;
        vah1Var.m85082a("linkToDeath", new Object[0]);
        try {
            rrg1Var.f202058m.asBinder().linkToDeath(rrg1Var.f202055j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                vah1.m85081d(vah1Var.f239278b, "linkToDeath failed", objArr);
            }
        }
        rrg1Var.f202052g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
