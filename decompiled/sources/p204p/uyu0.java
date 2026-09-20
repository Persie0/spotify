package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class uyu0 implements Parcelable {
    public static final Parcelable.Creator<uyu0> CREATOR = new luh0(12);

    /* JADX INFO: renamed from: a */
    public final String f235365a;

    /* JADX INFO: renamed from: b */
    public final String f235366b;

    public uyu0(String str, String str2) {
        this.f235365a = str;
        this.f235366b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyu0)) {
            return false;
        }
        uyu0 uyu0Var = (uyu0) obj;
        return wj50.m88271j(this.f235365a, uyu0Var.f235365a) && wj50.m88271j(this.f235366b, uyu0Var.f235366b);
    }

    public final int hashCode() {
        int iHashCode = this.f235365a.hashCode() * 31;
        String str = this.f235366b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f235365a);
        parcel.writeString(this.f235366b);
    }
}
