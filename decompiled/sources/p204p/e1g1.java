package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1g1 extends kv30 implements t4g1 {
    /* JADX INFO: renamed from: c2 */
    public static t4g1 m37558c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        return iInterfaceQueryLocalInterface instanceof t4g1 ? (t4g1) iInterfaceQueryLocalInterface : new pwf1(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
    }
}
