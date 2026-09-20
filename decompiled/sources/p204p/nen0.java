package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nen0 implements Parcelable {
    public static final Parcelable.Creator<nen0> CREATOR = new luh0(7);

    /* JADX INFO: renamed from: a */
    public final double f153033a;

    /* JADX INFO: renamed from: b */
    public final String f153034b;

    public nen0(String str, double d) {
        this.f153033a = d;
        this.f153034b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nen0)) {
            return false;
        }
        nen0 nen0Var = (nen0) obj;
        return Double.compare(this.f153033a, nen0Var.f153033a) == 0 && wj50.m88271j(this.f153034b, nen0Var.f153034b);
    }

    public final int hashCode() {
        return this.f153034b.hashCode() + (Double.hashCode(this.f153033a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f153033a);
        parcel.writeString(this.f153034b);
    }
}
