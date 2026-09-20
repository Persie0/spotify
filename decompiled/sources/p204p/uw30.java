package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uw30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final uw30 f234559c = new uw30(31, 1);
    public static final Parcelable.Creator<uw30> CREATOR = new bw30(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uw30);
    }

    public final int hashCode() {
        return 215177154;
    }

    public final String toString() {
        return "ListeningActivityStartJamErrorDialog";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
