package p204p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class rif1 extends g5f1 {
    public rif1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
    }

    /* JADX INFO: renamed from: j2 */
    public final tv30 m75586j2() {
        Parcel parcelM43605e2 = m43605e2(2, m43604d2());
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return tv30VarM51105c2;
    }
}
