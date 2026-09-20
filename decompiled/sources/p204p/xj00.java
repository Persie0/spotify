package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class xj00 implements Parcelable {
    public static final Parcelable.Creator<xj00> CREATOR = new k700(8);

    /* JADX INFO: renamed from: a */
    public final String f261981a;

    /* JADX INFO: renamed from: b */
    public final String f261982b;

    /* JADX INFO: renamed from: c */
    public final String f261983c;

    public xj00(String str, String str2, String str3) {
        this.f261981a = str;
        this.f261982b = str2;
        this.f261983c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj00)) {
            return false;
        }
        xj00 xj00Var = (xj00) obj;
        return wj50.m88271j(this.f261981a, xj00Var.f261981a) && wj50.m88271j(this.f261982b, xj00Var.f261982b) && wj50.m88271j(this.f261983c, xj00Var.f261983c);
    }

    public final int hashCode() {
        int iHashCode = this.f261981a.hashCode() * 31;
        String str = this.f261982b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f261983c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f261981a);
        parcel.writeString(this.f261982b);
        parcel.writeString(this.f261983c);
    }
}
