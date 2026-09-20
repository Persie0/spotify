package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ads0 implements k3r, Parcelable {
    public static final Parcelable.Creator<ads0> CREATOR = new uir0(29);

    /* JADX INFO: renamed from: a */
    public final String f14679a;

    /* JADX INFO: renamed from: b */
    public final String f14680b;

    /* JADX INFO: renamed from: c */
    public final int f14681c;

    public ads0(String str, String str2, int i) {
        this.f14679a = str;
        this.f14680b = str2;
        this.f14681c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads0)) {
            return false;
        }
        ads0 ads0Var = (ads0) obj;
        return wj50.m88271j(this.f14679a, ads0Var.f14679a) && wj50.m88271j(this.f14680b, ads0Var.f14680b) && this.f14681c == ads0Var.f14681c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14681c) + s571.m77243b(this.f14679a.hashCode() * 31, 31, this.f14680b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14679a);
        parcel.writeString(this.f14680b);
        parcel.writeInt(this.f14681c);
    }
}
