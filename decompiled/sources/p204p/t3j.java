package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class t3j implements w3j {

    /* JADX INFO: renamed from: a */
    public static final t3j f216787a = new t3j();
    public static final Parcelable.Creator<t3j> CREATOR = new f2i(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t3j);
    }

    public final int hashCode() {
        return -870103678;
    }

    public final String toString() {
        return "Availability";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
