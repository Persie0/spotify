package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mbm implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Context f141947a;

    /* JADX INFO: renamed from: a */
    public abstract void mo41260a(lbm lbmVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pu30 pu30Var;
        if (this.f141947a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = ou30.f170160a;
        if (iBinder == null) {
            pu30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(pu30.f181322c);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pu30)) {
                nu30 nu30Var = new nu30();
                nu30Var.f158506a = iBinder;
                pu30Var = nu30Var;
            } else {
                pu30Var = (pu30) iInterfaceQueryLocalInterface;
            }
        }
        mo41260a(new lbm(pu30Var, componentName, this.f141947a));
    }
}
