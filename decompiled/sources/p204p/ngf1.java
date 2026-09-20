package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.ContentDistributionModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ngf1 extends g5f1 implements wgf1 {
    /* JADX INFO: renamed from: j2 */
    public final int m64382j2(int i, Bundle bundle, String str, String str2) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(i);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        int i2 = rhf1.f199217a;
        parcelM43608h2.writeInt(1);
        bundle.writeToParcel(parcelM43608h2, 0);
        Parcel parcelM43609i2 = m43609i2(10, parcelM43608h2);
        int i3 = parcelM43609i2.readInt();
        parcelM43609i2.recycle();
        return i3;
    }

    /* JADX INFO: renamed from: k2 */
    public final Bundle m64383k2(String str, String str2, String str3) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(3);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        parcelM43608h2.writeString(str3);
        parcelM43608h2.writeString(null);
        Parcel parcelM43609i2 = m43609i2(3, parcelM43608h2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) rhf1.m75514a(parcelM43609i2);
        parcelM43609i2.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: l2 */
    public final Bundle m64384l2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(i);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        parcelM43608h2.writeString(str3);
        parcelM43608h2.writeString(null);
        int i2 = rhf1.f199217a;
        parcelM43608h2.writeInt(1);
        bundle.writeToParcel(parcelM43608h2, 0);
        Parcel parcelM43609i2 = m43609i2(8, parcelM43608h2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) rhf1.m75514a(parcelM43609i2);
        parcelM43609i2.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: m2 */
    public final Bundle m64385m2(String str, String str2, String str3) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(3);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        parcelM43608h2.writeString(str3);
        Parcel parcelM43609i2 = m43609i2(4, parcelM43608h2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) rhf1.m75514a(parcelM43609i2);
        parcelM43609i2.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: n2 */
    public final Bundle m64386n2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(i);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        parcelM43608h2.writeString(str3);
        int i2 = rhf1.f199217a;
        parcelM43608h2.writeInt(1);
        bundle.writeToParcel(parcelM43608h2, 0);
        Parcel parcelM43609i2 = m43609i2(11, parcelM43608h2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) rhf1.m75514a(parcelM43609i2);
        parcelM43609i2.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: o2 */
    public final Bundle m64387o2(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(i);
        parcelM43608h2.writeString(str);
        parcelM43608h2.writeString(str2);
        int i2 = rhf1.f199217a;
        parcelM43608h2.writeInt(1);
        bundle.writeToParcel(parcelM43608h2, 0);
        parcelM43608h2.writeInt(1);
        bundle2.writeToParcel(parcelM43608h2, 0);
        Parcel parcelM43609i2 = m43609i2(ContentDistributionModel.TV_AND_ONLINE, parcelM43608h2);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) rhf1.m75514a(parcelM43609i2);
        parcelM43609i2.recycle();
        return bundle3;
    }

    /* JADX INFO: renamed from: p2 */
    public final void m64388p2(String str, Bundle bundle, dnf1 dnf1Var) {
        Parcel parcelM43608h2 = m43608h2();
        parcelM43608h2.writeInt(18);
        parcelM43608h2.writeString(str);
        int i = rhf1.f199217a;
        parcelM43608h2.writeInt(1);
        bundle.writeToParcel(parcelM43608h2, 0);
        parcelM43608h2.writeStrongBinder(dnf1Var);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f76674l.transact(1301, parcelM43608h2, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelM43608h2.recycle();
            parcelObtain.recycle();
        }
    }
}
