package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tfw implements agw {

    /* JADX INFO: renamed from: a */
    public static final tfw f220061a = new tfw();
    public static final Parcelable.Creator<tfw> CREATOR = new bwv(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tfw);
    }

    public final int hashCode() {
        return 89872044;
    }

    public final String toString() {
        return "OptedOut";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
