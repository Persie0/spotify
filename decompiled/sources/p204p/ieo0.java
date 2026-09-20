package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ieo0 implements iet0 {
    public static final Parcelable.Creator<ieo0> CREATOR = new o2o0(17);

    /* JADX INFO: renamed from: a */
    public final int f101481a;

    /* JADX INFO: renamed from: b */
    public final String f101482b;

    /* JADX INFO: renamed from: c */
    public final String f101483c;

    /* JADX INFO: renamed from: d */
    public final String f101484d;

    /* JADX INFO: renamed from: e */
    public final String f101485e;

    public ieo0(int i, String str, String str2, String str3, String str4) {
        this.f101481a = i;
        this.f101482b = str;
        this.f101483c = str2;
        this.f101484d = str3;
        this.f101485e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f101481a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieo0)) {
            return false;
        }
        ieo0 ieo0Var = (ieo0) obj;
        return this.f101481a == ieo0Var.f101481a && wj50.m88271j(this.f101482b, ieo0Var.f101482b) && wj50.m88271j(this.f101483c, ieo0Var.f101483c) && wj50.m88271j(this.f101484d, ieo0Var.f101484d) && wj50.m88271j(this.f101485e, ieo0Var.f101485e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f101481a) * 31, 31, this.f101482b), 31, this.f101483c), 31, this.f101484d);
        String str = this.f101485e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f101481a);
        parcel.writeString(this.f101482b);
        parcel.writeString(this.f101483c);
        parcel.writeString(this.f101484d);
        parcel.writeString(this.f101485e);
    }
}
