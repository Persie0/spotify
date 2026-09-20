package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class kea extends qea {

    /* JADX INFO: renamed from: a */
    public static final kea f121840a = new kea();
    public static final Parcelable.Creator<kea> CREATOR = new dc9(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kea);
    }

    public final int hashCode() {
        return 57341269;
    }

    public final String toString() {
        return "Filter";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
