package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yr81 implements as81 {

    /* JADX INFO: renamed from: a */
    public static final yr81 f275423a = new yr81();
    public static final Parcelable.Creator<yr81> CREATOR = new f881(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yr81);
    }

    public final int hashCode() {
        return -1886179319;
    }

    public final String toString() {
        return "VideoMapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
