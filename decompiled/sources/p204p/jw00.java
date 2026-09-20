package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jw00 implements kw00 {

    /* JADX INFO: renamed from: a */
    public static final jw00 f116551a = new jw00();
    public static final Parcelable.Creator<jw00> CREATOR = new k700(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jw00);
    }

    public final int hashCode() {
        return -1135330818;
    }

    public final String toString() {
        return "Permit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
