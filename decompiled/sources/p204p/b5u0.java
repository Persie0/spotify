package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b5u0 implements f5u0 {
    public static final Parcelable.Creator<b5u0> CREATOR = new vit0(28);

    /* JADX INFO: renamed from: a */
    public final int f23702a;

    /* JADX INFO: renamed from: b */
    public final int f23703b;

    public b5u0(int i, int i2) {
        this.f23702a = i;
        this.f23703b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5u0)) {
            return false;
        }
        b5u0 b5u0Var = (b5u0) obj;
        return this.f23702a == b5u0Var.f23702a && this.f23703b == b5u0Var.f23703b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23703b) + (Integer.hashCode(this.f23702a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23702a);
        parcel.writeInt(this.f23703b);
    }
}
