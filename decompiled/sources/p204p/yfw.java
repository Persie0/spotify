package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class yfw implements agw {

    /* JADX INFO: renamed from: a */
    public static final yfw f272359a = new yfw();
    public static final Parcelable.Creator<yfw> CREATOR = new wfw(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yfw);
    }

    public final int hashCode() {
        return 1971540482;
    }

    public final String toString() {
        return "UnreleasedMarket";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
