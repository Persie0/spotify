package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xky implements aly {

    /* JADX INFO: renamed from: a */
    public static final xky f262961a = new xky();
    public static final Parcelable.Creator<xky> CREATOR = new p7y(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xky);
    }

    public final int hashCode() {
        return -1723285709;
    }

    public final String toString() {
        return "InStreamThumbsDown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
