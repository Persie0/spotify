package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vb81 implements Parcelable {
    public static final Parcelable.Creator<vb81> CREATOR = new f881(2);

    /* JADX INFO: renamed from: a */
    public final String f239436a;

    /* JADX INFO: renamed from: b */
    public final String f239437b;

    /* JADX INFO: renamed from: c */
    public final String f239438c;

    /* JADX INFO: renamed from: d */
    public final String f239439d;

    public vb81(String str, String str2, String str3, String str4) {
        this.f239436a = str;
        this.f239437b = str2;
        this.f239438c = str3;
        this.f239439d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb81)) {
            return false;
        }
        vb81 vb81Var = (vb81) obj;
        return wj50.m88271j(this.f239436a, vb81Var.f239436a) && wj50.m88271j(this.f239437b, vb81Var.f239437b) && wj50.m88271j(this.f239438c, vb81Var.f239438c) && wj50.m88271j(this.f239439d, vb81Var.f239439d);
    }

    public final int hashCode() {
        int iHashCode = this.f239436a.hashCode() * 31;
        String str = this.f239437b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f239438c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f239439d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239436a);
        parcel.writeString(this.f239437b);
        parcel.writeString(this.f239438c);
        parcel.writeString(this.f239439d);
    }
}
