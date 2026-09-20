package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xu6 implements av6 {

    /* JADX INFO: renamed from: a */
    public static final xu6 f266010a = new xu6();
    public static final Parcelable.Creator<xu6> CREATOR = new fi6(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xu6);
    }

    public final int hashCode() {
        return 74579431;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
