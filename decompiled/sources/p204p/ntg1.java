package p204p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ntg1 extends g5f1 {
    public ntg1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
    }

    /* JADX INFO: renamed from: j2 */
    public final tv30 m65616j2(imk0 imk0Var, String str, int i) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(i);
        Parcel parcelM43601a2 = m43601a2(2, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }

    /* JADX INFO: renamed from: k2 */
    public final int m65617k2(imk0 imk0Var, String str, boolean z) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(z ? 1 : 0);
        Parcel parcelM43601a2 = m43601a2(3, parcelM43604d2);
        int i = parcelM43601a2.readInt();
        parcelM43601a2.recycle();
        return i;
    }

    /* JADX INFO: renamed from: l2 */
    public final tv30 m65618l2(imk0 imk0Var, String str, int i) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(i);
        Parcel parcelM43601a2 = m43601a2(4, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }

    /* JADX INFO: renamed from: m2 */
    public final int m65619m2(imk0 imk0Var, String str, boolean z) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(z ? 1 : 0);
        Parcel parcelM43601a2 = m43601a2(5, parcelM43604d2);
        int i = parcelM43601a2.readInt();
        parcelM43601a2.recycle();
        return i;
    }

    /* JADX INFO: renamed from: n2 */
    public final int m65620n2() {
        Parcel parcelM43601a2 = m43601a2(6, m43604d2());
        int i = parcelM43601a2.readInt();
        parcelM43601a2.recycle();
        return i;
    }

    /* JADX INFO: renamed from: o2 */
    public final tv30 m65621o2(imk0 imk0Var, String str, boolean z, long j) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(z ? 1 : 0);
        parcelM43604d2.writeLong(j);
        Parcel parcelM43601a2 = m43601a2(7, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }

    /* JADX INFO: renamed from: p2 */
    public final tv30 m65622p2(imk0 imk0Var, String str, int i, imk0 imk0Var2) {
        Parcel parcelM43604d2 = m43604d2();
        gmf1.m45235b(parcelM43604d2, imk0Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeInt(i);
        gmf1.m45235b(parcelM43604d2, imk0Var2);
        Parcel parcelM43601a2 = m43601a2(8, parcelM43604d2);
        tv30 tv30VarM51105c2 = imk0.m51105c2(parcelM43601a2.readStrongBinder());
        parcelM43601a2.recycle();
        return tv30VarM51105c2;
    }
}
