package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class jvh0 implements vvh0 {

    /* JADX INFO: renamed from: a */
    public static final jvh0 f116357a = new jvh0();
    public static final Parcelable.Creator<jvh0> CREATOR = new ruh0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jvh0);
    }

    public final int hashCode() {
        return -682753767;
    }

    public final String toString() {
        return "PreloadError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
