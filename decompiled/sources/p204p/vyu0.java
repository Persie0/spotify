package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class vyu0 implements xyu0 {

    /* JADX INFO: renamed from: a */
    public static final vyu0 f246331a = new vyu0();
    public static final Parcelable.Creator<vyu0> CREATOR = new v5u0(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vyu0);
    }

    public final int hashCode() {
        return 769737032;
    }

    public final String toString() {
        return "Disabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
