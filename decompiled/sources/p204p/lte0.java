package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class lte0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final lte0 f136766a = new lte0();
    public static final Parcelable.Creator<lte0> CREATOR = new ube0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lte0);
    }

    public final int hashCode() {
        return 1133754131;
    }

    public final String toString() {
        return "Dialog";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
