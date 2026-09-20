package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class brb1 implements erb1 {

    /* JADX INFO: renamed from: a */
    public static final brb1 f30073a = new brb1();
    public static final Parcelable.Creator<brb1> CREATOR = new c8b1(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof brb1);
    }

    public final int hashCode() {
        return 1920895217;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
