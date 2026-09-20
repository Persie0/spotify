package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ggo0 extends mgo0 {
    public static final Parcelable.Creator<ggo0> CREATOR = new o2o0(28);

    /* JADX INFO: renamed from: a */
    public final boolean f79709a;

    /* JADX INFO: renamed from: b */
    public final boolean f79710b;

    public ggo0(boolean z, boolean z2) {
        this.f79709a = z;
        this.f79710b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggo0)) {
            return false;
        }
        ggo0 ggo0Var = (ggo0) obj;
        return this.f79709a == ggo0Var.f79709a && this.f79710b == ggo0Var.f79710b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79710b) + (Boolean.hashCode(this.f79709a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f79709a ? 1 : 0);
        parcel.writeInt(this.f79710b ? 1 : 0);
    }
}
