package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zum0 implements Parcelable {
    public static final Parcelable.Creator<zum0> CREATOR = new pum0(6);

    /* JADX INFO: renamed from: a */
    public final String f286470a;

    /* JADX INFO: renamed from: b */
    public final boolean f286471b;

    /* JADX INFO: renamed from: c */
    public final String f286472c;

    /* JADX INFO: renamed from: d */
    public final String f286473d;

    public zum0(String str, String str2, String str3, boolean z) {
        this.f286470a = str;
        this.f286471b = z;
        this.f286472c = str2;
        this.f286473d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zum0)) {
            return false;
        }
        zum0 zum0Var = (zum0) obj;
        return wj50.m88271j(this.f286470a, zum0Var.f286470a) && this.f286471b == zum0Var.f286471b && wj50.m88271j(this.f286472c, zum0Var.f286472c) && wj50.m88271j(this.f286473d, zum0Var.f286473d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f286470a.hashCode() * 31, 31, this.f286471b);
        String str = this.f286472c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f286473d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286470a);
        parcel.writeInt(this.f286471b ? 1 : 0);
        parcel.writeString(this.f286472c);
        parcel.writeString(this.f286473d);
    }
}
