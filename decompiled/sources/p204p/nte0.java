package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class nte0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final nte0 f158057a = new nte0();
    public static final Parcelable.Creator<nte0> CREATOR = new ube0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nte0);
    }

    public final int hashCode() {
        return -877503472;
    }

    public final String toString() {
        return "Snackbar";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
