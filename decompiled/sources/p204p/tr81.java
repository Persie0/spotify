package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tr81 implements as81 {

    /* JADX INFO: renamed from: a */
    public static final tr81 f223009a = new tr81();
    public static final Parcelable.Creator<tr81> CREATOR = new f881(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tr81);
    }

    public final int hashCode() {
        return -440504099;
    }

    public final String toString() {
        return "AudioOnly";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
