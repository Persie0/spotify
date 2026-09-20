package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class chv extends mhv {

    /* JADX INFO: renamed from: a */
    public static final chv f38091a = new chv();
    public static final Parcelable.Creator<chv> CREATOR = new m8v(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof chv);
    }

    public final int hashCode() {
        return -468412227;
    }

    public final String toString() {
        return "DSABanner";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
