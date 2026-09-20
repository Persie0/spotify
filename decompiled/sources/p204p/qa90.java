package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qa90 implements va90 {

    /* JADX INFO: renamed from: a */
    public static final qa90 f186827a = new qa90();
    public static final Parcelable.Creator<qa90> CREATOR = new x390(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qa90);
    }

    public final int hashCode() {
        return -1764182516;
    }

    public final String toString() {
        return "Failed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
