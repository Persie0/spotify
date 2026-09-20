package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ma90 implements na90 {

    /* JADX INFO: renamed from: a */
    public static final ma90 f141543a = new ma90();
    public static final Parcelable.Creator<ma90> CREATOR = new x390(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ma90);
    }

    public final int hashCode() {
        return -563908143;
    }

    public final String toString() {
        return "YourActivity";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
