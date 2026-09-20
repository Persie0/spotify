package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ga90 implements ha90 {

    /* JADX INFO: renamed from: a */
    public static final ga90 f78004a = new ga90();
    public static final Parcelable.Creator<ga90> CREATOR = new x390(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ga90);
    }

    public final int hashCode() {
        return -1194522531;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
