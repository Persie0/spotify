package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class drb1 implements erb1 {

    /* JADX INFO: renamed from: a */
    public static final drb1 f52284a = new drb1();
    public static final Parcelable.Creator<drb1> CREATOR = new c8b1(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof drb1);
    }

    public final int hashCode() {
        return 960004581;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
