package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class wre0 implements zre0 {
    public static final Parcelable.Creator<wre0> CREATOR = new ube0(12);

    /* JADX INFO: renamed from: a */
    public final boolean f254346a;

    public wre0(boolean z) {
        this.f254346a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wre0) && this.f254346a == ((wre0) obj).f254346a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254346a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f254346a ? 1 : 0);
    }
}
