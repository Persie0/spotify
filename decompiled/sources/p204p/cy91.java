package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cy91 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final cy91 f43193a = new cy91();
    public static final Parcelable.Creator<cy91> CREATOR = new f891(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cy91);
    }

    public final int hashCode() {
        return -168386747;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
