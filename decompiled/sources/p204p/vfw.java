package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vfw implements agw {
    public static final Parcelable.Creator<vfw> CREATOR = new bwv(29);

    /* JADX INFO: renamed from: a */
    public final int f241042a;

    public vfw(int i) {
        this.f241042a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfw) && this.f241042a == ((vfw) obj).f241042a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241042a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f241042a);
    }
}
