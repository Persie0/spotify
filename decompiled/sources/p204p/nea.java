package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nea extends qea {

    /* JADX INFO: renamed from: a */
    public static final nea f152967a = new nea();
    public static final Parcelable.Creator<nea> CREATOR = new dc9(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nea);
    }

    public final int hashCode() {
        return -1312903039;
    }

    public final String toString() {
        return "Looping";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
