package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ufz extends vfz {
    public static final Parcelable.Creator<ufz> CREATOR = new c2z(24);

    /* JADX INFO: renamed from: a */
    public final int f229930a;

    public ufz(int i) {
        this.f229930a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufz) && this.f229930a == ((ufz) obj).f229930a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f229930a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f229930a != 1) {
            throw null;
        }
        parcel.writeString("MOST_RECENT");
    }
}
