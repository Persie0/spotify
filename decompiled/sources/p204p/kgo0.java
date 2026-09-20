package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class kgo0 extends mgo0 {
    public static final Parcelable.Creator<kgo0> CREATOR = new igo0(1);

    /* JADX INFO: renamed from: a */
    public final boolean f122427a;

    public kgo0(boolean z) {
        this.f122427a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgo0) && this.f122427a == ((kgo0) obj).f122427a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122427a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122427a ? 1 : 0);
    }
}
