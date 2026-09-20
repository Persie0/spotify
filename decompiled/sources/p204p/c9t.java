package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class c9t implements d9t {
    public static final Parcelable.Creator<c9t> CREATOR = new f9s(29);

    /* JADX INFO: renamed from: a */
    public final boolean f35653a;

    public c9t(boolean z) {
        this.f35653a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9t) && this.f35653a == ((c9t) obj).f35653a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35653a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35653a ? 1 : 0);
    }
}
