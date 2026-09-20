package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final wp01 f253636d = new wp01(0, "snapchat");
    public static final Parcelable.Creator<wp01> CREATOR = new sp01(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wp01);
    }

    public final int hashCode() {
        return 1543889276;
    }

    public final String toString() {
        return "Snapchat";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
