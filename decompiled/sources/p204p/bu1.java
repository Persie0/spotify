package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class bu1 implements du1 {

    /* JADX INFO: renamed from: a */
    public static final bu1 f30982a = new bu1();
    public static final Parcelable.Creator<bu1> CREATOR = new zt1(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bu1);
    }

    public final int hashCode() {
        return 1843842739;
    }

    public final String toString() {
        return "PreselectDefaultSaveLocations";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
