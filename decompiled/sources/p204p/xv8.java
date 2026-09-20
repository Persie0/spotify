package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xv8 extends zv8 {
    public static final Parcelable.Creator<xv8> CREATOR = new yi8(25);

    /* JADX INFO: renamed from: a */
    public final int f266310a;

    /* JADX INFO: renamed from: b */
    public final int f266311b;

    public xv8(int i, int i2) {
        this.f266310a = i;
        this.f266311b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv8)) {
            return false;
        }
        xv8 xv8Var = (xv8) obj;
        return this.f266310a == xv8Var.f266310a && this.f266311b == xv8Var.f266311b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f266311b) + (Integer.hashCode(this.f266310a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f266310a);
        parcel.writeInt(this.f266311b);
    }
}
