package p204p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ey30 extends Binder implements fy30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f63932a = 0;

    /* JADX INFO: renamed from: C */
    public static fy30 m40287C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.waze.sdk.ISdkService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof fy30)) {
            return (fy30) iInterfaceQueryLocalInterface;
        }
        dy30 dy30Var = new dy30();
        dy30Var.f54160a = iBinder;
        return dy30Var;
    }
}
