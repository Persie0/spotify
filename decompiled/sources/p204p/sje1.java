package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sje1 implements tje1 {

    /* JADX INFO: renamed from: a */
    public static final sje1 f209829a = new sje1();
    public static final Parcelable.Creator<sje1> CREATOR = new xed1(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sje1);
    }

    public final int hashCode() {
        return -134017727;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
