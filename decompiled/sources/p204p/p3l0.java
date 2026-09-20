package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class p3l0 implements Parcelable {
    public static final Parcelable.Creator<p3l0> CREATOR = new oxk0(23);

    /* JADX INFO: renamed from: a */
    public final String f173669a;

    /* JADX INFO: renamed from: b */
    public final String f173670b;

    public p3l0(String str, String str2) {
        this.f173669a = str;
        this.f173670b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3l0)) {
            return false;
        }
        p3l0 p3l0Var = (p3l0) obj;
        return wj50.m88271j(this.f173669a, p3l0Var.f173669a) && wj50.m88271j(this.f173670b, p3l0Var.f173670b);
    }

    public final int hashCode() {
        int iHashCode = this.f173669a.hashCode() * 31;
        String str = this.f173670b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f173669a);
        parcel.writeString(this.f173670b);
    }
}
