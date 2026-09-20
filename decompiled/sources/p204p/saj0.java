package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class saj0 implements taj0 {

    /* JADX INFO: renamed from: a */
    public static final saj0 f207223a = new saj0();
    public static final Parcelable.Creator<saj0> CREATOR = new rri0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof saj0);
    }

    public final int hashCode() {
        return -1401231594;
    }

    public final String toString() {
        return "Settings";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
