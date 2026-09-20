package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hv01 implements Parcelable {
    public static final Parcelable.Creator<hv01> CREATOR = new bv01(0);

    /* JADX INFO: renamed from: a */
    public final float f95520a;

    /* JADX INFO: renamed from: b */
    public final gv01 f95521b;

    public hv01(float f, gv01 gv01Var) {
        this.f95520a = f;
        this.f95521b = gv01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv01)) {
            return false;
        }
        hv01 hv01Var = (hv01) obj;
        return Float.compare(this.f95520a, hv01Var.f95520a) == 0 && wj50.m88271j(this.f95521b, hv01Var.f95521b);
    }

    public final int hashCode() {
        return this.f95521b.hashCode() + (Float.hashCode(this.f95520a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f95520a);
        parcel.writeParcelable(this.f95521b, i);
    }
}
