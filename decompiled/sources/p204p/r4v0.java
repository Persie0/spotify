package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class r4v0 implements Parcelable {
    public static final Parcelable.Creator<r4v0> CREATOR = new h1v0(2);

    /* JADX INFO: renamed from: a */
    public final String f195857a;

    /* JADX INFO: renamed from: b */
    public final String f195858b;

    public r4v0(String str, String str2) {
        this.f195857a = str;
        this.f195858b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4v0)) {
            return false;
        }
        r4v0 r4v0Var = (r4v0) obj;
        return wj50.m88271j(this.f195857a, r4v0Var.f195857a) && wj50.m88271j(this.f195858b, r4v0Var.f195858b);
    }

    public final int hashCode() {
        int iHashCode = this.f195857a.hashCode() * 31;
        String str = this.f195858b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f195857a);
        parcel.writeString(this.f195858b);
    }
}
