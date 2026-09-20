package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class lgo0 extends mgo0 {
    public static final Parcelable.Creator<lgo0> CREATOR = new igo0(2);

    /* JADX INFO: renamed from: a */
    public final boolean f133255a;

    public lgo0(boolean z) {
        this.f133255a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgo0) && this.f133255a == ((lgo0) obj).f133255a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133255a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f133255a ? 1 : 0);
    }
}
