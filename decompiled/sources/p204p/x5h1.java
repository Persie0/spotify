package p204p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class x5h1 extends g5f1 {
    public x5h1(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer", 4);
    }

    /* JADX INFO: renamed from: j2 */
    public final w6h1 m90010j2(imk0 imk0Var, q5h1 q5h1Var) {
        Parcel parcelM43604d2 = m43604d2();
        int i = lmf1.f134964a;
        parcelM43604d2.writeStrongBinder(imk0Var);
        parcelM43604d2.writeInt(1);
        q5h1Var.writeToParcel(parcelM43604d2, 0);
        Parcel parcelM43605e2 = m43605e2(3, parcelM43604d2);
        w6h1 w6h1VarCreateFromParcel = parcelM43605e2.readInt() == 0 ? null : w6h1.CREATOR.createFromParcel(parcelM43605e2);
        parcelM43605e2.recycle();
        return w6h1VarCreateFromParcel;
    }

    /* JADX INFO: renamed from: k2 */
    public final void m90011k2() {
        m43606f2(1, m43604d2());
    }

    /* JADX INFO: renamed from: l2 */
    public final void m90012l2() {
        m43606f2(2, m43604d2());
    }
}
