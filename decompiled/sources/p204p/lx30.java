package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lx30 implements Parcelable {
    public static final Parcelable.Creator<lx30> CREATOR = new bw30(27);

    /* JADX INFO: renamed from: a */
    public final String f137707a;

    /* JADX INFO: renamed from: b */
    public final String f137708b;

    /* JADX INFO: renamed from: c */
    public final String f137709c;

    /* JADX INFO: renamed from: d */
    public final boolean f137710d;

    public lx30(String str, String str2, String str3, boolean z) {
        this.f137707a = str;
        this.f137708b = str2;
        this.f137709c = str3;
        this.f137710d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx30)) {
            return false;
        }
        lx30 lx30Var = (lx30) obj;
        return wj50.m88271j(this.f137707a, lx30Var.f137707a) && wj50.m88271j(this.f137708b, lx30Var.f137708b) && wj50.m88271j(this.f137709c, lx30Var.f137709c) && this.f137710d == lx30Var.f137710d;
    }

    public final int hashCode() {
        int iHashCode = this.f137707a.hashCode() * 31;
        String str = this.f137708b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137709c;
        return Boolean.hashCode(this.f137710d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f137707a);
        parcel.writeString(this.f137708b);
        parcel.writeString(this.f137709c);
        parcel.writeInt(this.f137710d ? 1 : 0);
    }
}
