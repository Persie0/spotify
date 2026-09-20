package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class naj0 implements taj0 {

    /* JADX INFO: renamed from: a */
    public static final naj0 f152081a = new naj0();
    public static final Parcelable.Creator<naj0> CREATOR = new rri0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof naj0);
    }

    public final int hashCode() {
        return -730406751;
    }

    public final String toString() {
        return "AppLaunch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
