package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class xfo0 extends mgo0 {
    public static final Parcelable.Creator<xfo0> CREATOR = new o2o0(19);

    /* JADX INFO: renamed from: a */
    public final boolean f261049a;

    /* JADX INFO: renamed from: b */
    public final boolean f261050b;

    public xfo0(boolean z, boolean z2) {
        this.f261049a = z;
        this.f261050b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfo0)) {
            return false;
        }
        xfo0 xfo0Var = (xfo0) obj;
        return this.f261049a == xfo0Var.f261049a && this.f261050b == xfo0Var.f261050b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261050b) + (Boolean.hashCode(this.f261049a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f261049a ? 1 : 0);
        parcel.writeInt(this.f261050b ? 1 : 0);
    }
}
