package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class up01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final up01 f232548d = new up01(null, "spotify-on-platform-single");
    public static final Parcelable.Creator<up01> CREATOR = new sp01(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof up01);
    }

    public final int hashCode() {
        return 547087906;
    }

    public final String toString() {
        return "Single";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
