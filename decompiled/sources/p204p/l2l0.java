package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class l2l0 extends z2l0 {
    public static final Parcelable.Creator<l2l0> CREATOR = new oxk0(13);

    /* JADX INFO: renamed from: a */
    public final int f129036a;

    public l2l0(int i) {
        this.f129036a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2l0) && this.f129036a == ((l2l0) obj).f129036a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129036a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f129036a);
    }
}
