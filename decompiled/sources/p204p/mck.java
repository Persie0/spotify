package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mck implements nck {

    /* JADX INFO: renamed from: a */
    public static final mck f142173a = new mck();
    public static final Parcelable.Creator<mck> CREATOR = new kck(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mck);
    }

    public final int hashCode() {
        return -1095044347;
    }

    public final String toString() {
        return "Sent";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
