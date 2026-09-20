package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rfw implements agw {

    /* JADX INFO: renamed from: a */
    public static final rfw f198755a = new rfw();
    public static final Parcelable.Creator<rfw> CREATOR = new bwv(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rfw);
    }

    public final int hashCode() {
        return -957143941;
    }

    public final String toString() {
        return "LinkExpired";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
