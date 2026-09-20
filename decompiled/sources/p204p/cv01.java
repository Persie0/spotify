package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cv01 extends gv01 {
    public static final Parcelable.Creator<cv01> CREATOR = new bv01(1);

    /* JADX INFO: renamed from: a */
    public final String f42263a;

    /* JADX INFO: renamed from: b */
    public final String f42264b;

    public cv01(String str, String str2) {
        this.f42263a = str;
        this.f42264b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv01)) {
            return false;
        }
        cv01 cv01Var = (cv01) obj;
        return wj50.m88271j(this.f42263a, cv01Var.f42263a) && wj50.m88271j(this.f42264b, cv01Var.f42264b);
    }

    public final int hashCode() {
        int iHashCode = this.f42263a.hashCode() * 31;
        String str = this.f42264b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42263a);
        parcel.writeString(this.f42264b);
    }
}
