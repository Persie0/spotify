package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zud0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final zud0 f286424a = new zud0();
    public static final Parcelable.Creator<zud0> CREATOR = new jfd0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zud0);
    }

    public final int hashCode() {
        return 146765443;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
