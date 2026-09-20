package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class kw5 implements n4y {

    /* JADX INFO: renamed from: a */
    public static final kw5 f127008a = new kw5();
    public static final Parcelable.Creator<kw5> CREATOR = new vp5(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kw5);
    }

    public final int hashCode() {
        return 1253048031;
    }

    public final String toString() {
        return "ArtistExtraInfo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
