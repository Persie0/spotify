package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zu6 implements av6 {

    /* JADX INFO: renamed from: a */
    public static final zu6 f286354a = new zu6();
    public static final Parcelable.Creator<zu6> CREATOR = new fi6(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zu6);
    }

    public final int hashCode() {
        return 472027483;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
