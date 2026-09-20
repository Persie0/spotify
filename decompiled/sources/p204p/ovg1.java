package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ovg1 extends g5f1 {
    /* JADX INFO: renamed from: j2 */
    public final tv30 m68129j2(imk0 imk0Var, String str, int i, imk0 imk0Var2) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(i);
        gmf1.m45235b(parcelM43604d2, imk0Var2);
        Parcel parcelM43601a2 = m43601a2(2, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }

    /* JADX INFO: renamed from: k2 */
    public final tv30 m68130k2(imk0 imk0Var, String str, int i, imk0 imk0Var2) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(i);
        gmf1.m45235b(parcelM43604d2, imk0Var2);
        Parcel parcelM43601a2 = m43601a2(3, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }
}
