package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vzd extends yzd {

    /* JADX INFO: renamed from: a */
    public static final vzd f246440a = new vzd();
    public static final Parcelable.Creator<vzd> CREATOR = new fjd(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vzd);
    }

    public final int hashCode() {
        return -1769494731;
    }

    public final String toString() {
        return "Failure";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
