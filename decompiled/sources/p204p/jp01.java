package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final jp01 f114542d = new jp01(7, "facebook-stories");
    public static final Parcelable.Creator<jp01> CREATOR = new vj01(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jp01);
    }

    public final int hashCode() {
        return 1051911699;
    }

    public final String toString() {
        return "FacebookStories";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
