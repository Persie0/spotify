package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ufw implements agw {

    /* JADX INFO: renamed from: a */
    public static final ufw f229885a = new ufw();
    public static final Parcelable.Creator<ufw> CREATOR = new bwv(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ufw);
    }

    public final int hashCode() {
        return -169399153;
    }

    public final String toString() {
        return "RestrictedFromMessaging";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
