package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class syv extends tyv {

    /* JADX INFO: renamed from: b */
    public static final syv f215342b = new syv("parentalConsent");
    public static final Parcelable.Creator<syv> CREATOR = new bwv(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof syv);
    }

    public final int hashCode() {
        return 456004748;
    }

    public final String toString() {
        return "ParentalConsent";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
