package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class czv0 implements m8z0 {
    public static final Parcelable.Creator<czv0> CREATOR = new h1v0(21);

    /* JADX INFO: renamed from: a */
    public final String f43645a;

    /* JADX INFO: renamed from: b */
    public final String f43646b;

    public czv0(String str, String str2) {
        this.f43645a = str;
        this.f43646b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czv0)) {
            return false;
        }
        czv0 czv0Var = (czv0) obj;
        return wj50.m88271j(this.f43645a, czv0Var.f43645a) && wj50.m88271j(this.f43646b, czv0Var.f43646b);
    }

    public final int hashCode() {
        return this.f43646b.hashCode() + (this.f43645a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43645a);
        parcel.writeString(this.f43646b);
    }
}
