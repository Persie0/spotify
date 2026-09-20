package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xsm0 implements Parcelable {
    public static final Parcelable.Creator<xsm0> CREATOR = new cpl0(22);

    /* JADX INFO: renamed from: a */
    public final float f265628a;

    /* JADX INFO: renamed from: b */
    public final int f265629b;

    public xsm0(float f, int i) {
        this.f265628a = f;
        this.f265629b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsm0)) {
            return false;
        }
        xsm0 xsm0Var = (xsm0) obj;
        return Float.compare(this.f265628a, xsm0Var.f265628a) == 0 && this.f265629b == xsm0Var.f265629b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f265629b) + (Float.hashCode(this.f265628a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloat(this.f265628a);
        int i2 = this.f265629b;
        if (i2 == 1) {
            str = "PX";
        } else if (i2 == 2) {
            str = "DP";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SP";
        }
        parcel.writeString(str);
    }
}
