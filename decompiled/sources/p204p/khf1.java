package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class khf1 extends kv30 implements ohf1 {
    /* JADX INFO: renamed from: c2 */
    public static ohf1 m56434c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        return iInterfaceQueryLocalInterface instanceof ohf1 ? (ohf1) iInterfaceQueryLocalInterface : new hhf1(iBinder, "com.google.android.gms.cast.framework.ISession", 1);
    }
}
