package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class b6q0 implements Parcelable {
    public static final Parcelable.Creator<b6q0> CREATOR = new vnp0(11);

    /* JADX INFO: renamed from: a */
    public final double f24017a;

    /* JADX INFO: renamed from: b */
    public final double f24018b;

    public b6q0(double d, double d2) {
        this.f24017a = d;
        this.f24018b = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6q0)) {
            return false;
        }
        b6q0 b6q0Var = (b6q0) obj;
        return Double.compare(this.f24017a, b6q0Var.f24017a) == 0 && Double.compare(this.f24018b, b6q0Var.f24018b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f24018b) + (Double.hashCode(this.f24017a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f24017a);
        parcel.writeDouble(this.f24018b);
    }
}
