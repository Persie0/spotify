package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class w320 implements x320 {

    /* JADX INFO: renamed from: a */
    public static final w320 f247465a = new w320();
    public static final Parcelable.Creator<w320> CREATOR = new t320(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w320);
    }

    public final int hashCode() {
        return 1100201045;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
