package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class b0d0 implements d0d0 {

    /* JADX INFO: renamed from: a */
    public static final b0d0 f21856a = new b0d0();
    public static final Parcelable.Creator<b0d0> CREATOR = new f4c0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b0d0);
    }

    public final int hashCode() {
        return -1451225619;
    }

    public final String toString() {
        return "ResumeInFlight";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
