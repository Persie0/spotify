package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xw30 extends fx30 {
    public static final Parcelable.Creator<xw30> CREATOR = new bw30(19);

    /* JADX INFO: renamed from: c */
    public final boolean f266565c;

    public xw30(boolean z) {
        super(11, 2);
        this.f266565c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw30) && this.f266565c == ((xw30) obj).f266565c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266565c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f266565c ? 1 : 0);
    }
}
