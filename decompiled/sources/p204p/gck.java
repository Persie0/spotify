package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gck implements ick {
    public static final Parcelable.Creator<gck> CREATOR = new dnj(27);

    /* JADX INFO: renamed from: a */
    public final long f78611a;

    public gck(long j) {
        this.f78611a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gck) && this.f78611a == ((gck) obj).f78611a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f78611a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f78611a);
    }
}
