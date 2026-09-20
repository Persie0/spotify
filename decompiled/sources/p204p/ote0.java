package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ote0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final ote0 f169048a = new ote0();
    public static final Parcelable.Creator<ote0> CREATOR = new ube0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ote0);
    }

    public final int hashCode() {
        return -2008461416;
    }

    public final String toString() {
        return "Tooltip";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
