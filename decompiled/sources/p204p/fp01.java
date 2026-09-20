package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final fp01 f71659d = new fp01(null, "spotify-on-platform-create-group");
    public static final Parcelable.Creator<fp01> CREATOR = new vj01(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fp01);
    }

    public final int hashCode() {
        return 181623113;
    }

    public final String toString() {
        return "CreateGroup";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
