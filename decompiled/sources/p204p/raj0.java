package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class raj0 implements taj0 {

    /* JADX INFO: renamed from: a */
    public static final raj0 f197334a = new raj0();
    public static final Parcelable.Creator<raj0> CREATOR = new rri0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof raj0);
    }

    public final int hashCode() {
        return 1397790828;
    }

    public final String toString() {
        return "JamJoined";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
