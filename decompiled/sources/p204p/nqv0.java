package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nqv0 implements Parcelable {
    public static final Parcelable.Creator<nqv0> CREATOR = new h1v0(17);

    /* JADX INFO: renamed from: a */
    public final String f157345a;

    /* JADX INFO: renamed from: b */
    public final String f157346b;

    public nqv0(String str, String str2) {
        this.f157345a = str;
        this.f157346b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqv0)) {
            return false;
        }
        nqv0 nqv0Var = (nqv0) obj;
        return wj50.m88271j(this.f157345a, nqv0Var.f157345a) && wj50.m88271j(this.f157346b, nqv0Var.f157346b);
    }

    public final int hashCode() {
        return this.f157346b.hashCode() + (this.f157345a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157345a);
        parcel.writeString(this.f157346b);
    }
}
