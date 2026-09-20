package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wfr0 implements Parcelable {
    public static final Parcelable.Creator<wfr0> CREATOR = new vzq0(23);

    /* JADX INFO: renamed from: a */
    public final boolean f250883a;

    public wfr0(boolean z) {
        this.f250883a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfr0) && this.f250883a == ((wfr0) obj).f250883a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250883a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f250883a ? 1 : 0);
    }
}
