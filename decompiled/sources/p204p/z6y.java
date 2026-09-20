package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class z6y implements b7y {

    /* JADX INFO: renamed from: a */
    public static final z6y f280015a = new z6y();
    public static final Parcelable.Creator<z6y> CREATOR = new wfw(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z6y);
    }

    public final int hashCode() {
        return 301001337;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
