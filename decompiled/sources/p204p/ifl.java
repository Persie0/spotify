package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ifl implements kfl {
    public static final Parcelable.Creator<ifl> CREATOR = new z4l(16);

    /* JADX INFO: renamed from: a */
    public final boolean f101779a;

    public ifl(boolean z) {
        this.f101779a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifl) && this.f101779a == ((ifl) obj).f101779a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101779a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f101779a ? 1 : 0);
    }
}
