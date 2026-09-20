package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class bgo0 extends mgo0 {
    public static final Parcelable.Creator<bgo0> CREATOR = new o2o0(23);

    /* JADX INFO: renamed from: a */
    public final boolean f26980a;

    public bgo0(boolean z) {
        this.f26980a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgo0) && this.f26980a == ((bgo0) obj).f26980a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26980a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26980a ? 1 : 0);
    }
}
