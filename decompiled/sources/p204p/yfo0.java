package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class yfo0 extends mgo0 {
    public static final Parcelable.Creator<yfo0> CREATOR = new o2o0(20);

    /* JADX INFO: renamed from: a */
    public final boolean f272305a;

    public yfo0(boolean z) {
        this.f272305a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfo0) && this.f272305a == ((yfo0) obj).f272305a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272305a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f272305a ? 1 : 0);
    }
}
