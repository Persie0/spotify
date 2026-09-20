package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class j990 implements r990 {

    /* JADX INFO: renamed from: a */
    public static final j990 f110129a = new j990();
    public static final Parcelable.Creator<j990> CREATOR = new x390(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j990);
    }

    public final int hashCode() {
        return 797643816;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
