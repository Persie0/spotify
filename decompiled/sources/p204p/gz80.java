package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gz80 implements Parcelable {
    public static final Parcelable.Creator<gz80> CREATOR = new ct80(14);

    /* JADX INFO: renamed from: a */
    public final String f85864a;

    /* JADX INFO: renamed from: b */
    public final String f85865b;

    public gz80(String str, String str2) {
        this.f85864a = str;
        this.f85865b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz80)) {
            return false;
        }
        gz80 gz80Var = (gz80) obj;
        return wj50.m88271j(this.f85864a, gz80Var.f85864a) && wj50.m88271j(this.f85865b, gz80Var.f85865b);
    }

    public final int hashCode() {
        String str = this.f85864a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85865b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85864a);
        parcel.writeString(this.f85865b);
    }
}
