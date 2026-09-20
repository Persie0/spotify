package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ppb0 implements rpb0 {
    public static final Parcelable.Creator<ppb0> CREATOR = new apb0(9);

    /* JADX INFO: renamed from: a */
    public final int f180003a;

    public ppb0(int i) {
        this.f180003a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppb0) && this.f180003a == ((ppb0) obj).f180003a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180003a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f180003a);
    }
}
