package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ta90 implements va90 {

    /* JADX INFO: renamed from: a */
    public static final ta90 f218523a = new ta90();
    public static final Parcelable.Creator<ta90> CREATOR = new ra90(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ta90);
    }

    public final int hashCode() {
        return -1726809779;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
