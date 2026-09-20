package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dx30 implements Parcelable {
    public static final Parcelable.Creator<dx30> CREATOR = new bw30(25);

    /* JADX INFO: renamed from: a */
    public final String f53837a;

    /* JADX INFO: renamed from: b */
    public final String f53838b;

    /* JADX INFO: renamed from: c */
    public final String f53839c;

    public dx30(String str, String str2, String str3) {
        this.f53837a = str;
        this.f53838b = str2;
        this.f53839c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx30)) {
            return false;
        }
        dx30 dx30Var = (dx30) obj;
        return wj50.m88271j(this.f53837a, dx30Var.f53837a) && wj50.m88271j(this.f53838b, dx30Var.f53838b) && wj50.m88271j(this.f53839c, dx30Var.f53839c);
    }

    public final int hashCode() {
        int iHashCode = this.f53837a.hashCode() * 31;
        String str = this.f53838b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53839c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f53837a);
        parcel.writeString(this.f53838b);
        parcel.writeString(this.f53839c);
    }
}
