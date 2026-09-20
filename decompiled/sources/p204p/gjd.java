package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gjd extends jjd {

    /* JADX INFO: renamed from: a */
    public static final gjd f80438a = new gjd();
    public static final Parcelable.Creator<gjd> CREATOR = new fjd(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gjd);
    }

    public final int hashCode() {
        return 1991878549;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
