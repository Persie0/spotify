package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xcu0 implements Parcelable {
    public static final Parcelable.Creator<xcu0> CREATOR = new v5u0(11);

    /* JADX INFO: renamed from: a */
    public final String f260286a;

    /* JADX INFO: renamed from: b */
    public final int f260287b;

    public xcu0(String str, int i) {
        this.f260286a = str;
        this.f260287b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcu0)) {
            return false;
        }
        xcu0 xcu0Var = (xcu0) obj;
        return wj50.m88271j(this.f260286a, xcu0Var.f260286a) && this.f260287b == xcu0Var.f260287b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260287b) + (this.f260286a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f260286a);
        parcel.writeInt(this.f260287b);
    }
}
