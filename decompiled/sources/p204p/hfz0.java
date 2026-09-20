package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hfz0 implements Parcelable {
    public static final Parcelable.Creator<hfz0> CREATOR = new vcz0(3);

    /* JADX INFO: renamed from: a */
    public final String f90968a;

    /* JADX INFO: renamed from: b */
    public final boolean f90969b;

    public hfz0(String str, boolean z) {
        this.f90968a = str;
        this.f90969b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfz0)) {
            return false;
        }
        hfz0 hfz0Var = (hfz0) obj;
        return wj50.m88271j(this.f90968a, hfz0Var.f90968a) && this.f90969b == hfz0Var.f90969b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90969b) + (this.f90968a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f90968a);
        parcel.writeInt(this.f90969b ? 1 : 0);
    }
}
