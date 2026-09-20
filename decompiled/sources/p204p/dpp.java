package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class dpp implements Parcelable {
    public static final Parcelable.Creator<dpp> CREATOR = new lso(2);

    /* JADX INFO: renamed from: a */
    public final boolean f51378a;

    public dpp(boolean z) {
        this.f51378a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpp) && this.f51378a == ((dpp) obj).f51378a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51378a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51378a ? 1 : 0);
    }
}
