package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class av01 extends rv01 {

    /* JADX INFO: renamed from: a */
    public static final av01 f20063a = new av01();
    public static final Parcelable.Creator<av01> CREATOR = new sp01(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof av01);
    }

    public final int hashCode() {
        return 1866466225;
    }

    public final String toString() {
        return "InternalLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
