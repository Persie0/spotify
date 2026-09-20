package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class f471 extends g471 {

    /* JADX INFO: renamed from: a */
    public static final f471 f65690a = new f471();
    public static final Parcelable.Creator<f471> CREATOR = new c071(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f471);
    }

    public final int hashCode() {
        return -281170989;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
