package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wl21 implements Parcelable {
    public static final Parcelable.Creator<wl21> CREATOR = new q321(20);

    /* JADX INFO: renamed from: a */
    public final ol21 f252351a;

    public wl21(ol21 ol21Var) {
        this.f252351a = ol21Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl21) && this.f252351a == ((wl21) obj).f252351a;
    }

    public final int hashCode() {
        return this.f252351a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252351a.name());
    }
}
