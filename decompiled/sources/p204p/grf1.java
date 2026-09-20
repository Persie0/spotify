package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class grf1 extends nif1 implements yvf1 {
    public static yvf1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof yvf1 ? (yvf1) iInterfaceQueryLocalInterface : new xmf1(iBinder);
    }
}
