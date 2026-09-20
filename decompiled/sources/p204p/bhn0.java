package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bhn0 implements Parcelable {
    public static final Parcelable.Creator<bhn0> CREATOR = new n9n0(23);

    /* JADX INFO: renamed from: a */
    public final String f27218a;

    /* JADX INFO: renamed from: b */
    public final String f27219b;

    public bhn0(String str, String str2) {
        this.f27218a = str;
        this.f27219b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhn0)) {
            return false;
        }
        bhn0 bhn0Var = (bhn0) obj;
        return wj50.m88271j(this.f27218a, bhn0Var.f27218a) && wj50.m88271j(this.f27219b, bhn0Var.f27219b);
    }

    public final int hashCode() {
        int iHashCode = this.f27218a.hashCode() * 31;
        String str = this.f27219b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27218a);
        parcel.writeString(this.f27219b);
    }
}
