package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ur81 implements as81 {

    /* JADX INFO: renamed from: a */
    public static final ur81 f233277a = new ur81();
    public static final Parcelable.Creator<ur81> CREATOR = new f881(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ur81);
    }

    public final int hashCode() {
        return -1027554108;
    }

    public final String toString() {
        return "AudioWithVideo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
