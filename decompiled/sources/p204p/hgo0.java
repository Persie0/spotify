package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class hgo0 extends mgo0 {
    public static final Parcelable.Creator<hgo0> CREATOR = new o2o0(29);

    /* JADX INFO: renamed from: a */
    public final boolean f91186a;

    public hgo0(boolean z) {
        this.f91186a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgo0) && this.f91186a == ((hgo0) obj).f91186a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91186a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f91186a ? 1 : 0);
    }
}
