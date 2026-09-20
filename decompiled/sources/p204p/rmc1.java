package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rmc1 implements tmc1 {
    public static final Parcelable.Creator<rmc1> CREATOR = new nlc1(26);

    /* JADX INFO: renamed from: a */
    public final String f200496a;

    /* JADX INFO: renamed from: b */
    public final String f200497b;

    /* JADX INFO: renamed from: c */
    public final String f200498c;

    public rmc1(String str, String str2, String str3) {
        this.f200496a = str;
        this.f200497b = str2;
        this.f200498c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc1)) {
            return false;
        }
        rmc1 rmc1Var = (rmc1) obj;
        return wj50.m88271j(this.f200496a, rmc1Var.f200496a) && wj50.m88271j(this.f200497b, rmc1Var.f200497b) && wj50.m88271j(this.f200498c, rmc1Var.f200498c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f200496a.hashCode() * 31, 31, this.f200497b);
        String str = this.f200498c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f200496a);
        parcel.writeString(this.f200497b);
        parcel.writeString(this.f200498c);
    }
}
