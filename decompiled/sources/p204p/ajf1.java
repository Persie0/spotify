package p204p;

import android.os.Parcel;
import androidx.media3.session.legacy.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class ajf1 extends g5f1 {
    /* JADX INFO: renamed from: j2 */
    public final ohf1 m26153j2(String str, String str2, wff1 wff1Var) {
        Parcel parcelM43604d2 = m43604d2();
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeString(str2);
        fmf1.m42108c(parcelM43604d2, wff1Var);
        Parcel parcelM43605e2 = m43605e2(2, parcelM43604d2);
        ohf1 ohf1VarM56434c2 = khf1.m56434c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return ohf1VarM56434c2;
    }

    /* JADX INFO: renamed from: k2 */
    public final zdf1 m26154k2(ebc ebcVar, tv30 tv30Var, o4h1 o4h1Var) {
        Parcel parcelM43604d2 = m43604d2();
        fmf1.m42107b(parcelM43604d2, ebcVar);
        fmf1.m42108c(parcelM43604d2, tv30Var);
        fmf1.m42108c(parcelM43604d2, o4h1Var);
        Parcel parcelM43605e2 = m43605e2(3, parcelM43604d2);
        zdf1 zdf1VarM90394c2 = xcf1.m90394c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return zdf1VarM90394c2;
    }

    /* JADX INFO: renamed from: l2 */
    public final chf1 m26155l2(imk0 imk0Var, tv30 tv30Var, tv30 tv30Var2) {
        Parcel parcelM43604d2 = m43604d2();
        fmf1.m42108c(parcelM43604d2, imk0Var);
        fmf1.m42108c(parcelM43604d2, tv30Var);
        fmf1.m42108c(parcelM43604d2, tv30Var2);
        Parcel parcelM43605e2 = m43605e2(5, parcelM43604d2);
        chf1 chf1VarM93597c2 = ygf1.m93597c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return chf1VarM93597c2;
    }

    /* JADX INFO: renamed from: m2 */
    public final t4g1 m26156m2(imk0 imk0Var, wff1 wff1Var, int i, int i2) {
        Parcel parcelM43604d2 = m43604d2();
        fmf1.m42108c(parcelM43604d2, imk0Var);
        fmf1.m42108c(parcelM43604d2, wff1Var);
        parcelM43604d2.writeInt(i);
        parcelM43604d2.writeInt(i2);
        parcelM43604d2.writeInt(0);
        parcelM43604d2.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelM43604d2.writeInt(5);
        parcelM43604d2.writeInt(333);
        parcelM43604d2.writeInt(10000);
        Parcel parcelM43605e2 = m43605e2(6, parcelM43604d2);
        t4g1 t4g1VarM37558c2 = e1g1.m37558c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return t4g1VarM37558c2;
    }

    /* JADX INFO: renamed from: n2 */
    public final t4g1 m26157n2(imk0 imk0Var, imk0 imk0Var2, wff1 wff1Var, int i, int i2) {
        Parcel parcelM43604d2 = m43604d2();
        fmf1.m42108c(parcelM43604d2, imk0Var);
        fmf1.m42108c(parcelM43604d2, imk0Var2);
        fmf1.m42108c(parcelM43604d2, wff1Var);
        parcelM43604d2.writeInt(i);
        parcelM43604d2.writeInt(i2);
        parcelM43604d2.writeInt(0);
        parcelM43604d2.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelM43604d2.writeInt(5);
        parcelM43604d2.writeInt(333);
        parcelM43604d2.writeInt(10000);
        Parcel parcelM43605e2 = m43605e2(7, parcelM43604d2);
        t4g1 t4g1VarM37558c2 = e1g1.m37558c2(parcelM43605e2.readStrongBinder());
        parcelM43605e2.recycle();
        return t4g1VarM37558c2;
    }
}
