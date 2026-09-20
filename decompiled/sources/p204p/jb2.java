package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jb2 extends ob2 {
    public static final Parcelable.Creator<jb2> CREATOR = new zt1(28);

    /* JADX INFO: renamed from: a */
    public final int f110630a;

    public jb2(int i) {
        this.f110630a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb2) && this.f110630a == ((jb2) obj).f110630a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110630a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110630a);
    }
}
