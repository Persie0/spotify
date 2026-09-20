package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class xca0 implements n4y {
    public static final Parcelable.Creator<xca0> CREATOR = new z8a0(16);

    /* JADX INFO: renamed from: a */
    public final int f260174a;

    public xca0(int i) {
        this.f260174a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xca0) && this.f260174a == ((xca0) obj).f260174a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260174a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260174a);
    }
}
