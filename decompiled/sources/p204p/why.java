package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class why implements xhy {

    /* JADX INFO: renamed from: a */
    public static final why f251461a = new why();
    public static final Parcelable.Creator<why> CREATOR = new p7y(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof why);
    }

    public final int hashCode() {
        return -616861599;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
