package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fsx0 implements Parcelable {
    public static final Parcelable.Creator<fsx0> CREATOR = new csx0(2);

    /* JADX INFO: renamed from: a */
    public final int f73001a;

    /* JADX INFO: renamed from: b */
    public final int f73002b;

    public fsx0(int i, int i2) {
        this.f73001a = i;
        this.f73002b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsx0)) {
            return false;
        }
        fsx0 fsx0Var = (fsx0) obj;
        return this.f73001a == fsx0Var.f73001a && this.f73002b == fsx0Var.f73002b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73002b) + (Integer.hashCode(this.f73001a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73001a);
        parcel.writeInt(this.f73002b);
    }
}
