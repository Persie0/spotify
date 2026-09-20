package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class vky implements aly {
    public static final Parcelable.Creator<vky> CREATOR = new p7y(23);

    /* JADX INFO: renamed from: a */
    public final boolean f242314a;

    public vky(boolean z) {
        this.f242314a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vky) && this.f242314a == ((vky) obj).f242314a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242314a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f242314a ? 1 : 0);
    }
}
