package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xhg1 extends fwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f261575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i8v f261576c;

    public xhg1(i8v i8vVar, IBinder iBinder) {
        this.f261575b = iBinder;
        this.f261576c = i8vVar;
    }

    @Override // p204p.fwf1
    /* JADX INFO: renamed from: a */
    public final void mo42966a() {
        lu30 ju30Var;
        int i = ku30.f126443l;
        IBinder iBinder = this.f261575b;
        if (iBinder == null) {
            ju30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.crossdeviceprompt.protocol.ICrossDevicePromptService");
            ju30Var = iInterfaceQueryLocalInterface instanceof lu30 ? (lu30) iInterfaceQueryLocalInterface : new ju30(iBinder);
        }
        qrg1 qrg1Var = (qrg1) this.f261576c.f99849b;
        qrg1Var.f191849m = ju30Var;
        ArrayList arrayList = qrg1Var.f191840d;
        aqs aqsVar = qrg1Var.f191838b;
        aqsVar.m26899h("linkToDeath", new Object[0]);
        try {
            qrg1Var.f191849m.asBinder().linkToDeath(qrg1Var.f191846j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                aqs.m26894j(aqsVar.f18776b, "linkToDeath failed", objArr);
            }
        }
        qrg1Var.f191843g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
