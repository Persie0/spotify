package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fla0 implements Parcelable {
    public static final Parcelable.Creator<fla0> CREATOR = new z8a0(24);

    /* JADX INFO: renamed from: a */
    public final String f70735a;

    /* JADX INFO: renamed from: b */
    public final String f70736b;

    /* JADX INFO: renamed from: c */
    public final String f70737c;

    /* JADX INFO: renamed from: d */
    public final Integer f70738d;

    public fla0(String str, String str2, Integer num, String str3) {
        this.f70735a = str;
        this.f70736b = str2;
        this.f70737c = str3;
        this.f70738d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fla0)) {
            return false;
        }
        fla0 fla0Var = (fla0) obj;
        return wj50.m88271j(this.f70735a, fla0Var.f70735a) && wj50.m88271j(this.f70736b, fla0Var.f70736b) && wj50.m88271j(this.f70737c, fla0Var.f70737c) && wj50.m88271j(this.f70738d, fla0Var.f70738d);
    }

    public final String getUri() {
        return this.f70735a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f70735a.hashCode() * 31, 31, this.f70736b);
        String str = this.f70737c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f70738d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f70735a);
        parcel.writeString(this.f70736b);
        parcel.writeString(this.f70737c);
        Integer num = this.f70738d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
