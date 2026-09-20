package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jj80 implements Parcelable {
    public static final Parcelable.Creator<jj80> CREATOR = new i980(9);

    /* JADX INFO: renamed from: a */
    public final String f112949a;

    /* JADX INFO: renamed from: b */
    public final String f112950b;

    /* JADX INFO: renamed from: c */
    public final boolean f112951c;

    public jj80(String str, String str2) {
        this.f112949a = str;
        this.f112950b = str2;
        this.f112951c = str == null && str2 == null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj80)) {
            return false;
        }
        jj80 jj80Var = (jj80) obj;
        return wj50.m88271j(this.f112949a, jj80Var.f112949a) && wj50.m88271j(this.f112950b, jj80Var.f112950b);
    }

    public final int hashCode() {
        String str = this.f112949a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f112950b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112949a);
        parcel.writeString(this.f112950b);
    }
}
