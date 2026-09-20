package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class yu01 extends rv01 {

    /* JADX INFO: renamed from: a */
    public static final yu01 f276244a = new yu01();
    public static final Parcelable.Creator<yu01> CREATOR = new sp01(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yu01);
    }

    public final int hashCode() {
        return 81877951;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
