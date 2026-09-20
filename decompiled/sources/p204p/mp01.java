package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final mp01 f145818d = new mp01(6, "instagram-notes");
    public static final Parcelable.Creator<mp01> CREATOR = new vj01(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mp01);
    }

    public final int hashCode() {
        return -1010156023;
    }

    public final String toString() {
        return "InstagramNotes";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
