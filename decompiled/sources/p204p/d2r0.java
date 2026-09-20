package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d2r0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final d2r0 f44665a = new d2r0();
    public static final Parcelable.Creator<d2r0> CREATOR = new vzq0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d2r0);
    }

    public final int hashCode() {
        return 773143011;
    }

    public final String toString() {
        return "PresetListPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
