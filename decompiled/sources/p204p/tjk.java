package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tjk implements xjk {

    /* JADX INFO: renamed from: a */
    public static final tjk f220940a = new tjk();
    public static final Parcelable.Creator<tjk> CREATOR = new kck(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tjk);
    }

    public final int hashCode() {
        return 2079221576;
    }

    public final String toString() {
        return "Active";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
