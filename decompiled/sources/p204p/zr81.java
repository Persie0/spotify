package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zr81 implements as81 {

    /* JADX INFO: renamed from: a */
    public static final zr81 f285582a = new zr81();
    public static final Parcelable.Creator<zr81> CREATOR = new f881(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zr81);
    }

    public final int hashCode() {
        return -531297694;
    }

    public final String toString() {
        return "VideoUnmapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
