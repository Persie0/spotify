package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ztf extends duf {
    public static final Parcelable.Creator<ztf> CREATOR = new rae(17);

    /* JADX INFO: renamed from: a */
    public final int f286152a;

    public ztf(int i) {
        this.f286152a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztf) && this.f286152a == ((ztf) obj).f286152a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f286152a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f286152a);
    }
}
