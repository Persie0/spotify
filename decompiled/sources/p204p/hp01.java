package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final hp01 f93667d = new hp01(8, "facebook-feed");
    public static final Parcelable.Creator<hp01> CREATOR = new vj01(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hp01);
    }

    public final int hashCode() {
        return -219072546;
    }

    public final String toString() {
        return "FacebookFeed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
