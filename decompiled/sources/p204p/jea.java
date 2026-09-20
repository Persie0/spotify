package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jea extends qea {

    /* JADX INFO: renamed from: a */
    public static final jea f111516a = new jea();
    public static final Parcelable.Creator<jea> CREATOR = new dc9(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jea);
    }

    public final int hashCode() {
        return 1024699657;
    }

    public final String toString() {
        return "Eq";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
