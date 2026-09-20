package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kiq0 implements Parcelable {
    public static final Parcelable.Creator<kiq0> CREATOR = new vnp0(16);

    /* JADX INFO: renamed from: a */
    public final String f123042a;

    /* JADX INFO: renamed from: b */
    public final String f123043b;

    public kiq0(String str, String str2) {
        this.f123042a = str;
        this.f123043b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiq0)) {
            return false;
        }
        kiq0 kiq0Var = (kiq0) obj;
        return wj50.m88271j(this.f123042a, kiq0Var.f123042a) && wj50.m88271j(this.f123043b, kiq0Var.f123043b);
    }

    public final int hashCode() {
        return this.f123043b.hashCode() + (this.f123042a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f123042a);
        parcel.writeString(this.f123043b);
    }
}
