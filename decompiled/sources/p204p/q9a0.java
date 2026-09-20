package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class q9a0 implements aaa0 {

    /* JADX INFO: renamed from: a */
    public static final q9a0 f186550a = new q9a0();
    public static final Parcelable.Creator<q9a0> CREATOR = new z8a0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q9a0);
    }

    public final int hashCode() {
        return 393132580;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
