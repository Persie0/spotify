package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class pd21 implements rd21 {

    /* JADX INFO: renamed from: a */
    public static final pd21 f176339a = new pd21();
    public static final Parcelable.Creator<pd21> CREATOR = new q321(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pd21);
    }

    public final int hashCode() {
        return -115512910;
    }

    public final String toString() {
        return "Available";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
