package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class u82 extends b92 {
    public static final Parcelable.Creator<u82> CREATOR = new zt1(18);

    /* JADX INFO: renamed from: a */
    public final boolean f227793a;

    public u82(boolean z) {
        this.f227793a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u82) && this.f227793a == ((u82) obj).f227793a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227793a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f227793a ? 1 : 0);
    }
}
