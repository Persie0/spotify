package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vhc implements Parcelable {
    public static final Parcelable.Creator<vhc> CREATOR = new a5c(12);

    /* JADX INFO: renamed from: a */
    public final int f241466a;

    public /* synthetic */ vhc(int i) {
        this.f241466a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vhc) {
            return this.f241466a == ((vhc) obj).f241466a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241466a);
    }

    public final String toString() {
        return edb.m38563l("CellIndex(value=", this.f241466a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f241466a);
    }
}
