package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mea extends qea {

    /* JADX INFO: renamed from: a */
    public static final mea f142643a = new mea();
    public static final Parcelable.Creator<mea> CREATOR = new dc9(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mea);
    }

    public final int hashCode() {
        return -1458548874;
    }

    public final String toString() {
        return "Jogwheel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
