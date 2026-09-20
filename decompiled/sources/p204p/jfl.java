package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jfl implements kfl {
    public static final Parcelable.Creator<jfl> CREATOR = new z4l(17);

    /* JADX INFO: renamed from: a */
    public final int f111934a;

    public jfl(int i) {
        this.f111934a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfl) && this.f111934a == ((jfl) obj).f111934a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111934a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111934a);
    }
}
