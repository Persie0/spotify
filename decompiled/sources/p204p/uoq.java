package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uoq implements Parcelable {
    public static final Parcelable.Creator<uoq> CREATOR = new lso(8);

    /* JADX INFO: renamed from: a */
    public final boolean f232503a;

    public uoq(boolean z) {
        this.f232503a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uoq) && this.f232503a == ((uoq) obj).f232503a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232503a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f232503a ? 1 : 0);
    }
}
