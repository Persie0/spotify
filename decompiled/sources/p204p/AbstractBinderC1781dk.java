package p204p;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: p.dk */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1781dk extends kv30 implements yt30 {
    /* JADX INFO: renamed from: c2 */
    public static yt30 m36239c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof yt30 ? (yt30) iInterfaceQueryLocalInterface : new w2h1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
    }

    /* JADX INFO: renamed from: d2 */
    public static Account m36240d2(yt30 yt30Var) {
        if (yt30Var != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                w2h1 w2h1Var = (w2h1) yt30Var;
                Parcel parcelM43601a2 = w2h1Var.m43601a2(2, w2h1Var.m43604d2());
                Account account = (Account) gmf1.m45234a(parcelM43601a2, Account.CREATOR);
                parcelM43601a2.recycle();
                return account;
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}
