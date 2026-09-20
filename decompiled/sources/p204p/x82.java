package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x82 extends b92 {
    public static final Parcelable.Creator<x82> CREATOR = new zt1(20);

    /* JADX INFO: renamed from: a */
    public final int f259032a;

    public x82(int i) {
        this.f259032a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x82) && this.f259032a == ((x82) obj).f259032a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f259032a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f259032a);
    }
}
