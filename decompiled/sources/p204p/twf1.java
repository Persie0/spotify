package p204p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class twf1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f224436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dz8 f224437b;

    public twf1(dz8 dz8Var, int i) {
        this.f224437b = dz8Var;
        this.f224436a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dz8 dz8Var = this.f224437b;
        if (iBinder == null) {
            dz8Var.m37417L();
            return;
        }
        synchronized (dz8Var.m37419N()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dz8Var.m37420O((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t6f1)) ? new t6f1(iBinder) : (t6f1) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f224437b.m37413H(0, this.f224436a, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dz8 dz8Var = this.f224437b;
        synchronized (dz8Var.m37419N()) {
            dz8Var.m37420O(null);
        }
        dz8 dz8Var2 = this.f224437b;
        int i = this.f224436a;
        wif1 wif1Var = dz8Var2.f54561f;
        wif1Var.sendMessage(wif1Var.obtainMessage(6, i, 1));
    }
}
