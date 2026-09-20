package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class g01 extends z01 {
    public static final Parcelable.Creator<g01> CREATOR = new zz0(6);

    /* JADX INFO: renamed from: a */
    public final boolean f75231a;

    public g01(boolean z) {
        this.f75231a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g01) && this.f75231a == ((g01) obj).f75231a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75231a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75231a ? 1 : 0);
    }
}
