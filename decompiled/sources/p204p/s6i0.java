package p204p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes3.dex */
public final class s6i0 extends Binder implements nv30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f206129a;

    public s6i0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f206129a = multiInstanceInvalidationService;
        attachInterface(this, nv30.f158777g);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = nv30.f158777g;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        mv30 mv30Var = null;
        mv30 mv30Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(mv30.f147503f);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mv30)) {
                    lv30 lv30Var = new lv30();
                    lv30Var.f137210a = strongBinder;
                    mv30Var = lv30Var;
                } else {
                    mv30Var = (mv30) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            int i3 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f206129a;
                synchronized (multiInstanceInvalidationService.f1305c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1303a + 1;
                        multiInstanceInvalidationService.f1303a = i4;
                        if (multiInstanceInvalidationService.f1305c.register(mv30Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1304b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1303a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(mv30.f147503f);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof mv30)) {
                    lv30 lv30Var2 = new lv30();
                    lv30Var2.f137210a = strongBinder2;
                    mv30Var2 = lv30Var2;
                } else {
                    mv30Var2 = (mv30) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f206129a;
            synchronized (multiInstanceInvalidationService2.f1305c) {
                multiInstanceInvalidationService2.f1305c.unregister(mv30Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f206129a;
        synchronized (multiInstanceInvalidationService3.f1305c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.f1304b.get(Integer.valueOf(i6));
                if (str2 != null) {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f1305c.beginBroadcast();
                    for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                        try {
                            Integer num = (Integer) multiInstanceInvalidationService3.f1305c.getBroadcastCookie(i7);
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1304b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((mv30) multiInstanceInvalidationService3.f1305c.getBroadcastItem(i7)).mo60047y(strArrCreateStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.f1305c.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService3.f1305c.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
