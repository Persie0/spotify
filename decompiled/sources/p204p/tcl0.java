package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tcl0 implements wcl0 {
    public static final Parcelable.Creator<tcl0> CREATOR = new hbl0(17);

    /* JADX INFO: renamed from: a */
    public final String f219105a;

    /* JADX INFO: renamed from: b */
    public final String f219106b;

    /* JADX INFO: renamed from: c */
    public final String f219107c;

    /* JADX INFO: renamed from: d */
    public final String f219108d;

    public tcl0(String str, String str2, String str3, String str4) {
        this.f219105a = str;
        this.f219106b = str2;
        this.f219107c = str3;
        this.f219108d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcl0)) {
            return false;
        }
        tcl0 tcl0Var = (tcl0) obj;
        return wj50.m88271j(this.f219105a, tcl0Var.f219105a) && wj50.m88271j(this.f219106b, tcl0Var.f219106b) && wj50.m88271j(this.f219107c, tcl0Var.f219107c) && wj50.m88271j(this.f219108d, tcl0Var.f219108d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f219105a.hashCode() * 31, 31, this.f219106b), 31, this.f219107c);
        String str = this.f219108d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219105a);
        parcel.writeString(this.f219106b);
        parcel.writeString(this.f219107c);
        parcel.writeString(this.f219108d);
    }
}
