package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class amc1 implements Parcelable {
    public static final Parcelable.Creator<amc1> CREATOR = new nlc1(10);

    /* JADX INFO: renamed from: a */
    public final String f17089a;

    /* JADX INFO: renamed from: b */
    public final String f17090b;

    /* JADX INFO: renamed from: c */
    public final String f17091c;

    /* JADX INFO: renamed from: d */
    public final String f17092d;

    public amc1(String str, String str2, String str3, String str4) {
        this.f17089a = str;
        this.f17090b = str2;
        this.f17091c = str3;
        this.f17092d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amc1)) {
            return false;
        }
        amc1 amc1Var = (amc1) obj;
        return wj50.m88271j(this.f17089a, amc1Var.f17089a) && wj50.m88271j(this.f17090b, amc1Var.f17090b) && wj50.m88271j(this.f17091c, amc1Var.f17091c) && wj50.m88271j(this.f17092d, amc1Var.f17092d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f17089a.hashCode() * 31, 31, this.f17090b);
        String str = this.f17091c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17092d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17089a);
        parcel.writeString(this.f17090b);
        parcel.writeString(this.f17091c);
        parcel.writeString(this.f17092d);
    }
}
