package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eks implements Parcelable {
    public static final Parcelable.Creator<eks> CREATOR = new f9s(8);

    /* JADX INFO: renamed from: a */
    public final long f60529a;

    public eks(long j) {
        this.f60529a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eks) && this.f60529a == ((eks) obj).f60529a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60529a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f60529a);
    }
}
