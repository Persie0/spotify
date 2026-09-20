package p204p;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v2h1 {

    /* JADX INFO: renamed from: a */
    public static final ura0 f236641a = new ura0("MediaSessionUtils", null);

    /* JADX INFO: renamed from: a */
    public static ArrayList m84511a(owf1 owf1Var) {
        try {
            Parcel parcelM43605e2 = owf1Var.m43605e2(3, owf1Var.m43604d2());
            ArrayList arrayListCreateTypedArrayList = parcelM43605e2.createTypedArrayList(wsj0.CREATOR);
            parcelM43605e2.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException unused) {
            f236641a.m83850c("Unable to call %s on %s.", "getNotificationActions", owf1.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m84512b(owf1 owf1Var) {
        try {
            Parcel parcelM43605e2 = owf1Var.m43605e2(4, owf1Var.m43604d2());
            int[] iArrCreateIntArray = parcelM43605e2.createIntArray();
            parcelM43605e2.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException unused) {
            f236641a.m83850c("Unable to call %s on %s.", "getCompactViewActionIndices", owf1.class.getSimpleName());
            return null;
        }
    }
}
