package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nv01 implements Parcelable {
    public static final Parcelable.Creator<nv01> CREATOR = new bv01(10);

    /* JADX INFO: renamed from: a */
    public final String f158753a;

    /* JADX INFO: renamed from: b */
    public final String f158754b;

    public nv01(String str, String str2) {
        this.f158753a = str;
        this.f158754b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv01)) {
            return false;
        }
        nv01 nv01Var = (nv01) obj;
        return wj50.m88271j(this.f158753a, nv01Var.f158753a) && wj50.m88271j(this.f158754b, nv01Var.f158754b);
    }

    public final int hashCode() {
        return this.f158754b.hashCode() + (this.f158753a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158753a);
        parcel.writeString(this.f158754b);
    }
}
