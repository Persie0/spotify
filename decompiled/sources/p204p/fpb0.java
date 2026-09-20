package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class fpb0 extends gpb0 {
    public static final Parcelable.Creator<fpb0> CREATOR = new apb0(4);

    /* JADX INFO: renamed from: a */
    public final int f71791a;

    /* JADX INFO: renamed from: b */
    public final int f71792b;

    public fpb0(int i, int i2) {
        this.f71791a = i;
        this.f71792b = i2;
    }

    @Override // p204p.gpb0
    /* JADX INFO: renamed from: c */
    public final int mo39642c() {
        return this.f71791a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpb0)) {
            return false;
        }
        fpb0 fpb0Var = (fpb0) obj;
        return this.f71791a == fpb0Var.f71791a && this.f71792b == fpb0Var.f71792b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71792b) + (Integer.hashCode(this.f71791a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f71791a);
        parcel.writeInt(this.f71792b);
    }
}
