package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class pl71 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final pl71 f178659a = new pl71();
    public static final Parcelable.Creator<pl71> CREATOR = new c071(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pl71);
    }

    public final int hashCode() {
        return 1976586971;
    }

    public final String toString() {
        return "TimeCapUpsellPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
