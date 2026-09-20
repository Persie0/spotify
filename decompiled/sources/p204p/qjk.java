package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qjk implements sjk {

    /* JADX INFO: renamed from: a */
    public static final qjk f189264a = new qjk();
    public static final Parcelable.Creator<qjk> CREATOR = new kck(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qjk);
    }

    public final int hashCode() {
        return -293886255;
    }

    public final String toString() {
        return "Admin";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
