package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class no3 extends oo3 {

    /* JADX INFO: renamed from: a */
    public static final no3 f156557a = new no3();
    public static final Parcelable.Creator<no3> CREATOR = new bc3(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof no3);
    }

    public final int hashCode() {
        return 1766530882;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
