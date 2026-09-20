package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a6k implements g6k {

    /* JADX INFO: renamed from: a */
    public static final a6k f12813a = new a6k();
    public static final Parcelable.Creator<a6k> CREATOR = new dnj(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a6k);
    }

    public final int hashCode() {
        return -569300937;
    }

    public final String toString() {
        return "Report";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
