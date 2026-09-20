package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class onv extends pnv {

    /* JADX INFO: renamed from: a */
    public static final onv f167364a = new onv();
    public static final Parcelable.Creator<onv> CREATOR = new m8v(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof onv);
    }

    public final int hashCode() {
        return 571155852;
    }

    public final String toString() {
        return "Template";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
