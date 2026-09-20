package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class d2i extends h2i {

    /* JADX INFO: renamed from: a */
    public static final d2i f44568a = new d2i();
    public static final Parcelable.Creator<d2i> CREATOR = new rae(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d2i);
    }

    public final int hashCode() {
        return 637203144;
    }

    public final String toString() {
        return "BeforeSale";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
