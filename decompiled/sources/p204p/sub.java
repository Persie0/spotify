package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sub implements Parcelable {
    public static final Parcelable.Creator<sub> CREATOR = new jja(16);

    /* JADX INFO: renamed from: a */
    public final long f214045a;

    public sub(long j) {
        this.f214045a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sub) && this.f214045a == ((sub) obj).f214045a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214045a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f214045a);
    }
}
