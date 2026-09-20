package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a0d0 implements d0d0 {

    /* JADX INFO: renamed from: a */
    public static final a0d0 f11063a = new a0d0();
    public static final Parcelable.Creator<a0d0> CREATOR = new f4c0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a0d0);
    }

    public final int hashCode() {
        return 1162479287;
    }

    public final String toString() {
        return "Parameterless";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
