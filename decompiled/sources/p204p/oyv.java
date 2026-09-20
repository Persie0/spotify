package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class oyv extends tyv {

    /* JADX INFO: renamed from: b */
    public static final oyv f171906b = new oyv("accountCreation");
    public static final Parcelable.Creator<oyv> CREATOR = new bwv(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oyv);
    }

    public final int hashCode() {
        return 1230735539;
    }

    public final String toString() {
        return "AccountCreation";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
