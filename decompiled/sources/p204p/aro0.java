package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class aro0 implements sro0 {

    /* JADX INFO: renamed from: a */
    public static final aro0 f19114a = new aro0();
    public static final Parcelable.Creator<aro0> CREATOR = new igo0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aro0);
    }

    public final int hashCode() {
        return -1523162390;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
