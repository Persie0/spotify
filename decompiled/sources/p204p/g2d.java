package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class g2d extends i2d {

    /* JADX INFO: renamed from: a */
    public static final g2d f75887a = new g2d();
    public static final Parcelable.Creator<g2d> CREATOR = new qvc(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g2d);
    }

    public final int hashCode() {
        return -165217852;
    }

    public final String toString() {
        return "GroupChatLeft";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
