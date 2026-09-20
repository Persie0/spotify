package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class l990 implements q990 {

    /* JADX INFO: renamed from: a */
    public static final l990 f131040a = new l990();
    public static final Parcelable.Creator<l990> CREATOR = new x390(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l990);
    }

    public final int hashCode() {
        return -515912136;
    }

    public final String toString() {
        return "MultipleIdle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
