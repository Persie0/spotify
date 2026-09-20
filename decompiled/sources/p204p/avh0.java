package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class avh0 implements bvh0 {

    /* JADX INFO: renamed from: a */
    public static final avh0 f20194a = new avh0();
    public static final Parcelable.Creator<avh0> CREATOR = new ruh0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof avh0);
    }

    public final int hashCode() {
        return 1541353473;
    }

    public final String toString() {
        return "View";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
