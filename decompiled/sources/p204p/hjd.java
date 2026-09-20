package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hjd extends jjd {

    /* JADX INFO: renamed from: a */
    public static final hjd f92033a = new hjd();
    public static final Parcelable.Creator<hjd> CREATOR = new fjd(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hjd);
    }

    public final int hashCode() {
        return 1815809048;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
