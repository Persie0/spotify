package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rjk implements sjk {

    /* JADX INFO: renamed from: a */
    public static final rjk f199844a = new rjk();
    public static final Parcelable.Creator<rjk> CREATOR = new kck(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rjk);
    }

    public final int hashCode() {
        return -176072872;
    }

    public final String toString() {
        return "Member";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
