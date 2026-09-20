package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ygf1 extends kv30 implements chf1 {
    /* JADX INFO: renamed from: c2 */
    public static chf1 m93597c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return iInterfaceQueryLocalInterface instanceof chf1 ? (chf1) iInterfaceQueryLocalInterface : new tgf1(iBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
    }
}
