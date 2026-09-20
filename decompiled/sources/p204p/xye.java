package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xye implements s511 {
    public static final Parcelable.Creator<xye> CREATOR = new rae(9);

    /* JADX INFO: renamed from: a */
    public final boolean f267305a;

    public xye(boolean z) {
        this.f267305a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xye) && this.f267305a == ((xye) obj).f267305a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267305a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f267305a ? 1 : 0);
    }
}
