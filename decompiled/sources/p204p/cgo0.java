package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class cgo0 extends mgo0 {
    public static final Parcelable.Creator<cgo0> CREATOR = new o2o0(24);

    /* JADX INFO: renamed from: a */
    public final boolean f37753a;

    public cgo0(boolean z) {
        this.f37753a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgo0) && this.f37753a == ((cgo0) obj).f37753a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37753a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37753a ? 1 : 0);
    }
}
