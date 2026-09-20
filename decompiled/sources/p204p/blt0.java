package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class blt0 implements flt0 {
    public static final Parcelable.Creator<blt0> CREATOR = new vit0(1);

    /* JADX INFO: renamed from: a */
    public final String f28286a;

    /* JADX INFO: renamed from: b */
    public final String f28287b;

    public blt0(String str, String str2) {
        this.f28286a = str;
        this.f28287b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blt0)) {
            return false;
        }
        blt0 blt0Var = (blt0) obj;
        return wj50.m88271j(this.f28286a, blt0Var.f28286a) && wj50.m88271j(this.f28287b, blt0Var.f28287b);
    }

    public final int hashCode() {
        int iHashCode = this.f28286a.hashCode() * 31;
        String str = this.f28287b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28286a);
        parcel.writeString(this.f28287b);
    }
}
