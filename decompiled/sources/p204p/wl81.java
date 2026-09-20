package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wl81 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final wl81 f252487a = new wl81();
    public static final Parcelable.Creator<wl81> CREATOR = new f881(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wl81);
    }

    public final int hashCode() {
        return 1396393329;
    }

    public final String toString() {
        return "ContentWindowing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
