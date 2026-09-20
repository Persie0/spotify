package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xcf1 extends kv30 implements zdf1 {
    /* JADX INFO: renamed from: c2 */
    public static zdf1 m90394c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return iInterfaceQueryLocalInterface instanceof zdf1 ? (zdf1) iInterfaceQueryLocalInterface : new ecf1(iBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
    }
}
