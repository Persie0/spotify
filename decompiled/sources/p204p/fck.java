package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fck implements ick {

    /* JADX INFO: renamed from: a */
    public static final fck f68135a = new fck();
    public static final Parcelable.Creator<fck> CREATOR = new dnj(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fck);
    }

    public final int hashCode() {
        return -140445627;
    }

    public final String toString() {
        return "NOT_REPORTED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
