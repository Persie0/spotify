package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class pjb0 extends rjb0 {

    /* JADX INFO: renamed from: a */
    public static final pjb0 f178221a = new pjb0();
    public static final Parcelable.Creator<pjb0> CREATOR = new rib0(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pjb0);
    }

    public final int hashCode() {
        return 514518370;
    }

    public final String toString() {
        return "Completed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
