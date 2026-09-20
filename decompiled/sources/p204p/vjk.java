package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vjk implements xjk {

    /* JADX INFO: renamed from: a */
    public static final vjk f242006a = new vjk();
    public static final Parcelable.Creator<vjk> CREATOR = new kck(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vjk);
    }

    public final int hashCode() {
        return -1749918946;
    }

    public final String toString() {
        return "OptedOut";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
