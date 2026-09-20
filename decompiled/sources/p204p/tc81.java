package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tc81 implements vc81 {

    /* JADX INFO: renamed from: a */
    public static final tc81 f219043a = new tc81();
    public static final Parcelable.Creator<tc81> CREATOR = new f881(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tc81);
    }

    public final int hashCode() {
        return 979416471;
    }

    public final String toString() {
        return "Performance";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
