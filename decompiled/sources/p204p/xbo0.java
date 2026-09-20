package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xbo0 implements Parcelable {
    public static final Parcelable.Creator<xbo0> CREATOR = new o2o0(14);

    /* JADX INFO: renamed from: a */
    public final String f259970a;

    /* JADX INFO: renamed from: b */
    public final boolean f259971b;

    public xbo0(String str, boolean z) {
        this.f259970a = str;
        this.f259971b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbo0)) {
            return false;
        }
        xbo0 xbo0Var = (xbo0) obj;
        return wj50.m88271j(this.f259970a, xbo0Var.f259970a) && this.f259971b == xbo0Var.f259971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259971b) + (this.f259970a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f259970a);
        parcel.writeInt(this.f259971b ? 1 : 0);
    }
}
