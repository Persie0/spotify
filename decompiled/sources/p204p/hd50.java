package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hd50 implements Parcelable {
    public static final Parcelable.Creator<hd50> CREATOR = new gd50(0);

    /* JADX INFO: renamed from: a */
    public final String f90006a;

    /* JADX INFO: renamed from: b */
    public final boolean f90007b;

    public hd50(String str, boolean z) {
        this.f90006a = str;
        this.f90007b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd50)) {
            return false;
        }
        hd50 hd50Var = (hd50) obj;
        return wj50.m88271j(this.f90006a, hd50Var.f90006a) && this.f90007b == hd50Var.f90007b;
    }

    public final String getUri() {
        return this.f90006a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90007b) + (this.f90006a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f90006a);
        parcel.writeInt(this.f90007b ? 1 : 0);
    }
}
