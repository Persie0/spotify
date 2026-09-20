package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hlt0 implements Parcelable {
    public static final Parcelable.Creator<hlt0> CREATOR = new vit0(5);

    /* JADX INFO: renamed from: a */
    public final String f92735a;

    /* JADX INFO: renamed from: b */
    public final String f92736b;

    /* JADX INFO: renamed from: c */
    public final String f92737c;

    /* JADX INFO: renamed from: d */
    public final int f92738d;

    /* JADX INFO: renamed from: e */
    public final boolean f92739e;

    public hlt0(int i, String str, String str2, boolean z, String str3) {
        this.f92735a = str;
        this.f92736b = str2;
        this.f92737c = str3;
        this.f92738d = i;
        this.f92739e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlt0)) {
            return false;
        }
        hlt0 hlt0Var = (hlt0) obj;
        return wj50.m88271j(this.f92735a, hlt0Var.f92735a) && wj50.m88271j(this.f92736b, hlt0Var.f92736b) && wj50.m88271j(this.f92737c, hlt0Var.f92737c) && this.f92738d == hlt0Var.f92738d && this.f92739e == hlt0Var.f92739e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f92735a.hashCode() * 31, 31, this.f92736b);
        String str = this.f92737c;
        return Boolean.hashCode(this.f92739e) + f710.m40938f(this.f92738d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f92735a);
        parcel.writeString(this.f92736b);
        parcel.writeString(this.f92737c);
        int i2 = this.f92738d;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "PRESET";
        } else if (i2 == 3) {
            str = "USER_PROFILE";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "USER";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f92739e ? 1 : 0);
    }
}
