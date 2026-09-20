package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class yky implements aly {

    /* JADX INFO: renamed from: a */
    public static final yky f273858a = new yky();
    public static final Parcelable.Creator<yky> CREATOR = new p7y(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yky);
    }

    public final int hashCode() {
        return -51467442;
    }

    public final String toString() {
        return "ThumbsDown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
