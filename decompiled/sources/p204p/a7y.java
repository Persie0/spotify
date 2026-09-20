package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a7y implements b7y {

    /* JADX INFO: renamed from: a */
    public static final a7y f13147a = new a7y();
    public static final Parcelable.Creator<a7y> CREATOR = new wfw(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a7y);
    }

    public final int hashCode() {
        return -320490105;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
