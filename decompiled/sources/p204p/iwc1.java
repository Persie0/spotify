package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class iwc1 extends kwc1 {

    /* JADX INFO: renamed from: a */
    public static final iwc1 f106395a = new iwc1();
    public static final Parcelable.Creator<iwc1> CREATOR = new vmc1(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iwc1);
    }

    public final int hashCode() {
        return -533419900;
    }

    public final String toString() {
        return "Custom";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
