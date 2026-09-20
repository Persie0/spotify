package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class by91 extends gy91 {

    /* JADX INFO: renamed from: a */
    public static final by91 f32116a = new by91();
    public static final Parcelable.Creator<by91> CREATOR = new f891(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof by91);
    }

    public final int hashCode() {
        return 312979043;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
