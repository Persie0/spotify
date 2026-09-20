package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class uc81 implements vc81 {

    /* JADX INFO: renamed from: a */
    public static final uc81 f228971a = new uc81();
    public static final Parcelable.Creator<uc81> CREATOR = new f881(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uc81);
    }

    public final int hashCode() {
        return -911991503;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
