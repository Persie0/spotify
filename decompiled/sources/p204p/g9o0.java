package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g9o0 extends h9o0 {

    /* JADX INFO: renamed from: a */
    public static final g9o0 f77848a = new g9o0();
    public static final Parcelable.Creator<g9o0> CREATOR = new o2o0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g9o0);
    }

    public final int hashCode() {
        return -1273168828;
    }

    public final String toString() {
        return "SelfManagedMember";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
