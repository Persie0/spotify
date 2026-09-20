package p204p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vx30 extends Binder implements wx30 {
    /* JADX INFO: renamed from: C */
    public static wx30 m86631C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof wx30)) {
            return (wx30) iInterfaceQueryLocalInterface;
        }
        ux30 ux30Var = new ux30();
        ux30Var.f234816a = iBinder;
        return ux30Var;
    }
}
