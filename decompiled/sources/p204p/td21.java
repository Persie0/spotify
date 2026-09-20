package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class td21 implements ud21 {

    /* JADX INFO: renamed from: a */
    public static final td21 f219218a = new td21();
    public static final Parcelable.Creator<td21> CREATOR = new q321(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof td21);
    }

    public final int hashCode() {
        return 1603082595;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
