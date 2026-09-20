package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class k111 extends l111 {

    /* JADX INFO: renamed from: a */
    public static final k111 f118185a = new k111();
    public static final Parcelable.Creator<k111> CREATOR = new bv01(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k111);
    }

    public final int hashCode() {
        return -1138523421;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
