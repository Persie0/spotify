package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uea0 extends xea0 {
    public static final Parcelable.Creator<uea0> CREATOR = new z8a0(17);

    /* JADX INFO: renamed from: a */
    public final String f229474a;

    /* JADX INFO: renamed from: b */
    public final String f229475b;

    public uea0(String str, String str2) {
        this.f229474a = str;
        this.f229475b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uea0)) {
            return false;
        }
        uea0 uea0Var = (uea0) obj;
        return wj50.m88271j(this.f229474a, uea0Var.f229474a) && wj50.m88271j(this.f229475b, uea0Var.f229475b);
    }

    public final int hashCode() {
        int iHashCode = this.f229474a.hashCode() * 31;
        String str = this.f229475b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f229474a);
        parcel.writeString(this.f229475b);
    }
}
