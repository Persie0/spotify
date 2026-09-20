package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class jwf1 extends g5f1 {
    public jwf1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
    }

    /* JADX INFO: renamed from: j2 */
    public final qif1 m54442j2() {
        qif1 qif1Var;
        Parcel parcelM43602b2 = m43602b2(4, m43604d2());
        IBinder strongBinder = parcelM43602b2.readStrongBinder();
        if (strongBinder == null) {
            qif1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            qif1Var = iInterfaceQueryLocalInterface instanceof qif1 ? (qif1) iInterfaceQueryLocalInterface : new qif1(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 3);
        }
        parcelM43602b2.recycle();
        return qif1Var;
    }

    /* JADX INFO: renamed from: k2 */
    public final ykg1 m54443k2(imk0 imk0Var, GoogleMapOptions googleMapOptions) {
        ykg1 ykg1Var;
        Parcel parcelM43604d2 = m43604d2();
        kmf1.m56902b(parcelM43604d2, imk0Var);
        kmf1.m56901a(parcelM43604d2, googleMapOptions);
        Parcel parcelM43602b2 = m43602b2(3, parcelM43604d2);
        IBinder strongBinder = parcelM43602b2.readStrongBinder();
        if (strongBinder == null) {
            ykg1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            ykg1Var = iInterfaceQueryLocalInterface instanceof ykg1 ? (ykg1) iInterfaceQueryLocalInterface : new ykg1(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 3);
        }
        parcelM43602b2.recycle();
        return ykg1Var;
    }

    /* JADX INFO: renamed from: l2 */
    public final rbg1 m54444l2() {
        rbg1 o4g1Var;
        Parcel parcelM43602b2 = m43602b2(5, m43604d2());
        IBinder strongBinder = parcelM43602b2.readStrongBinder();
        int i = j8g1.f109938l;
        if (strongBinder == null) {
            o4g1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            o4g1Var = iInterfaceQueryLocalInterface instanceof rbg1 ? (rbg1) iInterfaceQueryLocalInterface : new o4g1(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 3);
        }
        parcelM43602b2.recycle();
        return o4g1Var;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m54445m2(imk0 imk0Var) {
        Parcel parcelM43604d2 = m43604d2();
        kmf1.m56902b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeInt(12451000);
        m43606f2(6, parcelM43604d2);
    }
}
