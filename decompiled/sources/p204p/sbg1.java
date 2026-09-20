package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class sbg1 extends g5f1 implements dig1 {
    /* JADX INFO: renamed from: j2 */
    public final b8g1 m77737j2(imk0 imk0Var, qtg1 qtg1Var) {
        b8g1 b8g1Var;
        Parcel parcelM43604d2 = m43604d2();
        int i = lmf1.f134964a;
        parcelM43604d2.writeStrongBinder(imk0Var);
        parcelM43604d2.writeInt(1);
        qtg1Var.writeToParcel(parcelM43604d2, 0);
        Parcel parcelM43605e2 = m43605e2(1, parcelM43604d2);
        IBinder strongBinder = parcelM43605e2.readStrongBinder();
        if (strongBinder == null) {
            b8g1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            b8g1Var = iInterfaceQueryLocalInterface instanceof b8g1 ? (b8g1) iInterfaceQueryLocalInterface : new b8g1(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 4);
        }
        parcelM43605e2.recycle();
        return b8g1Var;
    }
}
