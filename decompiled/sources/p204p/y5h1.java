package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class y5h1 extends g5f1 implements d6h1 {
    /* JADX INFO: renamed from: j2 */
    public final x5h1 m92847j2(imk0 imk0Var) {
        x5h1 x5h1Var;
        Parcel parcelM43604d2 = m43604d2();
        int i = lmf1.f134964a;
        parcelM43604d2.writeStrongBinder(imk0Var);
        Parcel parcelM43605e2 = m43605e2(1, parcelM43604d2);
        IBinder strongBinder = parcelM43605e2.readStrongBinder();
        if (strongBinder == null) {
            x5h1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            x5h1Var = iInterfaceQueryLocalInterface instanceof x5h1 ? (x5h1) iInterfaceQueryLocalInterface : new x5h1(strongBinder);
        }
        parcelM43605e2.recycle();
        return x5h1Var;
    }

    /* JADX INFO: renamed from: k2 */
    public final x5h1 m92848k2(imk0 imk0Var, z6h1 z6h1Var) {
        x5h1 x5h1Var;
        Parcel parcelM43604d2 = m43604d2();
        int i = lmf1.f134964a;
        parcelM43604d2.writeStrongBinder(imk0Var);
        parcelM43604d2.writeInt(1);
        z6h1Var.writeToParcel(parcelM43604d2, 0);
        Parcel parcelM43605e2 = m43605e2(2, parcelM43604d2);
        IBinder strongBinder = parcelM43605e2.readStrongBinder();
        if (strongBinder == null) {
            x5h1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            x5h1Var = iInterfaceQueryLocalInterface instanceof x5h1 ? (x5h1) iInterfaceQueryLocalInterface : new x5h1(strongBinder);
        }
        parcelM43605e2.recycle();
        return x5h1Var;
    }
}
